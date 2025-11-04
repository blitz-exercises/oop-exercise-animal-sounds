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
        // throw new UnsupportedOperationException("TODO: implement Demo to exercise polymorphism over Animal list");
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Sparky"));
        animals.add(new Cat("Kitty"));
        animals.add(new Cow("Big dawg"));

        for (Animal animal : animals) {
            System.out.println(animal.getName() + ": " + animal.makeSound());
        }
    }
}

