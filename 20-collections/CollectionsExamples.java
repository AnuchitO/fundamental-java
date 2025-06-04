import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsExamples {
    public static void main(String[] args) {
        try {
            // 1. Immutable Collections (Java 9+)
            System.out.println("\n1. Immutable Collections:");
            List<String> immutableList = List.of("apple", "banana", "orange");
            Set<String> immutableSet = Set.of("apple", "banana");
            Map<String, String> immutableMap = Map.of("key1", "value1", "key2", "value2");
            
            System.out.println("Immutable List: " + immutableList);
            System.out.println("Immutable Set: " + immutableSet);
            System.out.println("Immutable Map: " + immutableMap);
            
            // 2. Stream.toList() (Java 16+)
            System.out.println("\n2. Stream.toList() Example:");
            List<String> fruits = List.of("apple", "banana", "orange");
            List<String> upperCase = fruits.stream()
                .map(String::toUpperCase)
                .toList();
            
            System.out.println("Upper case fruits: " + upperCase);
            
            // 3. Enhanced Stream API methods
            System.out.println("\n3. Enhanced Stream API Methods:");
            Stream<Integer> numberStream = Stream.iterate(1, n -> n < 10, n -> n + 1);
            
            System.out.println("Numbers from 1 to 10:");
            numberStream.limit(10).forEach(System.out::println);
            
            List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
            List<Integer> filtered = numbers.stream()
                .dropWhile(n -> n < 4)
                .takeWhile(n -> n < 7)
                .toList();
            
            System.out.println("Filtered numbers (4-6): " + filtered);
            
            // 4. Grouping and Partitioning
            System.out.println("\n4. Grouping and Partitioning:");
            Map<String, List<String>> grouped = List.of("apple", "banana", "orange", "apple")
                .stream()
                .collect(Collectors.groupingBy(String::toLowerCase));
            
            Map<Boolean, List<String>> partitioned = List.of("apple", "banana", "orange")
                .stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 5));
            
            System.out.println("Grouped by lowercase: " + grouped);
            System.out.println("Partitioned by length > 5: " + partitioned);
            
            //    - Check for null values
            //    - Handle empty collections
            //    - Example: Use isEmpty() instead of size() == 0
            // 
            // Best practices:
            // 1. Use immutable collections when possible
            // 2. Prefer Stream.toList() for Java 16+
            // 3. Use appropriate grouping and partitioning
            // 4. Handle edge cases properly
            // 5. Document collection usage
        } catch (Exception e) {
            System.err.println("Error in collections example: " + e.getMessage());
            e.printStackTrace();
        }
    }
    // 4. Handle edge cases properly
    // 5. Document collection usage
}
