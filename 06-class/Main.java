public class Main {
	public static void main(String[] args) {
		String loanId = "L001";
		String applicantName = "Laumcing";
		double loanAmount = 10000.0d;
		int loanTerm = 12;
		String status = "APPROVED";
		float interestRate = 7.5f;

		System.out.println("Loan ID: " + loanId);
		System.out.println("Applicant Name: " + applicantName);
		System.out.println("Loan Amount: " + loanAmount);
		System.out.println("Loan Term: " + loanTerm);
		System.out.println("Status: " + status);
		System.out.println("Interest Rate: " + interestRate);

		Loan loan = new Loan();
		System.out.println("Loan ID: " + loan.loanId);

		Loan loan2 = new Loan();
		System.out.println("Loan2 ID: " + loan2.loanId);
	}
}

/*
	JavaScript Object Loan
	{
	loanId: 'L001',
	applicantName: 'Laumcing',
	loanAmount: 10000.0,
	loanTerm: 12,
	status: 'APPROVED',
	interestRate: 7.5
	}
	
	Go Struct Loan
	type Loan struct {
	loanId string
	applicantName string
	loanAmount float64
	loanTerm int
	status string
	interestRate float32
	}
	
	Python Class Loan
	class Loan:
	def __init__(self, loanId, applicantName, loanAmount, loanTerm, status,
	interestRate):
	self.loanId = loanId
	self.applicantName = applicantName
	self.loanAmount = loanAmount
	self.loanTerm = loanTerm
	self.status = status
	self.interestRate = interestRate
 */