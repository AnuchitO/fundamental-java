package dev.anuchito.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class LoanController {

	@GetMapping("/loans/{id}")
	public Loan getLoan(@PathVariable("id") String id) {
		System.out.println("Path id: " + id);

		Loan loan = new Loan();
		loan.setLoanId("L001");
		loan.setApplicantName("Laumcing");
		loan.setLoanAmount(1000000);
		loan.setLoanTerm(12);
		loan.setStatus("Approved");
		loan.setInterestRate(7.5);

		return loan;
	}
}
