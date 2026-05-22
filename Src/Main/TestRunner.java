package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.sbeans.Employee;
@Component
public class TestRunner  implements CommandLineRunner
{
	@Autowired
	private Employee employee;

	@Override
	public void run(String... args) throws Exception 
	{
		System.out.println("Application Started");
		System.out.println(employee.getEmpid());
	    System.out.println(employee.getName());
	    System.out.println(employee.getSal());
	}

}
