package com.jobPortal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobPortal.DTO.SubscriptionPlanDTO;
import com.jobPortal.Service.SubscriptionPlanService;

@RestController
@RequestMapping("/api/subscription_plans")
public class SubscriptionPlanController {
	
	@Autowired
	private SubscriptionPlanService  subscriptionPlanService;
	
	
	@GetMapping
	public ResponseEntity<List<SubscriptionPlanDTO>>getAll(){
		return ResponseEntity.ok(subscriptionPlanService.getAllSubscriptionPlans());
	}
	
	@PostMapping
	public ResponseEntity<SubscriptionPlanDTO> create(@RequestParam SubscriptionPlanDTO dto) {
		return ResponseEntity.ok(subscriptionPlanService.createSubscription(dto));
	}

}

