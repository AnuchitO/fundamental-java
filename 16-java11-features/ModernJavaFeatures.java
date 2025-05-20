import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;

// This example demonstrates Java 11+ features:
// - Local-variable type inference (var)
// - Enhanced String methods
// - Multi-line strings
// - HTTP Client API
// - Improved try-with-resources

public class ModernJavaFeatures {
    public static void main(String[] args) {
        // Local-variable type inference
        // 'var' keyword infers type from initialization
        // Reduces boilerplate code
        var numbers = List.of(1, 2, 3, 4, 5);
        System.out.println("Numbers: " + numbers);
        
        // Enhanced String methods
        // New methods for better string manipulation
        String text = "  Hello World  ";
        System.out.println("Is blank: " + text.isBlank());
        System.out.println("Stripped: " + text.strip());
        
        // Multi-line strings
        // New way to create multi-line strings
        // Preserves whitespace and newlines
        var multiLine = """
            First line
            Second line
            Third line
            """;
        System.out.println("Multi-line string: \n" + multiLine);
        
        // HTTP Client example
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.example.com/data"))
            .timeout(Duration.ofMinutes(1))
            .build();
            
        try {
            var response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response status: " + response.statusCode());
        } catch (Exception e) {
            System.out.println("Error making HTTP request: " + e.getMessage());
        }
    }
}
