public class Main {
	public static void main(String[] args) {
		Loan laumcing = new Loan("Laumcing");
		laumcing.show();
	 
	
		Main.infoMain();

		Loan.info();
	}

	public static void infoMain() {
		System.out.println("Main:: static - info()");
	}
}