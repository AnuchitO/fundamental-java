public class Mortgage implements Loan {
	private String applicantName;
	private double loanAmount;
	private double interestRate;

	public Mortgage(double loanAmount, int term, double interestRate) {
		this.loanAmount = loanAmount;
		this.term = term;
		this.interestRate = interestRate;
	}

	@Override
	public double calculateInterest() {
		System.out.println("Mortgage: Interest");
		return 3.0d;
	}
}
