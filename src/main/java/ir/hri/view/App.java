package ir.hri.view;

import ir.hri.bl.Singleton;
import ir.hri.bl.SingletonL;
import ir.hri.bl.SingletonTSL;

public class App {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        SingletonL singletonL = SingletonL.getInstance();
        SingletonTSL singletonTSL = SingletonTSL.getInstance();
    }
}
