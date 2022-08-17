package com.my.maybank.submission.testsubmissionservice.controller;

import com.my.maybank.submission.testsubmissionservice.dto.SubmissionDTO;
import com.my.maybank.submission.testsubmissionservice.entity.Submission;
import com.my.maybank.submission.testsubmissionservice.mapper.SubmissionMapper;
import com.my.maybank.submission.testsubmissionservice.service.SubmissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor

@RestController
@RequestMapping("/api/submission")
public class SubmissionController {

    @Autowired
    SubmissionService submissionService;
    @Autowired
    SubmissionMapper submissionMapper;

//    @PostMapping("/saveSubmission")
//    public ResponseEntity<SubmissionResponseDTO> create(@RequestBody SubmissionRequestDTO submissionDTO) {
//        return ResponseEntity.ok(submissionService.save(submissionDTO));
//    }
//
//    @GetMapping("/get/all")
//    public ResponseEntity<List<SubmissionDTO>> findAll() {
//        return ResponseEntity.ok(submissionMapper.toSubmissionDTOs(submissionService.findAll()));
//    }
//
//    @GetMapping("/get/{id}")
//    public ResponseEntity<SubmissionDTO> findById(@PathVariable long id) {
//        Optional<Submission> submission = submissionService.findBylosRefId(id);
//        return ResponseEntity.ok(submissionMapper.toSubmissionDTO(submission.get()));
//    }

    // Save operation
    @PostMapping("/saveSubmission")
    @ResponseStatus(HttpStatus.OK)
    public SubmissionDTO saveSubmission(@Valid @RequestBody Submission submission) {
        return submissionMapper.entityToDTO(submissionService.saveSubmission(submission));
    }

    // Read operation (getAll)
    @GetMapping("/get/all")
    @ResponseStatus(HttpStatus.OK)
    public List<SubmissionDTO> getSubmissionList() {
        return submissionMapper.entityToDTOList(submissionService.getSubmissionList());
    }

    // Read operation (byID)
    @GetMapping("/get/{id}")
    @ResponseStatus(HttpStatus.OK)
    public SubmissionDTO findById(@PathVariable("id") Long losRefId) {
        return submissionMapper.entityToDTO(submissionService.findBylosRefId(losRefId));
    }

    // Update operation
    @PostMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public SubmissionDTO updateSubmission(@RequestBody Submission submission, @PathVariable("id") Long losRefId) {
        return submissionMapper.entityToDTO(submissionService.updateSubmission(submission, losRefId));
    }
}
