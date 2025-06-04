package com.anuchito.database.loan;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Objects;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping
    public List<Loan> getAllLoans() {
        return this.loanService.getAllLoans();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Loan> getLoanById(@PathVariable Long id) {
        return loanService.getLoanById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Loan> createLoan(@RequestBody Loan loan) {
        Loan createdLoan = loanService.saveLoan(loan);
        return ResponseEntity.ok(createdLoan);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Loan> updateLoan(@PathVariable Long id, @RequestBody Loan loan) {
        return loanService.getLoanById(id)
                .map(existingLoan -> {
                    loan.setId(id);
                    return ResponseEntity.ok(loanService.saveLoan(loan));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Loan> partialUpdateLoan(@PathVariable Long id, @RequestBody Loan loan) {
        return loanService.getLoanById(id)
                .map(existingLoan -> {
                    if (loan.getLoanId() != null) existingLoan.setLoanId(loan.getLoanId());
                    if (loan.getApplicantName() != null) existingLoan.setApplicantName(loan.getApplicantName());
                    if (Objects.nonNull(loan.getLoanAmount())) existingLoan.setLoanAmount(loan.getLoanAmount());
                    if (Objects.nonNull(loan.getLoanTerm())) existingLoan.setLoanTerm(loan.getLoanTerm());
                    if (Objects.nonNull(loan.getInterestRate())) existingLoan.setInterestRate(loan.getInterestRate());
                    if (Objects.nonNull(loan.getStatus())) existingLoan.setStatus(loan.getStatus());

                    return ResponseEntity.ok(loanService.saveLoan(existingLoan));
                })
                .orElse(ResponseEntity.notFound().build());
    }
}