package com.jobiak.imd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.imd.model.Customer;
import com.jobiak.imd.repository.CustomerRepo;

@Controller
public class CustomerController {

	@Autowired
	CustomerRepo repo;
	
	
	
	
	
	

	public CustomerController() {
		// TODO Auto-generated constructor stub
	}

	public CustomerController(CustomerRepo repo) {
		
		this.repo = repo;
	}

	@RequestMapping(path="/test",method = RequestMethod.GET)
	public String redirect()
	{
		return "login";
	}
	
	@RequestMapping(path="/login",method = RequestMethod.POST)
	public String doSignUp(@ModelAttribute("user")Customer user)
	{
		repo.save(user);
		return "success";
		
		
		
		
	}
	
}

