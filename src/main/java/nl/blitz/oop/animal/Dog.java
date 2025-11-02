package nl.blitz.oop.animal;

/**
 * Dog overrides makeSound() to return its species-specific sound.
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        throw new UnsupportedOperationException("TODO: implement Dog.makeSound()");
    }
}

