package com.anuchito.loans.service;

import com.anuchito.loans.model.Loan;
import com.anuchito.loans.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class LoanService {
    private final LoanRepository repository;

    @Autowired
    public LoanService(LoanRepository repository) {
        this.repository = repository;
    }

    public List<Loan> findAll() {
        return repository.findAll();
    }

    public Optional<Loan> findByLoanId(String loanId) {
        return repository.findByLoanId(loanId);
    }

    public Loan createLoan(Loan loan) {
        loan.setCreatedAt(LocalDateTime.now());
        loan.setUpdatedAt(LocalDateTime.now());
        return repository.save(loan);
    }

    public Loan updateLoan(Loan loan) {
        loan.setUpdatedAt(LocalDateTime.now());
        return repository.save(loan);
    }

    public void deleteLoan(String loanId) {
        repository.deleteByLoanId(loanId);
    }

    public List<Loan> findByApplicantName(String name) {
        return repository.findByApplicantNameIgnoreCaseContaining(name);
    }

    public List<Loan> findByAmount(BigDecimal amount) {
        return repository.findByLoanAmountGreaterThanEqual(amount);
    }

    public List<Loan> findByTerm(Integer term) {
        return repository.findByLoanTermGreaterThanEqual(term);
    }

    public List<Loan> findByStatus(String status) {
        return repository.findByStatus(status);
    }

    public List<Loan> findByApplicantNameAndAmount(String name, BigDecimal amount) {
        return repository.findByApplicantNameAndAmount(name, amount);
    }

    public List<Loan> findByApplicantNameAndAmountAndTerm(String name, BigDecimal amount, Integer term) {
        return repository.findByApplicantNameAndAmountAndTerm(name, amount, term);
    }

    public List<Loan> findByApplicantNameAndAmountAndTermAndStatus(String name, BigDecimal amount, Integer term, String status) {
        return repository.findByApplicantNameAndAmountAndTermAndStatus(name, amount, term, status);
    }
}
