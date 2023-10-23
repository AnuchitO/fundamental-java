package dev.anuchito.exchange;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/exchanges")
public class ExchangeRateController {

	/**
	 * 1. **Get Real-time Exchanges Rates:**
	 * Requirement:** This endpoint allows users to retrieve the latest exchanges
	 * rates for a base currency against multiple target currencies.
	 * Method:** `GET`**URL:** `/rates`
	 * Response:**
	 * JSON**: ExchangeResponse.java
	 * ```
	 * {
	 * "base": "USD",
	 * "rates": {
	 * "EUR": 0.95,
	 * "GBP": 0.85,
	 * "JPY": 135.00,
	 * "THB": 36.46
	 * }
	 * }
	 */

	@GetMapping("/rates")
	public ExchangeResponse getLatestRate() {
		List<Rate> exhangeRate = List.of(new Rate("EUR", 0.95), new Rate("GBP", 0.85), new Rate("JPY", 135.00),
				new Rate("THB", 36.46));

		Map<String, Double> rates = exhangeRate.stream().map(rate -> Map.entry(rate.getCurrencyCode(), rate.getRate()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		return new ExchangeResponse("USD", rates);
	}
}
