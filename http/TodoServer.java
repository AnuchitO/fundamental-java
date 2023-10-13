import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class TodoServer {
	public static void main(String[] args) throws Exception {
		HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
		server.createContext("/tasks", new TaskHandler());
		server.setExecutor(null);
		System.out.println("Starting server on port 8080");
		server.start();
	}

	static class TaskHandler implements HttpHandler {
		@Override
		public void handle(HttpExchange exchange) throws IOException {
			String method = exchange.getRequestMethod();
			OutputStream resp = exchange.getResponseBody();

			if ("GET".equals(method)) {
				System.out.println("GET request received");
				String query = exchange.getRequestURI().getQuery();
				System.out.println("Query: " + query);
				byte[] response = "AnuchitO was here".getBytes();
				exchange.sendResponseHeaders(200, response.length);
				exchange.getResponseHeaders().set("Content-Type", "text/plain");
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
