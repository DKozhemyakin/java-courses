/**
 * Describes lost pet
 * Created by damon on 28.04.2017.
 * нельзя создать экземпляр абстрактного класса
 * отличия от интерфейса - что мы можем реализовывать методы
 *
 */
public abstract class LostPet {

    /**
     * Is this pet dangerous or not
     * @return true if IS dangerous
     */
    public boolean isDanger() {
        return true;
    }

    /**
     * Return adress where pet was catched
     * @return
     */
    abstract String getWhereCatch();
}
