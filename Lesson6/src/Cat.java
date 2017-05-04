/**
 * Created by damon on 28.04.2017.
 */
public class Cat extends Animal {

    /**
     * Constructor
     * @param name    Interfaces's name
     */
    public Cat(final String name) {
        super(name);
    }

    /**
     * Catch the mouse
     */
    public void catchMouse() {

    }

    /**
     * (@inheritDoc)
     */
    @Override
    public void makeSound(){
        System.out.println(String.format("Meow %s", this.getName()));
    }


}
