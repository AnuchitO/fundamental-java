public class Main {
	public static void main(String[] args) {
		Auto laumcing = new Auto("Laumcing", 10000.0d, 7.5f);
		laumcing.calculateInterest();
		System.out.println(laumcing.getApplicantName());
		System.out.println(laumcing);

		Mortgage laumcingMortgage = new Mortgage("Laumcing Mortgage", 1000000.0d, 3.5f);
		laumcingMortgage.calculateInterest();
		System.out.println(laumcingMortgage.getApplicantName());
		System.out.println(laumcingMortgage);
	}
}