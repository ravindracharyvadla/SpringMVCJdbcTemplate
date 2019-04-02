package com.companyname.dao;
import org.springframework.jdbc.core.JdbcTemplate;    

import com.companyname.model.Employee;

public class EmployeeDAO {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveEmployee(Employee e){
		
		String insertQuery="insert into employee_table(employeeid,employeename,emailid,contactnumber) values("+e.getEmployeeId()+",'"+e.getEmployeeName()+"','"+e.getEmailId()+"','"+e.getContactNumber()+"')";
		
		return jdbcTemplate.update(insertQuery);
	}
	
}
