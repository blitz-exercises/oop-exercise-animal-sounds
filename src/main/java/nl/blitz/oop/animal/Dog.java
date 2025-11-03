package nl.blitz.oop.animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Woof";
    }
}

