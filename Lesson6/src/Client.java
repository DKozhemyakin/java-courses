import Interfaces.Pet;

/**
 * Class describes Client
 * Created by damon on 28.04.2017.
 */
public class Client {

    private final String id;

    public String getId() {
        return id;
    }

    public Pet getPet() {
        return pet;
    }

    private final Pet pet;

    public Client(String id, Pet pet) {
        this.id = id;
        this.pet = pet;
    }
}
