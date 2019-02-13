package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Adm;
import com.bean.Emp;
import com.service.InterfaceAdmService;

@Controller
public class Controllers {
	@Resource(name="asi")
	private InterfaceAdmService ias;
	@RequestMapping(value="login.action")
	public ModelAndView login(Adm a) {
		ModelAndView mad= new ModelAndView();
		System.out.println(a.toString());
		if(ias.findByNameAndPWD(a)!=null){
			mad.setViewName("WEB-INF/access/main.jsp");
		}else{
			mad.addObject("fail",true);
			mad.setViewName("index.jsp");
		}
		return mad;
	}
	@RequestMapping(value="reg.action")
	public ModelAndView reg(Emp e) {
		ModelAndView mad= new ModelAndView();
		System.out.println(e.toString());
		ias.addEmp(e);
		mad.addObject("add",true);
		mad.setViewName("WEB-INF/access/main.jsp");
		return mad;
	}ajaxname.action
}
