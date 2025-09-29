package com.jobPortal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobPortal.DTO.AnalyticsResponse;
import com.jobPortal.Service.AnalyticsService;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {

	@Autowired
	private AnalyticsService analyticsService;
	
	@GetMapping("/summary")
	public ResponseEntity<AnalyticsResponse> getSummary(){
		return ResponseEntity.ok(analyticsService.collectData());
	}
}
