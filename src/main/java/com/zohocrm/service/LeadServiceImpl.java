package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Lead;
import com.zohocrm.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void create(Lead lead) {
		leadRepo.save(lead);
	}

	@Override
	public Lead getById(Long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteById(Long id) {
		leadRepo.deleteById(id);
	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead> findAll = leadRepo.findAll();
		return findAll;
	}
}
