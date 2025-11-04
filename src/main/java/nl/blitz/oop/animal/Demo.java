package nl.blitz.oop.animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo must:
 * - Create a List<Animal>
 * - Add Dog, Cat, Cow instances
 * - Iterate and print: "<name>: <sound>" using polymorphism
 * - NO instanceof or type checks
 */
public class Demo {
    public static void main(String[] args) {

        Dog dog = new Dog("Pongo");
        Cat cat = new Cat("Kitek");
        Cow cow = new Cow("Lucy");

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(cow);

        for (Animal animal : animals) {
            System.out.println(animal.getName() + ": " + animal.makeSound());
        }
    }
}

