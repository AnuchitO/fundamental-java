package dev.anuchito.exchange;

public class Rate {
	private String currencyCode;
	private double rate;

	public Rate(String currencyCode, double rate) {
		super();
		this.currencyCode = currencyCode;
		this.rate = rate;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public double getRate() {
		return rate;
	}
}
