package com.my.maybank.submission.testsubmissionservice.repository;

import com.my.maybank.submission.testsubmissionservice.entity.Submission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmissionRepository extends JpaRepository<Submission, Long> {

}
