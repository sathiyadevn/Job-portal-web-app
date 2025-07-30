package com.pm.jobapprest.repository;

import com.pm.jobapprest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<JobPost, Integer> {
    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);


    /* Without JPA

    // method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return jobs;
    }

    //method to get a job by postId
    public JobPost getJob(int postId) {
        for (JobPost job : jobs) {
            if (job.getPostId() == postId) {
                return job;
            }
        }
        return null;
    }

    // method to save a job post object into arrayList
    public void addJobPost(JobPost job) {
        jobs.add(job);
    }

    public void updateJob(JobPost jobPost) {
        for (JobPost jobPost1 : jobs) {
            if (jobPost1.getPostId() == jobPost.getPostId()) {

                jobPost1.setPostProfile(jobPost.getPostProfile());
                jobPost1.setPostDesc(jobPost.getPostDesc());
                jobPost1.setReqExperience(jobPost.getReqExperience());
                jobPost.setPostTechStack(jobPost.getPostTechStack());

            }
        }

    }

    public void deleteJob(int postId) {
        for (JobPost jobPost : jobs) {
            if (jobPost.getPostId() == postId) {
                jobs.remove(jobPost);
            }
        }

    }

     */

}
