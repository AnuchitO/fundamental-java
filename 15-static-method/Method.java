public class Method {
	public static void main(String[] args) {
		int[] loanTerms = { 5, 6, 10, 15, 30, 20, 25 };
		printMaxLoanTerm(loanTerms);
	}

	public static void printMaxLoanTerm(int[] loanTerms) {
		float max = loanTerms[0];
		for (int i = 1; i < loanTerms.length; i++) {
			int loanTerm = loanTerms[i];
			if (loanTerm > max) {
				max = loanTerms[i];
			} else {
				System.out.println(loanTerm + " is not greater than " + max);
			}
		}
		System.out.println("Max loan term is " + max);
	}

	public static int findMaxLoanTerm(int[] loanTerms) {
		int max = loanTerms[0];
		for (int i = 1; i < loanTerms.length; i++) {
			int loanTerm = loanTerms[i];
			if (loanTerm > max) {
				max = loanTerms[i];
			} else {
				System.out.println(loanTerm + " is not greater than " + max);
			}
		}
		return max;
	}
}
