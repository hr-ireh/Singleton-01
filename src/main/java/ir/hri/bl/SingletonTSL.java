package ir.hri.bl;

//Lazy instatiate + Thread safe
public class SingletonTSL {
    private static SingletonTSL instance = null;

    private SingletonTSL() {
    }

    public static SingletonTSL getInstance() {
        if (instance == null) {
            synchronized (SingletonTSL.class) {
                if (instance == null)
                    instance = new SingletonTSL();
            }
        }
        return instance;
    }
}
