package ir.hri.bl;

public class SingleApple extends SingleFruit {
    private SingleApple() {
        name = "Apple";
    }

    public static SingleFruit getInstance() {
        if (instance == null)
            instance = new SingleApple();
        return instance;
    }
}