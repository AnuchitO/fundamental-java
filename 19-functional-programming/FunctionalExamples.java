import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class FunctionalExamples {
    public static void main(String[] args) {
        try {
            // 1. Streams API Enhancements
            System.out.println("\n1. Streams API Enhancements:");
            List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
            List<Integer> result = numbers.stream()
                .dropWhile(n -> n < 4)
                .takeWhile(n -> n < 7)
                .collect(Collectors.toList());
            
            System.out.println("Numbers between 4 and 6: " + result);
            
            // 2. Optional Improvements
            System.out.println("\n2. Optional Improvements:");
            Optional<String> optional = Optional.of("Hello");
            String upperCase = optional
                .map(String::toUpperCase)
                .orElse("DEFAULT");
            
            System.out.println("Optional result: " + upperCase);
            
            // 3. Lambda Expressions & Method References
            System.out.println("\n3. Lambda Expressions & Method References:");
            Function<String, Integer> length = String::length;
            Consumer<String> print = System.out::println;
            
            print.accept("Hello");
            System.out.println("Length of Hello: " + length.apply("Hello"));
            
            // 4. Collectors
            System.out.println("\n4. Collectors:");
            Map<String, List<String>> grouped = List.of("apple", "banana", "orange", "apple")
                .stream()
                .collect(Collectors.groupingBy(String::toLowerCase));
            
            Map<Boolean, List<String>> partitioned = List.of("apple", "banana", "orange")
                .stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 5));
            
            System.out.println("Grouped by lowercase: " + grouped);
            System.out.println("Partitioned by length > 5: " + partitioned);
            
            // 5. Functional Interfaces
            System.out.println("\n5. Functional Interfaces:");
            Function<String, Integer> stringToInt = Integer::parseInt;
            Supplier<String> hello = () -> "Hello";
            Predicate<String> isNotEmpty = s -> !s.isBlank();
            Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
            
            System.out.println("String to int: " + stringToInt.apply("123"));
            System.out.println("Hello supplier: " + hello.get());
            System.out.println("Is not empty: " + isNotEmpty.test("test"));
            printUpperCase.accept("hello");
        } catch (Exception e) {
            System.err.println("Error in functional programming example: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
