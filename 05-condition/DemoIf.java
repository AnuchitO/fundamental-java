public class DemoIf {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < numbers.length; i++) {
			int number = numbers[i];
			if (number % 2 == 0) {
				System.out.println(number + " is even.");
			} else {
				System.out.println(number + " is odd.");
			}
		}
	}
}
