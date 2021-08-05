package com.lti.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Customer;

@Controller
public class CustomerController 
{
		@RequestMapping("/registerCustomer")
		public ModelAndView helloCust()
		{
			return new ModelAndView("register","cust",new Customer());
			
		}
		
		@RequestMapping("/register")
		public ModelAndView registerCust(HttpServletRequest req,HttpServletResponse res,
				@ModelAttribute("cust") Customer customer)
		{
			System.out.println("Data "+customer);
			
			return new ModelAndView("home");
		}
		
}
