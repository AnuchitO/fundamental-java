public class Loan {
		private String loanId;
		private String applicantName;
		private double loanAmount;
		private int loanTerm;
		private String status;
		private double interestRate;

		public String getLoanId() {
			return loanId;
		}

		public void setLoanId(String loanId) {
			this.loanId = loanId;
		}

		public String getApplicantName() {
			return applicantName;
		}

		public void setApplicantName(String applicantName) {
			this.applicantName = applicantName;
		}

		public double getLoanAmount() {
			return loanAmount;
		}

		public void setLoanAmount(double loanAmount) {
			this.loanAmount = loanAmount;
		}

		public int getLoanTerm() {
			return loanTerm;
		}

		public void setLoanTerm(int loanTerm) {
			this.loanTerm = loanTerm;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}	

		public double getInterestRate() {
			return interestRate;
		}

		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}
		
		public String toJSON() {
			String format = """
				{
					"loanId": "%s",
					"applicantName": "%s",
					"loanAmount": %.2f,
					"loanTerm": %d,
					"status": "%s",
					"interestRate": %.2f
				}
			""".replaceAll("	", "");
			return String.format(format, loanId, applicantName, loanAmount, loanTerm, status, interestRate);
		}
	}
