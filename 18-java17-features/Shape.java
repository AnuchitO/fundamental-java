// This example demonstrates Java 17 features:
// - Sealed classes: Restrict which classes can extend/implement
//   Example: `public sealed class Shape permits Circle, Rectangle, Square {}`
//   Only Circle, Rectangle, and Square can extend Shape
//
// - Records: Immutable value-based classes with reduced boilerplate
//   Example: `record Circle(double radius) implements Shape {}
//   Automatically provides constructor, getters, equals, hashCode, toString
//
// - Pattern matching: Enhanced instanceof and switch
//   Example: `if (shape instanceof Circle c) { ... }`
//   Can match and cast in one step
//
// - Text blocks: Multi-line string literals
//   Example: `var html = """<html>...</html>"""`
//   Preserves formatting and newlines
//
// Common Pitfalls with Java 17 Features:
// 1. Records:
//    - Don't use records for mutable data
//    - Avoid using records for complex business logic
//    - Records should represent simple data structures
//    - Example: Don't use records for entities that need state changes
//
// 2. Pattern Matching:
//    - Exhaustiveness checking is mandatory
//    - Handle all possible cases in switch expressions
//    - Example: Always include default case when using sealed classes
//
// 3. Sealed Classes:
//    - Don't overuse sealed classes
//    - Only use when you have a fixed set of subclasses
//    - Example: Don't use sealed classes for open-ended hierarchies
//
// 4. Text Blocks:
//    - Don't use text blocks for single-line strings
//    - Be careful with whitespace in text blocks
//    - Example: Use regular strings for simple text
//
// Best Practices:
// - Use records for simple data carriers
// - Document sealed class hierarchies
// - Test pattern matching exhaustively

// - Use appropriate data structure for each case
// - Follow functional programming principles
// - Maintain code readability

// Shape hierarchy using sealed classes and records
// This creates a controlled class hierarchy where:
// - Shape is the base sealed class that restricts inheritance
// - Circle, Rectangle, and Square are the only allowed subclasses
// - Each shape is implemented as a record for immutability
// - Records automatically provide common methods (constructor, getters, etc.)
// - This pattern ensures type safety and prevents accidental inheritance
// - The hierarchy is ideal for fixed sets of related types
// - Each shape can be pattern matched using instanceof or switch
// - The sealed class ensures the pattern matching is exhaustive
public sealed class Shape permits Circle, Rectangle, Square {}
record Circle(double radius) implements Shape {}
record Rectangle(double width, double height) implements Shape {}
record Square(double side) implements Shape {}

class PatternMatchingExamples {
    public static void main(String[] args) {
        // Pattern matching with instanceof
        // This is a more concise way to check type and cast in one step
        Shape shape = new Circle(5.0);
        if (shape instanceof Circle c) {
            System.out.println("Circle area: " + Math.PI * c.radius() * c.radius());
        }

        // Pattern matching with switch
        // This demonstrates enhanced switch with pattern matching
        // Each case pattern matches a different shape type
        Shape shape2 = new Rectangle(4.0, 6.0);
        double area = switch(shape2) {
            case Circle c -> Math.PI * c.radius() * c.radius();
            case Rectangle r -> r.width() * r.height();
            case Square s -> s.side() * s.side();
        };
        System.out.println("Shape area: " + area);

        // Text blocks (Java 15+)
        // This is a new way to create multi-line strings with proper formatting
        // The triple quotes (""") preserve whitespace and newlines
        var html = """
            <html>
                <body>
                    <h1>Hello World</h1>
                </body>
            </html>
            """;
        System.out.println("HTML content: \n" + html);
    }
}
