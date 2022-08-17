package com.my.maybank.submission.testsubmissionservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubmissionDTO {

    private String losRefId;

    @NotEmpty(message = "Please do not leave this field empty.")
    @Pattern(regexp = "[\\d]{3}", message = "This field should contain 3 digits.")
    private int applOrganization;

    @NotEmpty (message = "Please enter the submission date.")
    private Date applSubmissionDate;

    @NotEmpty (message = "Please specify the package code.")
    private String applPackageCode;

    private String applPromoCode;

    @NotEmpty (message = "Please specify the reference number.")
    private String applReferenceNo;

    private String applReferralCode;

    @NotEmpty (message = "Please specify the type code.")
    private String applTypeCode;

    private String Status;
}
