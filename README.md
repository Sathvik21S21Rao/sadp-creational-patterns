# 🏭 Creational Design Patterns in Action

Welcome to an exciting journey through the world of **Creational Design Patterns**! This project demonstrates how powerful design patterns can solve real-world problems through a practical exam evaluation system.

## 🎯 What's This All About?

Imagine you're building a system that needs to evaluate different types of exams - JEE, UPSC, GATE - each with their own unique evaluation criteria. How do you create a flexible, maintainable solution that can handle multiple exam types and question formats without becoming a tangled mess of code?

That's exactly what this project solves using two fundamental **Creational Design Patterns**:

- 🏭 **Abstract Factory Pattern**
- 🔧 **Factory Method Pattern**

Both patterns tackle the same challenge but with different approaches, giving you a perfect side-by-side comparison to understand when and why to use each one.

## 🌟 The Problem We're Solving

Our exam evaluation system needs to handle:
- **Different Exam Types**: JEE (Engineering), UPSC (Civil Services), GATE (Graduate Aptitude Test)
- **Various Question Types**: MCQ, Fill-in-the-Blank, True/False, Essay, Match-the-Following
- **Flexible Configuration**: Easy switching between exam types
- **Extensible Design**: Adding new exam types should be effortless

## 🏗️ Architecture Overview

```
📁 Project Structure
├── 🏭 AbstractFactory/          # Abstract Factory Pattern Implementation
│   ├── 📱 app/                  # Main application
│   ├── 🔧 common/               # Shared interfaces and abstract classes
│   ├── 🎓 JEE/                  # JEE-specific implementations
│   ├── 🏛️ UPSC/                 # UPSC-specific implementations
│   ├── 🎯 GATE/                 # GATE-specific implementations
│   └── ⚙️ config.properties    # Configuration file
│
└── 🔧 FactoryMethod/            # Factory Method Pattern Implementation
    ├── 📱 app/                  # Main application
    ├── 🔧 common/               # Shared interfaces and factories
    ├── 🎓 JEE/                  # JEE-specific implementations
    ├── 🏛️ UPSC/                 # UPSC-specific implementations
    ├── 🎯 GATE/                 # GATE-specific implementations
    └── ⚙️ config.properties    # Configuration file
```

## 🏭 Abstract Factory Pattern

The Abstract Factory pattern provides an interface for creating families of related objects without specifying their concrete classes.

### 🔍 How It Works

1. **ExamFactory** (Abstract Factory): Defines the interface for creating all types of evaluators
2. **JEEExamFactory, UPSCExamFactory, GATEExamFactory** (Concrete Factories): Create evaluators specific to each exam type
3. **MCQ_eval, Essay_eval, etc.** (Abstract Products): Define interfaces for different question types
4. **JEE_mcq_eval, UPSC_essay_eval, etc.** (Concrete Products): Implement exam-specific evaluation logic

### ✨ Key Benefits

- **Family Consistency**: All evaluators from one factory work together perfectly
- **Easy Switching**: Change exam type by switching the factory
- **Type Safety**: Compile-time guarantee of consistent product families

### 🚀 Running the Abstract Factory Example

```bash
cd AbstractFactory
mvn clean compile
java -cp app/target/classes:common/target/classes:JEE/target/classes app.Main
```

**Expected Output:**
```
JEE MCQ Evaluation Result: MCQ Response
JEE Fill-in Evaluation Result: Fill-in Response
JEE True/False Evaluation Result: True/False Response
JEE Essay Evaluation Result: Essay Response
JEE Match The Following Evaluation Result: Match the Following Response
```

## 🔧 Factory Method Pattern

The Factory Method pattern defines an interface for creating objects, but lets subclasses decide which class to instantiate.

### 🔍 How It Works

1. **MCQFactory, EssayFactory, etc.** (Abstract Creators): Define factory methods for each question type
2. **JEEMCQFactory, UPSCEssayFactory, etc.** (Concrete Creators): Implement exam-specific creation logic
3. **Product Classes**: Same as Abstract Factory pattern
4. **Client**: Uses multiple factories to create different evaluators

### ✨ Key Benefits

- **Granular Control**: Each question type has its own factory
- **Parallel Hierarchies**: Factory hierarchy mirrors product hierarchy
- **Flexible Composition**: Mix and match different factories

### 🚀 Running the Factory Method Example

```bash
cd FactoryMethod
mvn clean compile
java -cp app/target/classes:common/target/classes:JEE/target/classes app.Main
```

