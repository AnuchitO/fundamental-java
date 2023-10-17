package dev.anuchito.exchange;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/rates")
public class ExchangeRateController {

	@GetMapping("/latest")
	public String getLatestRate() {
		return "hi anuchito yoru latest rate is here";
	}

}
