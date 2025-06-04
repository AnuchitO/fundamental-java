package com.anuchito.database.loan;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "loan")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "loan_id", length = 50)
    private String loanId;

    @Column(name = "applicant_name")
    private String applicantName;

    @Column(name = "loan_amount")
    private double loanAmount;

    @Column(name = "loan_term")
    private int loanTerm;

    @Column(name = "status")
    private String status;

    @Column(name = "interest_rate")
    private double interestRate;
}
