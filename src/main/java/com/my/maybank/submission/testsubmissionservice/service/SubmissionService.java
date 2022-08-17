package com.my.maybank.submission.testsubmissionservice.service;

import com.my.maybank.submission.testsubmissionservice.entity.Submission;

import java.util.List;

public interface SubmissionService {

    // Save operation
    Submission saveSubmission(Submission submission);

    // Read operation (getAll)
    List<Submission> getSubmissionList();

    // Read operation (byID)
    Submission findBylosRefId(Long losRefId);

    // Update operation
    Submission updateSubmission(Submission submission, Long losRefId);
}
