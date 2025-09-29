/*package com.jobPortal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobPortal.job_portal.DTO.ApplicationTrackDTO;
import com.jobPortal.job_portal.DTO.DashBoardDTO;
import com.jobPortal.job_portal.Service.AnalyseService;

@RestController
@RequestMapping("/api/dashBoard")
public class AnalyseController {

	@Autowired
	private AnalyseService analyseService;
	
	@GetMapping("/summery")
	public ResponseEntity<DashBoardDTO>getSummery(){
		return ResponseEntity.ok(analyseService.getSummery());
	}
	
	@GetMapping("/applications/weekly")
	public ResponseEntity<List<ApplicationTrackDTO>>getWeeklyTrackers(){
		return ResponseEntity.ok(analyseService.getWeeklyApplicationsTracker());
	}
}
*/


