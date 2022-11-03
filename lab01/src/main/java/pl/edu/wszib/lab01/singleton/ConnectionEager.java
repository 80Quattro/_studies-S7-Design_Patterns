package pl.edu.wszib.lab01.singleton;

// implementation no 1: instation is created in eager way (EAGER)
public final class ConnectionEager {

    public final static ConnectionEager INSTANCE = new ConnectionEager();

    private ConnectionEager() {

    }

}
