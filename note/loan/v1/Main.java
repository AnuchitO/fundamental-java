public class Main {
	public static void main(String[] args) {
		Loan loan = new Loan("Podpo", 10000.0d, 7.5f);
		loan.applicantName = "Laumcing";
		loan.calculateInterest();
		System.out.println("Loan: " + loan.applicantName);

		System.out.println("\n=====================================\n");

		Mortgage mortgage = new Mortgage("", 50000.0d, 7.5f);
		mortgage.calculateInterest();
	}
}
