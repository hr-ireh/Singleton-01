package ir.hri.view;

import ir.hri.bl.*;

public class App {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        SingletonL singletonL = SingletonL.getInstance();
        SingletonTSL singletonTSL = SingletonTSL.getInstance();

        SingleFruit singleFruit = SingleApple.getInstance();
        System.out.println(singleFruit.getName());
    }
}
