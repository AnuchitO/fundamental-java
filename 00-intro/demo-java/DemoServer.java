import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
public class DemoServer {
	// demo write http server /loan with standard java library
	public static void main(String[] args) throws Exception {
		HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
		server.createContext("/loan", new LoanHandler());
		server.setExecutor(null);
		System.out.println("Starting server on port 8080");
		server.start();
	}

	static class Loan {
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
					"loanAmount": %f,
					"loanTerm": %d,
					"status": "%s",
					"interestRate": %f
				}
			""".replaceAll("	", "");
			return String.format(format, loanId, applicantName, loanAmount, loanTerm, status, interestRate);
		}
	}

	static class LoanHandler implements HttpHandler {
		@Override
		public void handle(HttpExchange exchange) throws IOException {
			String method = exchange.getRequestMethod();
			OutputStream resp = exchange.getResponseBody();

			if ("GET".equals(method)) {
				System.out.println("GET request received");
				String query = exchange.getRequestURI().getQuery();
				System.out.println("Query: " + query);

				Loan loan = new Loan();
				loan.setLoanId("L001");
				loan.setApplicantName("Laumcing");
				loan.setLoanAmount(10000);
				loan.setLoanTerm(12);
				loan.setStatus("APPROVED");
				loan.setInterestRate(7.5);
			
				byte[] response = loan.toJSON().getBytes();

				exchange.sendResponseHeaders(200, response.length);
				exchange.getResponseHeaders().set("Content-Type", "application/json");
				resp.write(response);

			} else if ("POST".equals(method)) {
				System.out.println("POST request received");
				// response to client that the request was successful
				exchange.sendResponseHeaders(201, 0);
			} else {
				// Handle unsupported HTTP methods
				resp.write("Method not allowed".getBytes());
				exchange.sendResponseHeaders(405, 0);
			}

			resp.close();
		}
	}
}
