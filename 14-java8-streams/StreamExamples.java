package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// This example demonstrates Java 8 Stream API features:
// - Stream operations: filter, map, collect, etc.
// - Functional programming style with lambda expressions
// - Declarative approach to data processing
// - Efficient parallel processing capabilities
// 
// What is a Stream?
// - A sequence of elements supporting sequential and parallel aggregate operations
// - A bridge between functional programming and Java
// - Allows operations to be chained together
// 
// How is it different from loops?
// - Declarative vs Imperative:
//   - Streams: What to do (declarative)
//     Example: numbers.stream().filter(n -> n % 2 == 0)
//   - Loops: How to do it (imperative)
//     Example: for (int n : numbers) if (n % 2 == 0)
// 
// - Lazy Evaluation:
//   - Streams: Operations are lazy (executed only when terminal operation is called)
//   - Loops: All operations are executed immediately
// 
// - Functional Style:
//   - Streams: Uses functional concepts (map, filter, reduce)
//   - Loops: Uses traditional iterative approach
// 
// - Parallel Processing:
//   - Streams: Can easily be made parallel (.parallel())
//   - Loops: Requires manual thread management
// 
// - Code Readability:
//   - Streams: More readable and maintainable
//   - Loops: More verbose and harder to understand complex operations
// 
// - Memory Efficiency:
//   - Streams: Processes elements one at a time (no intermediate collections)
//   - Loops: Often requires creating intermediate collections
// 
// Example comparison:
// Traditional loop:
// for (int n : numbers) {
//     if (n % 2 == 0) {
//         result.add(n * 2);
//     }
// }
// 
// Stream equivalent:
// numbers.stream()
//     .filter(n -> n % 2 == 0)
//     .map(n -> n * 2)
//     .collect(Collectors.toList());
// 
// The stream version is more:
// - Concise
// - Readable
// - Maintainable
// - Extensible
// - Parallelizable
// 
// Common Pitfalls with Streams:
// 1. Overusing Parallel Streams:
//    - Only use .parallel() when data is large and operations are CPU-bound
//    - Parallel streams have overhead - not always faster for small datasets
//    - Example: Don't use parallel for small collections
// 
// 2. Side Effects:
//    - Avoid side effects in stream operations
//    - Each operation should be independent and pure
//    - Example: Don't modify external state in map/filter operations
// 
// 3. Performance Issues:
//    - Avoid creating streams from collections in loops
//    - Prefer terminal operations over intermediate operations when possible
//    - Example: Use reduce() instead of multiple map/collect operations
// 
// 4. Memory Usage:
//    - Be careful with large collections
//    - Use appropriate collector for your needs
//    - Example: Use Collectors.toUnmodifiableList() for read-only collections
// 
// 5. Null Handling:
//    - Streams don't handle null values well
//    - Always filter out nulls before other operations
//    - Example: Use filter(Objects::nonNull) before other operations
// 
// Best Practices:
// - Keep streams simple and focused
// - Use appropriate terminal operations
// - Prefer functional style over imperative style
// - Document complex stream operations
// - Test performance with parallel streams
// - Use appropriate collector based on use case

public class StreamExamples {
    public static void main(String[] args) {
        // Basic stream operations
        // Creating a stream from a collection
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        
        // Filter and collect
        // Using filter to get even numbers
        // Using collect to convert stream back to list
        List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
            
        // Print even numbers
        // Output: [2, 4, 6]
        System.out.println("Even numbers: " + evenNumbers);
        
        // Map and reduce
        int sum = numbers.stream()
            .map(n -> n * 2)
            .reduce(0, Integer::sum);
            
        System.out.println("Sum of doubled numbers: " + sum);
            
        // FlatMap example
        List<String> words = Arrays.asList("Hello", "World");
        List<Character> characters = words.stream()
            .flatMap(word -> word.chars()
                .mapToObj(c -> (char) c))
            .collect(Collectors.toList());
            
        System.out.println("Characters from words: " + characters);
            
        // Parallel streams
        List<Integer> largeList = Stream.iterate(1, n -> n + 1)
            .limit(1_000_000)
            .parallel()
            .map(n -> n * 2)
            .collect(Collectors.toList());
            
        System.out.println("Large list size: " + largeList.size());
    }
}
