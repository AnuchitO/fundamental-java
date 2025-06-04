import java.util.concurrent.*;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ConcurrencyExamples {
    public static void main(String[] args) {
        try {
            // 1. CompletableFuture Improvements
            System.out.println("\n1. CompletableFuture Example:");
            CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException("Interrupted", e);
                }
                return "Hello from CompletableFuture";
            });
            
            future.thenAccept(System.out::println);
            future.join(); // Wait for completion
            
            // 2. ForkJoinPool Example
            System.out.println("\n2. ForkJoinPool Example:");
            ForkJoinPool pool = ForkJoinPool.commonPool();
            List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            
            int sum = pool.invoke(new SumTask(numbers));
            System.out.println("Sum: " + sum);
            
            // 3. Virtual Threads Example (Java 21+)
            System.out.println("\n3. Virtual Threads Example:");
            try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
                Future<String> virtualFuture = executor.submit(() -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException("Interrupted", e);
                    }
                    return "Hello from virtual thread";
                });
                
                System.out.println("Virtual Thread Result: " + virtualFuture.get());
            }
            
            // 4. Structured Concurrency Example (Java 21+)
            System.out.println("\n4. Structured Concurrency Example:");
            System.out.println("Structured Concurrency is a preview feature in Java 21.\n" +
                             "To run this example, add --enable-preview flag to JVM arguments.");
            
        } catch (Exception e) {
            System.err.println("Error in concurrency example: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

class SumTask extends RecursiveTask<Integer> {
    private final List<Integer> numbers;
    
    SumTask(List<Integer> numbers) {
        this.numbers = numbers;
    }
    
    @Override
    protected Integer compute() {
        try {
            if (numbers.size() <= 1) {
                return numbers.get(0);
            }
            
            int mid = numbers.size() / 2;
            SumTask left = new SumTask(numbers.subList(0, mid));
            SumTask right = new SumTask(numbers.subList(mid, numbers.size()));
            
            left.fork();
            int rightResult = right.compute();
            int leftResult = left.join();
            
            return leftResult + rightResult;
        } catch (Exception e) {
            System.err.println("Error in SumTask: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
