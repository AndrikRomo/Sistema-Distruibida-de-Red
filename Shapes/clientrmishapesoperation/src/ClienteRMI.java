import IntImplementation.ClienteImpl;

public class ClienteRMI {

    public static void main(String[] args) {
        ClienteImpl cliente = new ClienteImpl();
        cliente.connectServer();
    }
}
