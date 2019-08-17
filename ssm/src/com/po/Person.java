package com.po;

import java.util.Date;

public class Person {
	private int id;
	private String t_title;
	private String t_user;
	private String site ;
	private String t_time;
	private String audit;
	public Person() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getT_title() {
		return t_title;
	}
	public void setT_title(String t_title) {
		this.t_title = t_title;
	}
	public String getT_user() {
		return t_user;
	}
	public void setT_user(String t_user) {
		this.t_user = t_user;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getT_time() {
		return t_time;
	}
	public void setT_time(String t_time) {
		this.t_time = t_time;
	}
	public String getAudit() {
		return audit;
	}
	public void setAudit(String audit) {
		this.audit = audit;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", t_title=" + t_title + ", t_user=" + t_user + ", site=" + site + ", t_time="
				+ t_time + ", audit=" + audit + "]";
	}
	
}
