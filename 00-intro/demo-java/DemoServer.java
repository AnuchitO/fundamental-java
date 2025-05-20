import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;


public class DemoServer {
	public static void main(String[] args) throws Exception {
		HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
		server.createContext("/loans", new LoanHandler());
		server.setExecutor(null);
		System.out.println("Starting server on port 8080");
		server.start();
	}
}
