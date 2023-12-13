public class Main {
	public static void main(String[] args) {
		Loan jonh = new Loan("Jonh", 20000.0d, 8.5f);
		System.out.println(jonh.getInterestRate());
		jonh.setInterestRate(9.5f);
		System.out.println(jonh.getInterestRate());
		System.out.println(jonh);

		System.out.println("--------------------");

		Loan laumcing = new Loan("Laumcing");
		System.out.println(laumcing);

		System.out.println("--------------------");
		Mortgage jenny = new Mortgage("Jenny", 20000.0d, 8.5f);
		System.out.println(jenny.getInterestRate());
		System.out.println(jenny);
	}

}
