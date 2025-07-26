package com.pm.jobapp.service;

import com.pm.jobapp.model.JobPost;
import com.pm.jobapp.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private JobRepository repository;

    public JobService(JobRepository repository) {
        this.repository = repository;
    }

    //method to return all JobPosts
    public List<JobPost> returnAllJobPosts() {
        return repository.returnAllJobPosts();
    }

    // method to add a jobPost
    public void addJobPost(JobPost jobPost) {
        repository.addJobPost(jobPost);
    }

}
