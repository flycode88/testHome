package com.controller;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.po.Login;
import com.service.LoginService;

@Controller
public class LoginControl {
	
	@Autowired

	private LoginService loginService;

	/**
	 * 验证登录
	 * 
	 * @param login
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/Login")
	public String login(Login login, Model model, HttpSession session) {
		Login loginx = loginService.cheak(login);
		System.out.println(loginx);
		if (loginx != null) {
			session.setAttribute("login", loginx);
			return "redirect:/admin/main.jsp";
		} else {
			model.addAttribute("msg", "登录失败");
			return "Login";
		}
		

	}

	/**
	 * 查看管理员信息
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/findadmin")
	public String findadmin(HttpSession session) {
		List<Login> lg = loginService.findadmin();
		session.setAttribute("admin", lg);
		return "redirect:/admin/admininfo.jsp";

	}

	/**
	 * 
	 * 修改管理员密码
	 * 
	 * @param session
	 * @param login
	 * @return
	 */
	@RequestMapping(value = "/updatepwd")
	public String updatepwd(HttpSession session, Login login) {
		Login lg = (Login) session.getAttribute("login");// 获取登录的信息并转换类型

		login.setId(lg.getId());// 获取ID
		loginService.updatepwd(login);

		return "redirect:/admin/Login.jsp";

	}
	
	/**
	 * 增加新用户
	 * @param p
	 * @return
	 */

	@RequestMapping(value = "/newuser")
	public String newuser(Login p) {
		loginService.newuser(p);

		return "forward:admin/Login.jsp";

	}
	
	/*
	 * 获取验证码
	 * 
	 */
	@RequestMapping("/getVerifyCode")
    public void generate(HttpServletResponse response, HttpSession session) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        String verifyCodeValue = drawImg(output);
        // 将校验码保存到session中
        session.setAttribute("verifyCodeValue", verifyCodeValue);

        try {
            ServletOutputStream out = response.getOutputStream();
            output.writeTo(out);
        } catch (IOException e) {
           // logger.info("<--验证码前端写出.出现异常-->");
            e.printStackTrace();

        }
    }
	/**
	 * 
	 * 绘制验证码
	 * 
	 */

	private String drawImg(ByteArrayOutputStream output) {
		 String code = "";
	        // 随机产生4个字符
	        for (int i = 0; i < 4; i++) {
	            code += randomChar();
	        }
	        int width = 70;
	        int height = 25;
	        BufferedImage bi = new BufferedImage(width, height,
	                BufferedImage.TYPE_3BYTE_BGR);
	        Font font = new Font("Times New Roman", Font.PLAIN, 20);
	        // 调用Graphics2D绘画验证码
	        Graphics2D g = bi.createGraphics();
	        g.setFont(font);
	        Color color = new Color(66, 2, 82);
	        g.setColor(color);
	        g.setBackground(new Color(226, 226, 240));
	        g.clearRect(0, 0, width, height);
	        FontRenderContext context = g.getFontRenderContext();
	        Rectangle2D bounds = font.getStringBounds(code, context);
	        double x = (width - bounds.getWidth()) / 2;
	        double y = (height - bounds.getHeight()) / 2;
	        double ascent = bounds.getY();
	        double baseY = y - ascent;
	        g.drawString(code, (int) x, (int) baseY);
	        g.dispose();
	        try {
	            ImageIO.write(bi, "jpg", output);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		return code;
	}
	//获取随机参数
	private char randomChar() {
		 Random r = new Random();
	        String s = "ABCDEFGHJKLMNPRSTUVWXYZ0123456789";
	        return s.charAt(r.nextInt(s.length()));
	}
	

	

	 
	
}
