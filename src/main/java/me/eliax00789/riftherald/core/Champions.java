package me.eliax00789.riftherald.core;

import me.eliax00789.riftherald.core.champions.Champion;

public class Champions {
    private static Champions instance;

    public Champion byId(String id) {
        return new Champion(id,true);
    }
    public Champion byKey(int key) {
        return new Champion(key);
    }
    public Champion byName(String name) {
        return new Champion(name,false);
    }

    public static Champions getInstance() {
        if (instance == null) {
            instance = new Champions();
        }
        return instance;
    }
}
