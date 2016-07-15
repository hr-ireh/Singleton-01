package ir.hri.bl;

public class SingleOrange extends SingleFruit {
    private SingleOrange() {
        name = "Orange";
    }

    public static SingleFruit getInstance() {
        if (instance == null)
            instance = new SingleOrange();
        return instance;
    }
}