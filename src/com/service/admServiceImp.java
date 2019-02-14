package com.service;

import java.util.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Adm;
import com.bean.Emp;
import com.dao.InterfaceAdmDao;

@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
public class admServiceImp implements InterfaceAdmService{

	@Override
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=true)
	public Adm findByNameAndPWD(Adm a) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceAdmDao iad = ac.getBean(InterfaceAdmDao.class);
		ac.close();
		return iad.findByNameAndPWD(a);
	}

	@Override
	public Integer addEmp(Emp e) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceAdmDao iad = ac.getBean(InterfaceAdmDao.class);
		ac.close();
		return iad.addEmp(e);
	}

	@Override
	public Emp findByName(String e_name) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceAdmDao iad = ac.getBean(InterfaceAdmDao.class);
		ac.close();
		return iad.findByName(e_name);
	}

	@Override
	public List<Map> findList() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceAdmDao iad = ac.getBean(InterfaceAdmDao.class);
		ac.close();
		return iad.findList();
	}

	@Override
	public List<Map> findListByPg(Integer currentPage, Integer pageSize) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceAdmDao iad = ac.getBean(InterfaceAdmDao.class);
		ac.close();
		return iad.findListByPg(getfirst(currentPage,pageSize),getlast(currentPage,pageSize));
	}

	private Integer getlast(Integer currentPage, Integer pageSize) {
		// TODO Auto-generated method stub
		System.out.println("last:"+currentPage*pageSize);
		return currentPage*pageSize;
	}

	private Integer getfirst(Integer currentPage, Integer pageSize) {
		// TODO Auto-generated method stub
		System.out.println("first:"+(currentPage-1)*pageSize+1);
		return (currentPage-1)*pageSize+1;
	}

	
}
