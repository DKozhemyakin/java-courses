import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Class describes clinic
 * Created by damon on 28.04.2017.
 */
public class Clinic {

    /**
     * list of cliens
     */
    private final Client[] clients;

    public Clinic(Client[] clients) {
        this.clients = clients;
    }

    public Clinic() {
        this.clients = new Client[]{};
    }

    /**
     * add client
     *
     * @param position Position
     * @param client   Client
     */
    public void addClient(final int position, final Client client) {
        this.clients[position] = client;
    }

    public Client[] findClientByName(final String name) {
        //TODO realise this
        return new Client[]{};
    }

    public Client findClient(final String clientName) {
        final Client[] client = {null};
        for (Client curClient : clients) {
            if (curClient.getId() == clientName)
                client[0] = curClient;
        }

        //return client[0];



        List<Client> clientList = Arrays.asList(clients);


        clientList.forEach(currClient -> {
            if (currClient.getId() == clientName) {
                client[0] = (Client)currClient;
            }
        });

        return client[0];
    }
    //TODO add client, post client's pet's name, search by client's name or pet's name, edit client or pet name, delete, validate

}
