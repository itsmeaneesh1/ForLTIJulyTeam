package com.lti.repository;

import org.springframework.stereotype.Repository;

import com.lti.model.Customer;

@Repository
public class CustomerDAO
{

	public boolean resisterCustomer(Customer customer)
	{
		System.out.println("Customer Data from DAO :\n"+customer);
		//Persistance Code....JPA /HIBER/ JDBCTemplate / JDBC....
		return false;
		
	}
}
