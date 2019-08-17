package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.po.Person;
import com.service.PersonService;

@Controller
public class PersonControl {
	@Autowired

	private PersonService personService;

	/*
	 * 
	 * 查找所有用户
	 */
	@RequestMapping(value = "/findall")
	public String findall(Model model) {
		List<Person> list = personService.findall();
		model.addAttribute("person", list);

		return "info";

	}
	/*
	 * 
	 * 根据ID删除用户
	 */

	@RequestMapping(value = "/delone")
	public String delone(int id) {
		personService.delone(id);

		return "redirect:findall.action";

	}
	/*
	 * 增加用户
	 */

	@RequestMapping(value = "/addone")
	public String addone(Person p) {
		personService.addone(p);
		return "forward:findall.action";

	}

	/*
	 * 根据id查找用户
	 * 
	 */
	@RequestMapping(value = "/getid")
	public String findById(int id, Model model) {
		model.addAttribute("person", personService.findById(id));

		return "updateinfo";

	}

	/*
	 * 
	 * 根据id修改用户
	 * 
	 */
	@RequestMapping(value = "/updateinfo")
	public String updateinfo(Person p, Model model) throws Exception {
		System.out.println("已进入");
		if (personService.updateinfo(p)) {
			p = personService.findById(p.getId());
			model.addAttribute("person", p);
			return "forward:findall.action";
		} else {

			return "/error.jsp";
		}

	}
	
}
