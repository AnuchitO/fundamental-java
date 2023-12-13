public abstract class BaseLoan {
	private String applicantName;
	private double loanAmount;
	private float interestRate;

	public BaseLoan(String applicantName) {
		this.applicantName = applicantName;
	}

	public BaseLoan(String applicantName, double loanAmount, float interestRate) {
		this.applicantName = applicantName;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
	}

	public abstract double calculateInterest();

	public String getApplicantName() {
		return applicantName;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public String toString() {
		return "BaseLoan [applicantName=" + applicantName + ", loanAmount=" + loanAmount + ", interestRate="
				+ interestRate + "]";
	}
}
