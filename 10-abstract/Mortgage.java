public class Mortgage extends BaseLoan implements Payment {

	public Mortgage(String applicantName) {
		super(applicantName);
	}

	public Mortgage(String applicantName, double loanAmount, float interestRate) {
		super(applicantName, loanAmount, interestRate);
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
