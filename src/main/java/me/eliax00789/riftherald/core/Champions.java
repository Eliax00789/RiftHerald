package me.eliax00789.riftherald.core;

public class Champions {
    private static Champions instance;

    public static Champions getInstance() {
        if (instance == null) {
            instance = new Champions();
        }
        return instance;
    }
}
