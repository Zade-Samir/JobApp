package zade.samir.JobApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import zade.samir.JobApp.model.JobPost;
import zade.samir.JobApp.service.JobService;

@Controller
public class JobController {
	
	@Autowired
	private JobService service;
	
	@GetMapping({"/", "home"})
	public String home() {
		return "home";
	}
	
	@GetMapping("addjob")
	public String addJob() {
		return "addjob";
	}
	
	@PostMapping("handleForm")
	public String handleForm(JobPost jobPost) {
		service.addJob(jobPost);
		return "success";
	}
	
	@GetMapping("viewalljobs")
	public String viewJobs(Model model) {
		List<JobPost> jobs = service.getAllJobs();
		model.addAttribute("jobPosts", jobs);
		return "viewalljobs";
	}

}










