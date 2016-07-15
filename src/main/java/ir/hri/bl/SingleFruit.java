package ir.hri.bl;

public class SingleFruit {
    protected String name;

    protected SingleFruit() {
    }

    protected static SingleFruit instance;

    public static SingleFruit getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }
}

