# Java Basic

## 1. Main file
- Main.java the class name must be the same as the file name.

```java
public class Main {
		public static void main(String[] args) {
		}
}
```

## 2. Hello Laumcing

```java
public class HelloLaumcing {
		public static void main(String[] args) {
				System.out.println("Laumcing");
		}
}
```

## 3. Variable

### 3.1 String

```java
public class Variable {
		public static void main(String[] args) {
				String name = "Laumcing";
				System.out.println(name);
		}
}
```

### 3.2 Integer

```java
public class Variable {
		public static void main(String[] args) {
				int loanTerm = 20;
				System.out.println(loanTerm);
		}
}
```

### 3.3 Float
- float must add `f` at the end of the number.
- The precision of float is only six or seven decimal digits

```java
public class Variable {
		public static void main(String[] args) {
				float interestRate = 7.5f;
				System.out.println(interestRate);
		}
}
```

### 3.4 Double
- double must add `d` at the end of the number.
- The precision of double is about 15 decimal digits
-  Therefore it is safer to use double for most calculations.

```java
public class Variable {
		public static void main(String[] args) {
				double weight = 60.5d;
				System.out.println(weight);
		}
}
```

### 3.5 Boolean

```java
public class Variable {
		public static void main(String[] args) {
				boolean isCompleted = true;
				System.out.println(isCompleted);
		}
}
```

### 3.6 Char

```java
public class Variable {
		public static void main(String[] args) {
				char grade = 'A';
				System.out.println(grade);
		}
}
```

### 3.7 Array

```java
public class Variable {
		public static void main(String[] args) {
				String[] names = {"Laumcing", "Coffee", "Podpo"};
				System.out.println(names);
				// Access array
				System.out.println(names[0]);
				// Change array
				names[0] = "Java";
				System.out.println(names[0]);
				// Array length
				System.out.println(names.length);

				// array of another type
				int[] numbers = {1, 2, 3, 4, 5};
				System.out.println(numbers);

				System.out.println(numbers[0]);
		}
}
```

## 4. Loop

### 4.1 For loop

```java
public class Loop {
		public static void main(String[] args) {
				for (int i = 0; i < 5; i++) {
						System.out.println(i);
				}
		}
}
```

```java
public class Loop {
		public static void main(String[] args) {
				String[] names = {"Laumcing", "Coffee", "Podpo"};
				for (int i = 0; i < names.length; i++) {
						System.out.println(names[i]);
				}
		}
}
```

### 4.2 While loop

```java
public class Loop {
		public static void main(String[] args) {
				int i = 0;
				while (i < 5) {
						System.out.println(i);
						i++;
				}
		}
}
```

```java
public class Loop {
		public static void main(String[] args) {
				String[] names = {"Laumcing", "Coffee", "Podpo"};
				int i = 0;
				while (i < names.length) {
						System.out.println(names[i]);
						i++;
				}
		}
}
```

## 5. Condition

### 5.1 If

```java
public class Condition {
		public static void main(String[] args) {
				int age = 20;
				if (age > 18) {
						System.out.println("Adult");
				}
		}
}
```

### 5.2 If else

```java
public class Condition {
		public static void main(String[] args) {
				int age = 20;
				if (age > 18) {
						System.out.println("Adult");
				} else {
						System.out.println("Child");
				}
		}
}
```

# Java Methods
## Java Methods

## Java Method Parameters
## Java Method Overloading
## Java Scope
```java
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use interestRate

    { // This is a block

      // Code here CANNOT use interestRate

     	float interestRate = 7.5f;

      // Code here CAN use interestRate
      System.out.println(interestRate);

    } // The block ends here

	System.out.println(interestRate);
  // Code here CANNOT use interestRate
  
  }
}

```

## Java OOP
OOP stands for Object-Oriented Programming.

Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

Object-oriented programming has several advantages over procedural programming:

OOP is faster and easier to execute
OOP provides a clear structure for the programs
OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
OOP makes it possible to create full reusable applications with less code and shorter development time
Tip: The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.

## Java Classes/Objects
		Java - What are Classes and Objects?
		Classes and objects are the two main aspects of object-oriented programming.
		Look at the following illustration to see the difference between class and objects:

		So, a class is a template for objects, and an object is an instance of a class.
		When the individual objects are created, they inherit all the variables and methods from the class.

	## Multiple Objects

## Java Class Attributes
Create a class called "Main" with two attributes: x and y:

```java
public class Main {
  int x = 5;
  int y = 3;
}
```

## Java Class Methods
```java
public class Main {
  static void myMethod() {
    System.out.println("Hello World!");
  }
}
```
## Java Constructors
A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:

```java
// Create a Main class
public class Main {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Main() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}
```

## Java toString() Method
```java
// Create a Main class
public class Main {
	int x = 5;

	public static void main(String[] args) {
		Main myObj = new Main();
		System.out.println(myObj);
	}
}
```

## Java Modifiers

