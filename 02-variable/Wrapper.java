public class Wrapper {
	public static void main(String[] args) {
		String name = "Laumcing";
		System.out.println(name);

		Integer loanTerm = 36;
		System.out.println(loanTerm);

		// - float must add `f` at the end of the number.
		// - The precision of float is only six or seven decimal digits
		Float interestRate = 7.5f;
		System.out.println(interestRate);

		// - double must add `d` at the end of the number.
		// - The precision of double is about 15 decimal digits
		// - Therefore it is safer to use double for most calculations.
		Double loanAmount = 10000.0d;
		System.out.println(loanAmount);

		Boolean isApproved = true;
		System.out.println(isApproved);

		Character grade = 'A';
		System.out.println(grade);
	}
}
