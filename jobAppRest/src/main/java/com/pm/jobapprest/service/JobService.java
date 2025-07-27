package com.pm.jobapprest.service;

import com.pm.jobapprest.model.JobPost;
import com.pm.jobapprest.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private JobRepository repository;

    public JobService(JobRepository repository) {
        this.repository = repository;
    }

    //method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repository.getAllJobs();
    }

    public JobPost getJob(int postId) {
        return repository.getJob(postId);
    }

    // method to add a jobPost
    public void addJob(JobPost jobPost) {
        repository.addJobPost(jobPost);
    }

    public void updateJob(JobPost jobPost) {
        repository.updateJob(jobPost);
    }

    public void deleteJob(int postId) {
        repository.deleteJob(postId);

    }

}
