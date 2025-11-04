package nl.blitz.oop.animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Meow";
    }
}

