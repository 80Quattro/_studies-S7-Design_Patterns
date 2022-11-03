package pl.edu.wszib.lab01.singleton;

// implementation no 2: instation is created by the first try of use (LAZY) getInstance()
public class ConnectionLazy {

    private static ConnectionLazy INSTANCE;

    private ConnectionLazy() {

    }

    public static ConnectionLazy getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ConnectionLazy();
        }
        return INSTANCE;
    }

}
