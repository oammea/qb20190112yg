package com.dao;

import com.bean.Adm;
import com.bean.Emp;

public interface InterfaceAdmDao {
	public Adm findByNameAndPWD(Adm a);
	public Integer addEmp(Emp e);
	public Emp findByName(String e_name);
}
