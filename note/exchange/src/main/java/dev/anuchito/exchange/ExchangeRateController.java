package dev.anuchito.exchange;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

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
		Map<String, Double> rates = Map.of(
				"EUR", 0.95,
				"GBP", 0.85,
				"JPY", 135.00,
				"THB", 36.46);

		return new ExchangeResponse("USD", rates);
	}
}
