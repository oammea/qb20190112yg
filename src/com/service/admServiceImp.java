package com.service;

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
	
}
