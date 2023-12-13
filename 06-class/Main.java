public class Main {
	public static void main(String[] args) {
		String applicantName = "Laumcing";
		double loanAmount = 10000.0d;
		float interestRate = 7.5f;

		System.out.println("Applicant Name: " + applicantName);
		System.out.println("Loan Amount: " + loanAmount);
		System.out.println("Interest Rate: " + interestRate);

		Loan loan = new Loan();
		System.out.println(loan);
		Loan loan2 = new Loan();
		System.out.println(loan2);

		System.out.println("\n=====================================\n");
		System.out.println("Loan : " + loan);
	}
}

/*
 * JavaScript Object Loan
 * {
 * loanId: 'L001',
 * applicantName: 'Laumcing',
 * loanAmount: 10000.0,
 * loanTerm: 12,
 * status: 'APPROVED',
 * interestRate: 7.5
 * }
 * 
 * Go Struct Loan
 * type Loan struct {
 * loanId string
 * applicantName string
 * loanAmount float64
 * loanTerm int
 * status string
 * interestRate float32
 * }
 * 
 * Python Class Loan
 * class Loan:
 * def __init__(self, loanId, applicantName, loanAmount, loanTerm, status,
 * interestRate):
 * self.loanId = loanId
 * self.applicantName = applicantName
 * self.loanAmount = loanAmount
 * self.loanTerm = loanTerm
 * self.status = status
 * self.interestRate = interestRate
 */