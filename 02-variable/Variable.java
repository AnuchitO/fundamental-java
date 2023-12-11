public class Variable {
	public static void main(String[] args) {
		String name = "Laumcing";
		System.out.println(name);

		int loanTerm = 36;
		System.out.println(loanTerm);

		// - float must add `f` at the end of the number.
		// - The precision of float is only six or seven decimal digits
		float interestRate = 7.5f;
		System.out.println(interestRate);

		// - double must add `d` at the end of the number.
		// - The precision of double is about 15 decimal digits
		// - Therefore it is safer to use double for most calculations.
		double loanAmount = 10000.0d;
		System.out.println(loanAmount);

		boolean isApproved = true;
		System.out.println(isApproved);

		char grade = 'A';
		System.out.println(grade);
	}
}
