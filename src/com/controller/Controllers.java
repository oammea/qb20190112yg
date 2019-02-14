package com.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Adm;
import com.bean.Emp;

import com.service.InterfaceAdmService;
import net.sf.json.JSONObject;

@Controller
public class Controllers {
	@Resource(name="asi")
	private InterfaceAdmService ias;
	@RequestMapping(value="login.action")
	public ModelAndView login(Adm a) {
		ModelAndView mad= new ModelAndView();
		System.out.println(a.toString());
		if(ias.findByNameAndPWD(a)!=null){
			mad.addObject("list",ias.findList());
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
		mad.addObject("list",ias.findList());
		mad.setViewName("WEB-INF/access/main.jsp");
		return mad;
	}
	@RequestMapping(value="/ajaxname.action")
	public void ajaxname(HttpServletRequest request,HttpServletResponse response) {
		String parameter = request.getParameter("e_name");
		System.out.println("e_name:"+parameter);
		Emp emp = ias.findByName(parameter);
		System.out.println(emp);
		response.setContentType("application/x-json;charset=utf-8");
		JSONObject jsonObject=new JSONObject();
		if(emp!=null) {
			jsonObject.put("msg", "用户名已存在");
		}else {
			jsonObject.put("msg", "用户名可以使用");
		}
		try {
			jsonObject.write(response.getWriter());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value="pg.action")
	public ModelAndView pg(Emp e,Integer currentPage,Integer pageSize) {
		ModelAndView mad= new ModelAndView();
		System.out.println(e.toString());
		ias.addEmp(e);
		mad.addObject("add",true);
		mad.addObject("list",ias.findList());
		mad.setViewName("WEB-INF/access/main.jsp");
		return mad;
	}
}
