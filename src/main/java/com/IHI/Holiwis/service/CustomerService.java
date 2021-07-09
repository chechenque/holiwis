package com.IHI.Holiwis.service;

import java.util.List;

import com.IHI.Holiwis.dto.Customer;
import com.IHI.Holiwis.dto.RespuestaApi;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	public Customer getCustomer(int id);
	public RespuestaApi createCustomer(Customer customer);
	public RespuestaApi updateCustomer(Customer customer, int id);
	public RespuestaApi deleteCustomer(int id);
}
