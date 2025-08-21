package zade.samir.JobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zade.samir.JobApp.model.JobPost;
import zade.samir.JobApp.repo.JobRepo;

@Service
public class JobService {
	
	@Autowired
	private JobRepo repo;
	
	public void addJob(JobPost jobPost) {
		repo.addJob(jobPost);
	}
	
	public List<JobPost> getAllJobs() {
		return repo.getAllJobs();
	}
}

















