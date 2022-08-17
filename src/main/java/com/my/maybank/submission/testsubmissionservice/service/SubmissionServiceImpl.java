package com.my.maybank.submission.testsubmissionservice.service;

import com.my.maybank.submission.testsubmissionservice.entity.Submission;
import com.my.maybank.submission.testsubmissionservice.mapper.SubmissionMapper;
import com.my.maybank.submission.testsubmissionservice.repository.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubmissionServiceImpl implements SubmissionService {

    @Autowired
    SubmissionRepository submissionRepository;
    @Autowired
    SubmissionMapper submissionMapper;

//    public Submission save(SubmissionRequestDto submissionRequestDto) {
//        Submission submission = submissionMapper.toSubmission(submissionRequestDto);
//        return submissionRepository.save(submission);
//    }

    // Save operation
    @Override public Submission saveSubmission(Submission submission)
    {
        return submissionRepository.save(submission);
    }

    // Read operation
    @Override public List<Submission> getSubmissionList()
    {
        return submissionRepository.findAll();
    }

    @Override
    public Submission findBylosRefId(Long losRefId) {

        return submissionRepository.findById(losRefId).orElse(null);
    }

    // Update operation
    @Override
    public Submission
    updateSubmission(Submission submission, Long losRefId)
    {
        Submission submissionDB = submissionRepository.findById(losRefId).orElse(null);

        // Set Get
        submissionDB.setApplOrganization(submission.getApplOrganization());
        submissionDB.setApplSubmissionDate(submission.getApplSubmissionDate());
        submissionDB.setApplPackageCode(submission.getApplPackageCode());
        submissionDB.setApplPromoCode(submission.getApplPromoCode());
        submissionDB.setApplReferenceNo(submission.getApplReferenceNo());
        submissionDB.setApplReferralCode(submission.getApplReferralCode());
        submissionDB.setApplTypeCode(submission.getApplTypeCode());
        submissionDB.setStatus(submission.getStatus());

        return submissionRepository.save(submissionDB);
    }
}
