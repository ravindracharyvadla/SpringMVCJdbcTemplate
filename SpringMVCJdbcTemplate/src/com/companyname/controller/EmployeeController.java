package com.companyname.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.companyname.dao.EmployeeDAO;
import com.companyname.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDAO employeeDAO;
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String m1()
	{
		return "registrationInputPage";
	}
	
	@RequestMapping(value="/registration",method=RequestMethod.POST)
	public String m2(@ModelAttribute("e") Employee e)
	{
		
		employeeDAO.saveEmployee(e);
		
		return "registrationOutputPage";
	}
}
