package com.anuchito.loans.repository;

import com.anuchito.loans.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

    List<Loan> findByApplicantNameIgnoreCaseContaining(String name);

    List<Loan> findByLoanAmountGreaterThanEqual(BigDecimal amount);

    List<Loan> findByLoanTermGreaterThanEqual(Integer term);

    List<Loan> findByStatus(String status);

    Optional<Loan> findByLoanId(String loanId);

    void deleteByLoanId(String loanId);

    @Query("SELECT l FROM Loan l WHERE l.applicantName LIKE %:name% AND l.loanAmount >= :amount")
    List<Loan> findByApplicantNameAndAmount(@Param("name") String name, @Param("amount") BigDecimal amount);

    @Query("SELECT l FROM Loan l WHERE l.applicantName LIKE %:name% AND l.loanAmount >= :amount AND l.loanTerm >= :term")
    List<Loan> findByApplicantNameAndAmountAndTerm(
            @Param("name") String name,
            @Param("amount") BigDecimal amount,
            @Param("term") Integer term);

    @Query("SELECT l FROM Loan l WHERE l.applicantName LIKE %:name% AND l.loanAmount >= :amount AND l.loanTerm >= :term AND l.status = :status")
    List<Loan> findByApplicantNameAndAmountAndTermAndStatus(
            @Param("name") String name,
            @Param("amount") BigDecimal amount,
            @Param("term") Integer term,
            @Param("status") String status);


}
