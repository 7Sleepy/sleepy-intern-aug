package com.my.maybank.submission.testsubmissionservice.mapper;

import com.my.maybank.submission.testsubmissionservice.dto.SubmissionDTO;
import com.my.maybank.submission.testsubmissionservice.entity.Submission;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface SubmissionMapper {

    // Convert Entity to DTO
    SubmissionDTO entityToDTO(Submission submission);

    // Convert Entity List to DTO List
    List<SubmissionDTO> entityToDTOList(List<Submission> submission);

    // Convert DTO to Entity
    Submission dtoToEntity(SubmissionDTO submission);

    // Convert DTO List to Entity List
    List<Submission> dtoListToEntity(List<SubmissionDTO> submissions);
}
