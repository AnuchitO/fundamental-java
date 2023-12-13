public class Auto extends BaseLoan implements Loan, Payment {
	private String applicantName;
	private double loanAmount;
	private float interestRate;

	public Auto(String applicantName) {
		this.applicantName = applicantName;
	}

	public Auto(String applicantName, double loanAmount, float interestRate) {
		this.applicantName = applicantName;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		System.out.println("Auto:: Interest()");
		return 4.4;
	}

	public String[] paymentOptions() {
		System.out.println("Auto:: paymentOptions()");
		return new String[] { "VISA", "MasterCard", "PromptPay", "Cash" };
	}
}
