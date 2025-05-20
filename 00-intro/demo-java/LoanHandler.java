import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.List;

public class LoanHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String method = exchange.getRequestMethod();
        OutputStream resp = exchange.getResponseBody();

        if ("GET".equals(method)) {
            String query = exchange.getRequestURI().getQuery();
            String path = exchange.getRequestURI().getPath();
            System.out.println("Path: " + path);
            System.out.println("Query: " + query);

            Loan loan = new Loan();
            loan.setLoanId("L001");
            loan.setApplicantName("Laumcing");
            loan.setLoanAmount(10000);
            loan.setLoanTerm(12);
            loan.setStatus("APPROVED");
            loan.setInterestRate(7.5);

            byte[] response = loan.toJSON().getBytes();

            //				  String loan = """
            //				 	{
            //				 	"loanId": "L001",
            //				 	"applicantName": "Laumcing",
            //				 	"loanAmount": 10000,
            //				 	"loanTerm": 12,
            //				 	"status": "APPROVED",
            //				 	"interestRate": 7.5
            //				  }""";
            //				 byte[] response = loan.getBytes();


            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, response.length);
            resp.write(response);

        } else {
            // Handle unsupported HTTP methods
            exchange.sendResponseHeaders(405, 0);
            resp.write("Method not allowed".getBytes());
        }

        resp.close();
    }
}
