public class Loan {
	private String applicantName;
	private double loanAmount;
	private float interestRate;

	public Loan(String applicantName) {
		this.applicantName = applicantName;
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

	public double calculateInterest() {
		return this.loanAmount * this.interestRate / 100;
	}

	public String toString() {
		return "Applicant Name: " + applicantName + "\nLoan Amount: " + loanAmount + "\nInterest Rate: " + interestRate;
	}

}
