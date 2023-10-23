package dev.anuchito.exchange;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/exchanges")
public class ExchangeRateController {

	@GetMapping("/rates")
	public ExchangeResponse getLatestRate() {
		List<Rate> rat = List.of(new Rate("EUR", 0.95), new Rate("GBP", 0.85), new Rate("JPY", 135.00),
				new Rate("THB", 36.46));

		Map<String, Double> rates = rat.stream().collect(java.util.stream.Collectors.toMap(Rate::getCurrencyCode,
				Rate::getRate, (oldValue, newValue) -> oldValue));
		return new ExchangeResponse("USD", rates);
	}
}
