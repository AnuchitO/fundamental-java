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
