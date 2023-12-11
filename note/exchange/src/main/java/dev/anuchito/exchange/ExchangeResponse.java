package dev.anuchito.exchange;

import java.util.Map;

public class ExchangeResponse {
	private String base;
	private Map<String, Double> rates;

	public ExchangeResponse(String base, Map<String, Double> rates) {
		super();
		this.base = base;
		this.rates = rates;
	}

	public String getBase() {
		return base;
	}

	public Map<String, Double> getRates() {
		return rates;
	}
}