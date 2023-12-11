package dev.anuchito.demo;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class LoanController {

	@GetMapping("/loans")
	public List<Loan> getLoan() {
		Loan loan = new Loan();
		loan.setLoanId("L001");
		loan.setApplicantName("Anuchito");
		loan.setLoanAmount(1000000);
		loan.setLoanTerm(12);
		loan.setStatus("Approved");
		loan.setInterestRate(7.5);

		return List.of(loan);
	}
}
