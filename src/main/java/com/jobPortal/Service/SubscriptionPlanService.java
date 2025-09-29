package com.jobPortal.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobPortal.DTO.SubscriptionPlanDTO;
import com.jobPortal.Entity.SubscriptionPlan;
import com.jobPortal.Repository.SubscriptionPlanRepository;

@Service
public class SubscriptionPlanService {

	@Autowired
	private SubscriptionPlanRepository subscriptionPlanRepository;
	
	public List<SubscriptionPlanDTO>getAllSubscriptionPlans(){
		return subscriptionPlanRepository.findAll().stream().map(sub ->{
			SubscriptionPlanDTO dto = new SubscriptionPlanDTO();
			dto.id=sub.getId();
			dto.name=sub.getName();
			dto.maxJobs=sub.getMaxJobs();
			dto.maxProfiles=sub.getMaxProfiles();
			dto.validityDays=sub.getValidityDays();
			dto.prices=sub.getPrices();
			return dto;
		}).collect(Collectors.toList());
	}
	
	public SubscriptionPlanDTO createSubscription(SubscriptionPlanDTO dto) {
		SubscriptionPlan subcription= new SubscriptionPlan();
		subcription.setId(dto.id);
		subcription.setName(dto.name);
		subcription.setMaxJobs(dto.maxJobs);
		subcription.setMaxProfiles(dto.maxProfiles);
		subcription.setValidityDays(dto.validityDays);
		subcription.setPrices(dto.prices);
		
		SubscriptionPlan saved = subscriptionPlanRepository.save(subcription);
		dto.id= saved.getId();
		return dto;
	}
}

