package dev.anuchito.exchange;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/exchanges")
public class ExchangeRateController {

	@GetMapping("/rates")
	public String getLatestRate() {
		return "hi anuchito yoru latest rate is here";
	}

}
