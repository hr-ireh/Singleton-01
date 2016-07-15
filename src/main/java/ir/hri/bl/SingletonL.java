package ir.hri.bl;

//Lazy instatiate
public class SingletonL {
    private static SingletonL instance = null;

    private SingletonL() {
    }

    public static SingletonL getInstance() {
        if (instance == null)
            instance = new SingletonL();

        return instance;
    }
}