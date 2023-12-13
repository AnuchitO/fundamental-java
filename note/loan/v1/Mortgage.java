public class Mortgage extends Loan {
	public Mortgage(String applicantName, double loanAmount, double interestRate) {
		super(applicantName, loanAmount, interestRate);
	}


	public Loan(String applicantName, double loanAmount, float interestRate) {
		this.applicantName = applicantName;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public float getInterestRate() {
		return interestRate;
	}

	private double calculateInterest() {
		System.out.println("Mortgage: Interest");
		return 3.2d;
	}


	@Override
	public String toString() {
		return "Applicant Name: " + applicantName + "\nLoan Amount: " + loanAmount + "\nInterest Rate: " + interestRate;
	}

}
