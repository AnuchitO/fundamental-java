// This example demonstrates Java 17 Sealed Classes feature
// Sealed classes allow you to control which classes can extend/implement a class
// They provide type safety and prevent accidental inheritance

// Example 1: Basic Sealed Class
sealed interface Shape permits Circle, Rectangle, Square {}

// Valid implementations
final class Circle implements Shape {
    private final double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    double area() {
        return Math.PI * radius * radius;
    }
}

final class Rectangle implements Shape {
    private final double width;
    private final double height;
    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    double area() {
        return width * height;
    }
}

final class Square implements Shape {
    private final double side;
    
    Square(double side) {
        this.side = side;
    }
    
    double area() {
        return side * side;
    }
}

// Example 2: Sealed Class with Abstract Methods
class ShapeExamples {
    public static void main(String[] args) {
        // Creating shapes
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape square = new Square(3.0);
        
        // Using sealed classes
        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Square area: " + square.area());
        
        // Pattern matching with sealed classes
        double totalArea = 0;
        for (Shape shape : List.of(circle, rectangle, square)) {
            totalArea += shape.area();
        }
        System.out.println("Total area: " + totalArea);
        
        // Common pitfalls:
        // 1. Overusing sealed classes:
        //    - Only use when you have a fixed set of subclasses
        //    - Don't use for open-ended hierarchies
        //    - Example: Don't seal a class that might need new implementations
        // 
        // 2. Inheritance restrictions:
        //    - Must declare all permitted subclasses
        //    - No accidental inheritance possible
        //    - Example: Can't add new subclasses without modifying the sealed class
        // 
        // 3. Pattern matching:
        //    - Must handle all permitted cases
        //    - Compiler ensures exhaustive pattern matching
        //    - Example: switch must include all permitted classes
        // 
        // Best practices:
        // 1. Use sealed classes for fixed type hierarchies
        // 2. Document permitted subclasses
        // 3. Use with records for immutable data
        // 4. Follow open/closed principle
        // 5. Consider future extensibility
    }
}
