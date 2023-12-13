public class Mortgage implements Loan {
	private String applicantName;
	private double loanAmount;
	private float interestRate;

	public Mortgage(String applicantName) {
		this.applicantName = applicantName;
	}

	public Mortgage(String applicantName, double loanAmount, float interestRate) {
		this.applicantName = applicantName;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		System.out.println("Mortgage:: Interest()");
		return 3.5;
	}

	public String[] paymentOptions() {
		System.out.println("Mortgage:: paymentOptions()");
		return new String[] { "PromptPay", "Cash" };
	}
}
