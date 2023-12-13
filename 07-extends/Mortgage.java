public class Mortgage extends Loan {

	public Mortgage(String applicantName) {
		super(applicantName);
	}

	public Mortgage(String applicantName, double loanAmount, float interestRate) {
		super(applicantName, loanAmount, interestRate);
	}

	public String toString() {
		return "Mortgage:: toString()";
	}
}
