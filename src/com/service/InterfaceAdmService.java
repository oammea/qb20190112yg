package com.service;

import java.util.*;

import com.bean.Adm;
import com.bean.Emp;

public interface InterfaceAdmService {
	public Adm findByNameAndPWD(Adm a);
	public Integer addEmp(Emp e);
	public Emp findByName(String e_name);
	public List<Map> findList();
	public List<Map> findListByPg(Integer currentPage, Integer pageSize);
}
