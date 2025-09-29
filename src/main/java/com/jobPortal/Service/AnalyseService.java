/*package com.jobPortal.job_portal.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.jobPortal.job_portal.DTO.ApplicationTrackDTO;
import com.jobPortal.job_portal.DTO.DashBoardDTO;

public class AnalyseService {

	public DashBoardDTO getSummery() {
		
		DashBoardDTO dto = new DashBoardDTO();
		
		dto.setTotalStudents(1000);
		dto.setTotalRecruiters(500);
		dto.setTotalJobs(400);
		dto.setTotalApplications(5000);
		
		return dto;
	}
	
	public List<ApplicationTrackDTO>getWeeklyApplicationsTracker(){
		
		List<ApplicationTrackDTO> tracker = new ArrayList<>();
		
		for(int i=6; i>=0; i--) {
			
			ApplicationTrackDTO dto = new ApplicationTrackDTO(); 
			
			dto.setDate(LocalDate.now().minusDays(i).toString());
			dto.setApplications(50+(long)(Math.random()*100));
			
			tracker.add(dto);
			
		}
		return tracker;
	}
	
}
*/


