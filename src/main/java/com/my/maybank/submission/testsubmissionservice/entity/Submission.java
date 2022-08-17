package com.my.maybank.submission.testsubmissionservice.entity;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tblSubmission")
public class Submission {

    @Id
    @GeneratedValue
    @Column(name = "losResId")
    private long losRefId;

    @Column(name = "applOrganization")
    private int applOrganization;

    @Column(name = "applSubmissionDate")
    private Date applSubmissionDate;

    @Column(name = "applPackageCode")
    private String applPackageCode;

    @Column(name = "applPromoCode")
    private String applPromoCode;

    @Column(name = "applReferenceNo")
    private String applReferenceNo;

    @Column(name = "applReferralCode")
    private String applReferralCode;

    @Column(name = "applTypeCode")
    private String applTypeCode;

    @Column(name = "status")
    private String Status;
}
