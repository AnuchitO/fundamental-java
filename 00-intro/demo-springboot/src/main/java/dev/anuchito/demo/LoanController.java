package dev.anuchito.demo;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class LoanController {

	@GetMapping("/loan")
	public List<Loan> getLoan() {
		Loan loan = new Loan();
		loan.setLoanId("L001");
		loan.setApplicantName("Anuchito");
		loan.setLoanAmount(1000000);
		loan.setLoanTerm(12);
		loan.setStatus("Approved");
		loan.setInterestRate(7.5);

// 		String l = """{
// 	"loanId": "L001",
// 	"applicantName": "Laumcing",
// 	"loanAmount": 10000.000000,
// 	"loanTerm": 12,
// 	"status": "APPROVED",
// 	"interestRate": 7.500000
// }""";

		return List.of(loan);
	}
}
