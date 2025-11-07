Creational Design Patterns in Java


This project demonstrates five major Creational Design Patterns in Java — each implemented as a simple, standalone program.


Singleton Pattern – SingletonDemo.java


What it does:
Ensures only one instance of a class exists in the entire program.


When to use:
When you need a single shared resource (e.g., Logger, Database Connection, Configuration Manager).


How it works in this example:
Logger class allows only one instance using a private constructor and a static getInstance() method.
The log() method prints timestamped messages.
Multiple calls return the same instance.


Factory Method Pattern – FactoryMethodDemo.java


What it does:
Provides a way to create objects without specifying their exact class in the client code.

When to use:
When you have a superclass with multiple possible subclasses, and you want to delegate the creation logic to a factory.

How it works in this example:
Shape is an interface with implementations: Circle, Rectangle, and Square.
ShapeFactory decides which shape to create based on user input.


Builder Pattern – BuilderDemo.java


What it does:
Separates the construction of a complex object from its representation using method chaining.

When to use:
When an object has many optional parameters or configurations.

How it works in this example:
Computer has multiple attributes like CPU, RAM, storage, and graphics card.
The nested Builder class allows creating different configurations (like a gaming PC or office PC) easily.


Prototype Pattern – PrototypeDemo.java


What it does:
Creates new objects by cloning existing ones, instead of instantiating from scratch.

When to use:
When object creation is costly or complex, and you need duplicates with small modifications.

How it works in this example:
Document class implements Cloneable and overrides clone() to create a deep copy.
The cloned document can be modified independently from the original.


Abstract Factory Pattern – AbstractFactoryDemo.java


What it does:
Creates families of related objects without specifying their concrete classes.

When to use:
When your system needs to work with multiple themes, environments, or platforms.

How it works in this example:
UIFactory defines methods to create buttons and checkboxes.
LightThemeFactory and DarkThemeFactory each produce their own style of buttons and checkboxes.


Lazy Singleton

What it does:
Demonstrates a thread-safe, lazy-initialized Singleton using double-checked locking.

When to use:
When you want to create a Singleton only when needed and ensure it’s safe in multi-threaded environments.

How it works in this example:
LazyLogger initializes only when getInstance() is called for the first time.
