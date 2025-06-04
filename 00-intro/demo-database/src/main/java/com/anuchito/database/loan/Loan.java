package com.anuchito.database.loan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Loan {

    @Id
    private Long id;
    private String loanId;
    private String applicantName;
    private double loanAmount;
    private int loanTerm;
    private String status;
    private double interestRate;
}

