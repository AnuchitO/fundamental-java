package com.anuchito.loans.controller;

import com.anuchito.loans.model.Loan;
import com.anuchito.loans.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/loans")
public class LoanController {
    private final LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping
    public ResponseEntity<List<Loan>> getAllLoans(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) BigDecimal amount,
            @RequestParam(required = false) Integer term,
            @RequestParam(required = false) String status) {

        if (name != null && amount != null && term != null && status != null) {
            return ResponseEntity.ok(loanService.findByApplicantNameAndAmountAndTermAndStatus(name, amount, term, status));
        } else if (name != null && amount != null && term != null) {
            return ResponseEntity.ok(loanService.findByApplicantNameAndAmountAndTerm(name, amount, term));
        } else if (name != null && amount != null) {
            return ResponseEntity.ok(loanService.findByApplicantNameAndAmount(name, amount));
        } else if (name != null) {
            return ResponseEntity.ok(loanService.findByApplicantName(name));
        } else if (amount != null) {
            return ResponseEntity.ok(loanService.findByAmount(amount));
        } else if (term != null) {
            return ResponseEntity.ok(loanService.findByTerm(term));
        } else if (status != null) {
            return ResponseEntity.ok(loanService.findByStatus(status));
        } else {
            return ResponseEntity.ok(loanService.findAll());
        }
    }

    @GetMapping("/{loanId}")
    public ResponseEntity<Loan> getLoanById(@PathVariable String loanId) {
        return loanService.findByLoanId(loanId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Loan> createLoan(@RequestBody Loan loan) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(loanService.createLoan(loan));
    }

    @PutMapping("/{loanId}")
    public ResponseEntity<Loan> updateLoan(@PathVariable String loanId, @RequestBody Loan loan) {
        if (!loanId.equals(loan.getLoanId())) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(loanService.updateLoan(loan));
    }

    @PatchMapping("/{loanId}")
    public ResponseEntity<Loan> partialUpdateLoan(@PathVariable String loanId, @RequestBody Loan loan) {
        if (!loanId.equals(loan.getLoanId())) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(loanService.updateLoan(loan));
    }

    @DeleteMapping("/{loanId}")
    public ResponseEntity<Void> deleteLoan(@PathVariable String loanId) {
        loanService.deleteLoan(loanId);
        return ResponseEntity.noContent().build();
    }
}
