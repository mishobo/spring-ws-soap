package com.husseinabdallah.dto;

import com.husseinabdallah.jubileeclaim.Claim;
import lombok.Data;

@Data
public class Visit {

    private int policyId;
    private String PolicyEffectiveDate;
    private String ClaimDate;
    private String Beneficiary;
    private String PrimaryDiagnosisICD10Code;
    private String CreatedByUsername;
    private String CreatedDate;
    private String FirstConsultationDate;
    private String ConditionStatus;

}
