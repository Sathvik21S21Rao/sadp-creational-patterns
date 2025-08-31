# SADP Assignment 1: Creational Patterns (Abstract Factory & Factory Method)

This repository contains two Java projects demonstrating the use of creational design patterns: **Abstract Factory** and **Factory Method**. Each project is organized to showcase how these patterns can be used to create families of related objects for different exam types (GATE, JEE, UPSC) and question types (Essay, MCQ, Fill-in-the-blank, Match the Following, True/False).

## Project Structure

- `AbstractFactory/`  
  Implements the Abstract Factory pattern for exam evaluation modules.
- `FactoryMethod/`  
  Implements the Factory Method pattern for exam evaluation modules.

Each project contains the following modules:
- `app/` — Main application logic and entry point
- `common/` — Common interfaces and base implementations
- `GATE/`, `JEE/`, `UPSC/` — Exam-specific factories and evaluation logic

## How the Code Works

### Abstract Factory
- Provides a way to encapsulate a group of individual factories with a common interface.
- Each exam type (GATE, JEE, UPSC) has its own factory that produces evaluation objects for each question type.
- The client code interacts with the abstract factory interface, making it easy to switch between exam types without changing the client logic.

### Factory Method
- Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.
- Each question type has its own factory, and each exam type provides its own implementation of these factories.
- This allows for more granular control over the instantiation of evaluation objects.

## How to Build and Run

Both projects use Maven for build and dependency management.


### Building the Projects

Open a terminal and navigate to the desired project directory (`AbstractFactory` or `FactoryMethod`). Then run:

```
mvn clean install
```

This will compile the code and run any available tests.

### Running the Application

Each project has an `app` module with a `Main` class as the entry point. To run the main application:

1. Navigate to the `app` module of the desired project:
   - For Abstract Factory: `cd AbstractFactory/app`
   - For Factory Method: `cd FactoryMethod/app`

2. Run the application using Maven:

```
mvn exec:java -pl app
```

Alternatively, you can run the compiled class directly if you prefer:

```
java -cp target/classes app.Main
```

### Running Tests

To run all tests for a project, execute:

```
mvn test
```

## Configuration

Both projects include a `config.properties` file for configuration. Change `examType` field to run code for different exam types.

## Notes
- The code is modularized for clarity and extensibility.
- Each exam type and question type can be extended by adding new factories and evaluation classes.
- The structure is suitable for demonstrating the differences and use-cases for Abstract Factory and Factory Method patterns in Java.

.
