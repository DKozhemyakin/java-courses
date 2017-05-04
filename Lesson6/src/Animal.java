import Interfaces.Pet;

/**
 * Created by damon on 28.04.2017.
 */
public class Animal implements Pet {

    /**
     * Name
     */
    private final String name;

    /**
     * Constructor
     * @param name    Animal's name
     */
    public Animal (final String name) {
        this.name = name;
    }

    /**
     * Make a sound
     */
    @Override
    public void makeSound(){
        System.out.println(String.format("%s say : %s", this.name, "beep"));
    }

    /**
     * Check if an animal is hungry
     * @return true if hungry
     */
    private boolean isHungry() {
        //TODO add state calculation
        return true;
    }

    /**
     * Get the animal's name
     * @return String name
     */
    public String getName() {
        return name;
    }
}
