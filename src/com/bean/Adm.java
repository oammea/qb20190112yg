package com.bean;

public class Adm {
	//adm_id adm_name adm_password
	private Integer adm_id;
	private String adm_name;
	private String adm_password;
	public Adm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adm(Integer adm_id, String adm_name, String adm_spassword) {
		super();
		this.adm_id = adm_id;
		this.adm_name = adm_name;
		this.adm_password = adm_spassword;
	}
	@Override
	public String toString() {
		return "Adm [adm_id=" + adm_id + ", adm_name=" + adm_name + ", adm_password=" + adm_password + "]";
	}
	public Integer getAdm_id() {
		return adm_id;
	}
	public void setAdm_id(Integer adm_id) {
		this.adm_id = adm_id;
	}
	public String getAdm_name() {
		return adm_name;
	}
	public void setAdm_name(String adm_name) {
		this.adm_name = adm_name;
	}
	public String getAdm_password() {
		return adm_password;
	}
	public void setAdm_password(String adm_spassword) {
		this.adm_password = adm_spassword;
	}

	
}
