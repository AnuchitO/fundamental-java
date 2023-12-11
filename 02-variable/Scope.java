public class Scope {
	public static void main(String[] args) {
		// Code here CANNOT use interestRate

		{ // This is a block

			// Code here CANNOT use interestRate

			float interestRate = 7.5f;

			// Code here CAN use interestRate
			System.out.println(interestRate);

		} // The block ends here

		System.out.println(interestRate);
		// Code here CANNOT use interestRate

	}
}
