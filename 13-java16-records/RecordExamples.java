// This example demonstrates Java 16+ Record feature
// Records are a new way to create immutable value-based classes
// They automatically provide many useful methods and reduce boilerplate code

// Example 1: Simple Record
record Person(String firstName, String lastName, int age) {}

// Example 2: Record with constructor and methods
record Point(int x, int y) {
    // Constructor
    Point {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Coordinates must be positive");
        }
    }
    
    // Custom method
    double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
}

// Example 3: Record with nested records
record Address(String street, String city, String zipCode) {}
record Employee(String name, Address address, double salary) {}

// Example 4: Record with static fields and methods
record Circle(double radius) {
    // Static field
    private static final double PI = 3.14159;
    
    // Static method
    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }
    
    // Instance method
    double area() {
        return calculateArea(radius);
    }
}

class RecordExamples {
    public static void main(String[] args) {
        // Creating and using records
        Person person = new Person("John", "Doe", 30);
        System.out.println("Person: " + person);
        System.out.println("First name: " + person.firstName());
        System.out.println("Last name: " + person.lastName());
        System.out.println("Age: " + person.age());
        
        // Using record with constructor
        Point point = new Point(3, 4);
        System.out.println("Point: " + point);
        System.out.println("Distance from origin: " + point.distanceFromOrigin());
        
        // Using record with nested records
        Address address = new Address("123 Main St", "New York", "10001");
        Employee employee = new Employee("Alice", address, 50000.0);
        System.out.println("Employee: " + employee);
        
        // Using record with static fields/methods
        Circle circle = new Circle(5.0);
        System.out.println("Circle radius: " + circle.radius());
        System.out.println("Circle area: " + circle.area());
        
        // Record features demonstration
        // 1. Automatic methods
        //    - Constructor
        //    - Getters (firstName(), lastName(), etc.)
        //    - equals()
        //    - hashCode()
        //    - toString()
        //    - All methods are final
        
        // 2. Immutability
        //    - All fields are final
        //    - No setters
        //    - Cannot modify state after creation
        
        // 3. Pattern matching
        //    if (employee instanceof Employee e) {
        //        System.out.println(e.name());
        //    }
        
        // 4. Record components
        //    person.firstName() // Access field
        //    person instanceof Person(p) // Pattern matching
        //    person.equals(other) // Automatic equals()
        //    person.hashCode() // Automatic hashCode()
        
        // Common pitfalls:
        // 1. Don't use records for mutable data
        // 2. Don't use records for complex business logic
        // 3. Be careful with null values in records
        // 4. Records are not suitable for entities that need state changes
        
        // Best practices:
        // 1. Use records for simple data carriers
        // 2. Keep record logic minimal
        // 3. Use appropriate validation in constructors
        // 4. Document record components and usage
        // 5. Use records to reduce boilerplate code
    }
}
