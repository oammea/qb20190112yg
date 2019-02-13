package com.bean;

public class Emp {
	//e_id e_name e_sex e_idcard e_age e_dept e_job
	private Integer e_id;
	private String e_name;
	private String e_sex;
	private String e_idcard;
	private String e_age;
	private String e_dept;
	private String e_job;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(Integer e_id, String e_name, String e_sex, String e_idcard, String e_age, String e_dept, String e_job) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_sex = e_sex;
		this.e_idcard = e_idcard;
		this.e_age = e_age;
		this.e_dept = e_dept;
		this.e_job = e_job;
	}
	@Override
	public String toString() {
		return "Emp [e_id=" + e_id + ", e_name=" + e_name + ", e_sex=" + e_sex + ", e_idcard=" + e_idcard + ", e_age="
				+ e_age + ", e_dept=" + e_dept + ", e_job=" + e_job + "]";
	}
	public Integer getE_id() {
		return e_id;
	}
	public void setE_id(Integer e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_sex() {
		return e_sex;
	}
	public void setE_sex(String e_sex) {
		this.e_sex = e_sex;
	}
	public String getE_idcard() {
		return e_idcard;
	}
	public void setE_idcard(String e_idcard) {
		this.e_idcard = e_idcard;
	}
	public String getE_age() {
		return e_age;
	}
	public void setE_age(String e_age) {
		this.e_age = e_age;
	}
	public String getE_dept() {
		return e_dept;
	}
	public void setE_dept(String e_dept) {
		this.e_dept = e_dept;
	}
	public String getE_job() {
		return e_job;
	}
	public void setE_job(String e_job) {
		this.e_job = e_job;
	}
	
}
