import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Loan laumcing = new Auto("Laumcing", 10000.0d, 7.5f);
		System.out.println(laumcing.calculateInterest());
		// System.out.println(Arrays.toString(laumcing.paymentOptions()));
		System.out.println(laumcing);

		Mortgage laumcingMortgage = new Mortgage("Mortgage", 10000.0d, 7.5f);
		System.out.println(laumcingMortgage.calculateInterest());
		System.out.println(Arrays.toString(laumcingMortgage.paymentOptions()));
		System.out.println(laumcingMortgage);
	}
}