# OOP Exercise: Animal Sounds

## Story

At the Blitz City Pet Expo, organizers need a tiny program that can announce animal sounds for any lineup without 
rewriting code for each species. They only know that "every animal can make a sound" and each species does it 
differently. Your job is to build a small hierarchy where a shared base type represents "an animal," and specific 
animals override how they sound. The announcer (our Demo) must work with a list of animals and print each sound 
without type checks.

## Requirements

- Abstract base class `Animal` with validated name and abstract `makeSound()`
- Subclasses `Dog`, `Cat`, and `Cow` that each override `makeSound()`
- `Demo` creates a `List<Animal>` and prints `name: sound` for each using polymorphism (no `instanceof`)

## Implementation Tasks

### Animal.java
- [ ] Keep `name` field private (and final if desired)
- [ ] Implement constructor that validates name is non-null and non-blank
- [ ] Throw `IllegalArgumentException` if validation fails
- [ ] Implement `getName()` method

### Dog.java
- [ ] Override `makeSound()` to return `"woof"`

### Cat.java
- [ ] Override `makeSound()` to return `"meow"`

### Cow.java
- [ ] Override `makeSound()` to return `"moo"`

### Demo.java
- [ ] Create a `List<Animal>`
- [ ] Add instances of `Dog`, `Cat`, and `Cow` with names
- [ ] Iterate through the list and print `<name>: <sound>` for each animal
- [ ] Use polymorphism - no `instanceof` checks or type casting

## Learning Objectives

- Understand abstract classes and methods
- Practice inheritance and method overriding
- Learn polymorphism and how it enables code flexibility
- Apply encapsulation with private fields
- Validate constructor parameters
- Work with collections using polymorphic types

## Building and Running

### Compile the project
```bash
mvn clean compile
```

### Running the Application

You can run the application in two ways:

**Option 1: Using IntelliJ IDEA** (Recommended for beginners)

1. Open the project in IntelliJ IDEA
2. Navigate to the `Demo.java` file (`src/main/java/nl/blitz/oop/animal/Demo.java`)
3. Right-click on the file or the `main` method
4. Select "Run 'Demo.main()'" from the context menu
5. Alternatively, click the green play button (▶) next to the `main` method

**Option 2: Using Maven Command Line**

```bash
mvn exec:java -Dexec.mainClass="nl.blitz.oop.animal.Demo"
```

Or compile and run manually:
```bash
mvn clean compile
java -cp target/classes nl.blitz.oop.animal.Demo
```

### Expected Output
```
Buddy: woof
Whiskers: meow
Bessie: moo
```

## Project Structure

```
src/main/java/nl/blitz/oop/animal/
├── Animal.java    (abstract base class)
├── Dog.java       (extends Animal)
├── Cat.java       (extends Animal)
├── Cow.java       (extends Animal)
└── Demo.java      (demonstrates polymorphism)
```

