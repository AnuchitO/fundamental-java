public class Loan {
	private String applicantName;
	private double loanAmount;
	private float interestRate;

	public Loan() {
	}

	public Loan(String applicantName) {
		this.applicantName = applicantName;
	}

	public static void info() {
		System.out.println("Loan:: static - info()");
	}

	public void show() {
		System.out.println("Loan:: show() : " + this.applicantName);
	}

	public String toString() {
		return "Applicant Name: " + applicantName + "\n" +
				"Loan Amount: " + loanAmount + "\n" +
				"Interest Rate: " + interestRate;
	}
}