import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// This example demonstrates Java 8 Lambda Expressions:
// - Concise way to represent functions
// - Functional interfaces (Runnable, Function, Predicate)
// - Method references
// - Functional programming style
// - Type inference for lambda parameters
// 
// Common Pitfalls with Lambda Expressions:
// 1. Overusing Lambdas:
//    - Don't replace simple methods with complex lambdas
//    - Keep lambdas short and focused
//    - Example: Use regular methods for complex business logic
// 
// 2. Side Effects:
//    - Avoid side effects in lambda expressions
//    - Lambdas should be pure functions
//    - Example: Don't modify external state in lambda bodies
// 
// 3. Type Inference Issues:
//    - Be careful with ambiguous type inference
//    - Use explicit types when compiler can't infer correctly
//    - Example: Use explicit type when multiple interfaces match
// 
// 4. Performance Considerations:
//    - Lambda creation has overhead
//    - Avoid creating new lambdas in tight loops
//    - Example: Use method references when possible
// 
// 5. Testing Difficulties:
//    - Lambdas can make testing harder
//    - Keep logic in regular methods for better testing
//    - Example: Extract complex logic to testable methods
// 
// Best Practices:
// - Keep lambdas small and focused
// - Use method references when possible
// - Document complex lambda expressions
// - Test lambda-based code thoroughly
// - Use appropriate functional interfaces
// - Follow functional programming principles

public class LambdaExamples {
    public static void main(String[] args) {
        // Simple lambda expression
        // Implements Runnable interface with lambda
        // No parameters, returns void
        Runnable runnable = () -> System.out.println("Hello Lambda!");
        runnable.run();
        
        // Function with parameters
        // Takes Integer, returns Integer
        // Lambda with single parameter
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));
        
        // Predicate example
        // Takes Integer, returns boolean
        // Testing condition in lambda
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        
        // Consumer example
        Consumer<String> printer = System.out::println;
        printer.accept("Using method reference");
        
        // List sorting with lambda
        List<String> names = Arrays.asList("John", "Alice", "Bob");
        names.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted names: " + names);
        
        // Method reference
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.forEach(System.out::println);
    }
}
