package dev.anuchito.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class LoanController {

	@GetMapping("/loan")
	public String getLoan() {
		return "Loan approved";
	}
}
