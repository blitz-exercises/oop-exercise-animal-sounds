package nl.blitz.oop.animal;

public abstract class Animal {

    private final String name;

    protected Animal(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String makeSound();
}
