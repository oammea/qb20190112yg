package com.test;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bean.Adm;
import com.service.InterfaceAdmService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {
	@Resource(name="asi")
	private InterfaceAdmService ias;
	@org.junit.Test
	public void fun() {
		// TODO Auto-generated method stub
		Adm adm=new Adm(null, "admin", "admin");
		System.out.println(ias.findByNameAndPWD(adm).toString());
	}
	@org.junit.Test
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println(ias.findListByPg(2, 2));
	}
}
