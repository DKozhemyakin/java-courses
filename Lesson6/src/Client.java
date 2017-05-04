import Interfaces.Pet;

/**
 * Class describes Client
 * Created by damon on 28.04.2017.
 */
public class Client {

    private final String id;
    private final Pet pet;

    public Client(String id, Pet pet) {
        this.id = id;
        this.pet = pet;
    }
}
