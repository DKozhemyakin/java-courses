import Interfaces.Pet;

/**
 * Created by damon on 28.04.2017.
 */
public class CatDog implements Pet {
    private final Pet cat;
    private final Pet dog;

    /**
     * constructor koto-pes
     * @param cat
     * @param dog
     */
    public CatDog(Pet cat, Pet dog) {
        this.cat = cat;
        this.dog = dog;
    }

    /**
     * (@inheritDoc)
     */
    @Override
    public void makeSound() {
        this.cat.makeSound();
        this.dog.makeSound();

    }

    /**
     * (@inheritDoc)
     */
    @Override
    public String getName() {
        return String.format("my name, %s-%s", this.cat.getName(), this.dog.getName());
    }
}
