public class Loan {
	String applicantName;
	private double loanAmount;
	private double interestRate;

	public Loan(String applicantName, double loanAmount, double interestRate) {
		this.applicantName = applicantName;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
	}

	double calculateInterest() {
		System.out.println("Loan: Interest");
		return 1.0d;
	}
}