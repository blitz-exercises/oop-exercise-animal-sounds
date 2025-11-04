package nl.blitz.oop.animal;

/**
 * Abstract representation of an animal with a validated name.
 * - name: non-null, non-blank
 * - getName(): returns the name
 * - makeSound(): abstract; subclasses must implement
 */
public abstract class Animal {
    // TODO: keep name private (and final if desired)
    private String name;

    /**
     * TODO:
     * - Validate that name is non-null and non-blank
     * - Throw IllegalArgumentException if invalid
     * - Assign to field if valid
     */
    protected Animal(String name) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("The animal name cannot be empty.");
        }

        this.name = name;
    }

    // TODO: return the animal's name
    public String getName() {
        return name;
    }

    /**
     * Subclasses must provide their sound, e.g., "woof", "meow", "moo".
     */
    public abstract String makeSound();
}

