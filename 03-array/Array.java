public class Array {
	public static void main(String[] args) {
		System.out.println("Array of String");
		String[] names = { "Laumcing", "Coffee", "Podpo" };
		// Access array
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);

		// Change array
		names[0] = "Java";
		System.out.println(names[0]);
		System.out.println("length: " + names.length);

		System.out.println("\nArray of Integer");
		int[] numbers = { 1, 2, 3, 4, 5 };

		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println("length: " + numbers.length);
		System.out.println(numbers);
	}
}