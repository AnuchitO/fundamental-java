public class DemoSwitch {
	public static void main(String[] args) {
		int age = 19;
		switch (age) {
			case 18:
				System.out.println("You are 18.");
				break;
			case 19:
				System.out.println("You are 19.");
				break;
			case 20:
				System.out.println("You are 20.");
				break;
			default:
				System.out.println("You are not 18, 19, or 20.");
		}
	}
}
