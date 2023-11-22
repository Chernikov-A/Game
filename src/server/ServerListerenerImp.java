package server;

public class ServerListerenerImp implements ServerListener {
    @Override
    public void receiveMessage(String message) {
        System.out.println("Message: " + message);
    }
}
