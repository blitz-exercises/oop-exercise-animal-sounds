package nl.blitz.oop.animal;

import java.util.ArrayList;
import java.util.List;


public class Demo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Bello"));
        animals.add(new Cat("Garfield"));
        animals.add(new Cow("Bessie"));

        for (Animal animal : animals) {
            System.out.println(animal.getName() + ": " + animal.makeSound());
        }
    }
}

