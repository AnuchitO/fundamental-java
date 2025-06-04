package  com.anuchito.database.loan;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{loanId}")
    public Optional<Loan> getLoansByLoanId(@PathVariable String loanId) {
        return this.loanService.getLoanByLoanId(loanId);
    }
}