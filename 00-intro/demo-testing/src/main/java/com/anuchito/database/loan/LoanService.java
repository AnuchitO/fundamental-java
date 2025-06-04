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

    public Optional<Loan> getLoanById(Long id) {
        return this.loanRepository.findById(id);
    }

    public Loan saveLoan(Loan loan) {
        return this.loanRepository.save(loan);
    }

    public void deleteLoan(Long id) {
        this.loanRepository.deleteById(id);
    }

}