**Expected Output:**
```
JEE MCQ Evaluation Result: MCQ Response
JEE Fill-in-the-Blank Evaluation Result: Fill-in Response
JEE True/False Evaluation Result: True/False Response
JEE Essay Evaluation Result: Essay Response
JEE Match The Following Evaluation Result: Match The Following Response
```

## ⚙️ Configuration Magic

Both patterns use a simple configuration approach:

**config.properties:**
```properties
examType=JEE
```

Change this to `UPSC` or `GATE` to see different evaluation behaviors! The system dynamically loads the appropriate classes using reflection.

## 🔄 Switching Between Exam Types

### For JEE (Engineering Entrance):
```properties
examType=JEE
```

### For UPSC (Civil Services):
```properties
examType=UPSC
```

### For GATE (Graduate Aptitude Test):
```properties
examType=GATE
```

Each exam type has its own evaluation criteria and output format, demonstrating the power of the factory patterns!

## 🛠️ Getting Started

### Prerequisites
- ☕ Java 17 or later
- 📦 Maven 3.6+
- 🧠 Curiosity about design patterns!

### Quick Setup

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd sadp-creational-patterns
   ```

2. **Build both projects:**
   ```bash
   # Build Abstract Factory
   cd AbstractFactory
   mvn clean compile
   
   # Build Factory Method
   cd ../FactoryMethod
   mvn clean compile
   ```

3. **Run the examples:**
   ```bash
   # Try Abstract Factory
   cd AbstractFactory
   java -cp app/target/classes:common/target/classes:JEE/target/classes app.Main
   
   # Try Factory Method
   cd ../FactoryMethod
   java -cp app/target/classes:common/target/classes:JEE/target/classes app.Main
   ```

4. **Experiment with different exam types:**
   - Edit `config.properties` in either directory
   - Change `examType` to `UPSC` or `GATE`
   - Rebuild and run to see different behaviors!

## 🧪 Testing

Both projects include comprehensive JUnit tests:

```bash
# Run tests for Abstract Factory
cd AbstractFactory
mvn test

# Run tests for Factory Method
cd FactoryMethod
mvn test
```

## 🔍 Pattern Comparison

| Aspect | Abstract Factory | Factory Method |
|--------|------------------|----------------|
| **Complexity** | Higher | Lower |
| **Object Families** | Creates families of related objects | Creates individual objects |
| **Configuration** | Single factory per product family | Multiple factories per product type |
| **Use Case** | When you need consistent product families | When you need flexible object creation |
| **Example** | GUI toolkit (Windows vs Mac controls) | Document types (PDF vs Word) |

## 🚀 Extending the System

Want to add a new exam type? Here's how:

### For Abstract Factory:
1. Create a new module (e.g., `CAT/`)
2. Implement `CAT_mcq_eval`, `CAT_essay_eval`, etc.
3. Create `CATExamFactory` extending `ExamFactory`
4. Update `config.properties` to `examType=CAT`

### For Factory Method:
1. Create a new module (e.g., `CAT/`)
2. Implement `CAT_mcq_eval`, `CAT_essay_eval`, etc.
3. Create `CATMCQFactory`, `CATEssayFactory`, etc.
4. Update `config.properties` to `examType=CAT`

## 🎓 Learning Outcomes

By exploring this project, you'll understand:

- ✅ When to use Abstract Factory vs Factory Method
- ✅ How to design flexible, extensible systems
- ✅ The power of dependency injection and configuration
- ✅ Real-world applications of creational patterns
- ✅ Java reflection and dynamic class loading
- ✅ Maven multi-module project structure

## 🤝 Contributing

Found a bug? Have an idea for improvement? Contributions are welcome!

1. Fork the repository
2. Create a feature branch: `git checkout -b amazing-feature`
3. Commit your changes: `git commit -m 'Add amazing feature'`
4. Push to the branch: `git push origin amazing-feature`
5. Open a Pull Request

## 📚 Further Reading

- [Gang of Four Design Patterns](https://en.wikipedia.org/wiki/Design_Patterns)
- [Abstract Factory Pattern](https://refactoring.guru/design-patterns/abstract-factory)
- [Factory Method Pattern](https://refactoring.guru/design-patterns/factory-method)
- [SOLID Principles](https://en.wikipedia.org/wiki/SOLID)

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

**Happy coding! 🎉** 

*Remember: The best way to learn design patterns is to see them in action. Experiment with the code, break it, fix it, and make it your own!*