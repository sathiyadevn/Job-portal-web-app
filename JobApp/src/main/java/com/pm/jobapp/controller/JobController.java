package com.pm.jobapp.controller;

import com.pm.jobapp.model.JobPost;
import com.pm.jobapp.service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    private JobService service;

    public JobController(JobService service) {
        this.service = service;
    }

    @RequestMapping({"/","/home"})
    public String home() {
        return "home";
    }

    @RequestMapping("/addjob")
    public String addJob() {
        return "addjob";
    }

    // controller method for getting all job posts
    @GetMapping("/viewalljobs")
    public String viewJobs(Model model) {

        List<JobPost> jobPosts = service.returnAllJobPosts();
        model.addAttribute("jobPosts", jobPosts);
        return "viewalljobs";
    }

    @PostMapping("/handleForm")
    public String handleAddJobForm(JobPost jobPost,Model model) {

        model.addAttribute("jobPost", jobPost);
        service.addJobPost(jobPost);
        //System.out.println(jobPost);
        return "success";

    }

}
