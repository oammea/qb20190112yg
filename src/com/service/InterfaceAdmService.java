package com.service;

import com.bean.Adm;
import com.bean.Emp;

public interface InterfaceAdmService {
	public Adm findByNameAndPWD(Adm a);
	public Integer addEmp(Emp e);
}
