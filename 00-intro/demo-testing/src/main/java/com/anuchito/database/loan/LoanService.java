package  com.anuchito.database.loan;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    private final LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public List<Loan> getAllLoans() {
        return this.loanRepository.findAll();
    }

    public Optional<Loan> getLoanByLoanId(String loanId) {
        if (loanId == null || loanId.isEmpty()) {
            return Optional.empty();
        }
        if (loanId.length() > 20) {
            throw new IllegalArgumentException("Loan ID must not exceed 20 characters");
        }
        if (!loanId.matches("^[a-zA-Z0-9]+$")) {
            throw new IllegalArgumentException("Loan ID must be alphanumeric");
        }
        if (loanId.contains(" ")) {
            throw new IllegalArgumentException("Loan ID must not contain spaces");
        }
        return this.loanRepository.findByLoanId(loanId);
    }

    public Loan saveLoan(Loan loan) {
        return this.loanRepository.save(loan);
    }

    public void deleteLoan(Long id) {
        this.loanRepository.deleteById(id);
    }

}