```java
// Create a Main class
public class Main {
	// felid
	static String fname = "John";
	final String lname = "Doe";
	private int age = 24;

	public static void main(String[] args) {
		System.out.println("Name: " + fname + " " + lname);
		System.out.println("Age: " + age);
	}

	// Static method
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects");
	}

	// Public method
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects");
	}

	// Main method
	public static void main(String[ ] args) {
		myStaticMethod(); // Call the static method
		// myPublicMethod(); This would compile an error

		Main myObj = new Main(); // Create an object of Main
		myObj.myPublicMethod(); // Call the public method on the object
	}
}
```
## Java Encapsulation

```java
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}

```

## Java Inheritance

```java
class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute
  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
```
## Java Polymorphism
```java
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
```
## Java Abstraction
```java
abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}
// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}

```
## Java Interface

```java
// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```
## Java Enums
An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:

```java
public class Main {
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar);
  }
}
```

```java
public enum Day {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String dayName;

    Day(String dayName) {
        this.dayName = dayName;
    }

    public String getDayName() {
        return this.dayName;
    }
}
```

## Java ArrayList
```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```

## Java HashMap
```java
// Import the HashMap class
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
  }
}
```


## Java Iterator
```java
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {

    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get the iterator
    Iterator<String> it = cars.iterator();

 

		while(it.hasNext()) {
  		System.out.println(it.next());
		}
  }
}
```

## Java Wrapper Classes
The table below shows the primitive type and the equivalent wrapper class:

Primitive Data Type				Wrapper Class
byte											Byte
shortByte									Short
intByte										Integer
longByte									Long
floatByte									Float
doubleByte								Double
booleanByte								Boolean
charByte									Character



## Java Exceptions
```java
public class Main {
  public static void main(String[] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    } finally {
      System.out.println("The 'try catch' is finished.");
    }
  }
}
```

thows exception
```java
public class Main {
	static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		}
		else {
			System.out.println("Access granted - You are old enough!");
		}
	}

	public static void main(String[] args) {
		checkAge(15); // Set age to 15 (which is below 18...)
	}
}
```

create custom exception class
```java
// Create an exception class
class WrongAgeException extends Exception {
	WrongAgeException(String s) {
		super(s);
	}
}

// Use the custom exception
public class Main {
	static void checkAge(int age) throws WrongAgeException {
		if (age < 18) {
			throw new WrongAgeException("Access denied - You must be at least 18 years old.");
		}
		else {
			System.out.println("Access granted - You are old enough!");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(15);
		} catch (WrongAgeException e) {
			System.out.println("WrongAgeException occured: " + e);
		}
	}
}
```


## Java Lambda
Lambda Expressions were added in Java 8.

A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

parameter -> expression
(parameter1, parameter2) -> expression
(parameter1, parameter2) -> { code block }

```java
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		numbers.forEach( (n) -> { System.out.println(n); } );
	}
}
```


// message passing in OOP with Java example
// 1. inheritance

```java

```

// 2. composition

```java

```

// is-a and has-a
// is-a: inheritance
// has-a: composition

for example
class Bird {
		public void fly() {
				System.out.println("I can fly");
		}
}

class Parrot extends Bird {
		public void talk() {
				System.out.println("I can talk");
		}
}

class Penguin extends Bird {
	// Penguin cannot fly?

		public void swim() {
				System.out.println("I can swim");
		}
}

// encapsulation
// information hiding but it is implementation hiding
// consumer does not know how it works but it works (minimize coupling)

```java
public class Person {
		private String name;
		private int age;

		public Person(String name, int age) {
				this.name = name;
				this.age = age;
		}

		public String getName() {
				return name;
		}

		public int getAge() {
				return age;
		}
}
```

// Class Person has Phone
// Class Person has Contact (name, phoneNo) (composition)
// Person want to call to Contact

```java
public class Person {
		private String name;
		private int age;
		private Phone phone;
		private Contact[] contacts;

		public Person(String name, int age, Phone phone, Contact[] contacts) {
				this.name = name;
				this.age = age;
				this.phone = phone;
				this.contacts = contacts;
		}

		public String getName() {
				return name;
		}

		public int getAge() {
				return age;
		}

		public Phone getPhone() {
				return phone;
		}

		public void call(Contact contact) {
				phone.call(contact);
		}

		// call may with phone number
		public void callMay(){
			// look up may phone number from contact list
			// call to may
			Conact may = this.contacts.steam().filter(c -> c.getName().equals("May")).findFirst().get();
			phone.call(may);
		}
}
```

// Tell don't ask
example
```java
```


CBA interitance
```java
public class CBA {
		public void a() {
				System.out.println("a");
		}

		public void b() {
				System.out.println("b");
		}

		public void c() {
				System.out.println("c");
		}
}
```

# Annotation
what is annotation?
- metadata
- annotation is a tag
- annotation does not affect the execution of the code
- annotation is not a statement
- annotation can be read by compiler, tools, framework, etc.
- annotation can be used for compile-time and run-time
- annotation can be applied to classes, methods, variables, parameters, etc.

## Built-in annotation
- @Override
- @Deprecated
- @SuppressWarnings

## Custom annotation
- @interface

## Annotation Processor
- Annotation Processor is a tool that processes annotation

```java


