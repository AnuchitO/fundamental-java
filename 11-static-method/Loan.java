public class Loan {
	String applicantName;
	double loanAmount;
	float interestRate;

	public Loan() {
	}

	public Loan(String applicantName) {
		this.applicantName = applicantName;
	}

	public static void info() {
		System.out.println("Loan:: static - info()");
	}

	public void show() {
		System.out.println("Loan:: show()" + applicantName);
	}

	public String toString() {
		return "Applicant Name: " + applicantName + "\n" +
				"Loan Amount: " + loanAmount + "\n" +
				"Interest Rate: " + interestRate;
	}
}