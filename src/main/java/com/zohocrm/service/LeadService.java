package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface LeadService {

	public void create(Lead lead);
	
	public Lead getById(Long id);
	
	public void deleteById(Long id);

	public List<Lead> getAllLeads();

}
