import Interfaces.Pet;

/**
 * Dog implementation
 * Created by damon on 28.04.2017.
 */

public class Dog implements Pet {

    /**
     * Base animal realisation
     */
    private final Pet pet;

    public Dog(final Pet pet) {
        this.pet = pet;
    }

    /**
     * @(inheritDoc)
     */
    @Override
    public void makeSound() {
        this.pet.makeSound();
        System.out.println("Gav, gav");
    }

    /**
     * @(inheritDoc)
     */
    @Override
    public String getName() {
        return this.pet.getName();
    }
}
