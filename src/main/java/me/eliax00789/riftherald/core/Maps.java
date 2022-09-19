package me.eliax00789.riftherald.core;

import me.eliax00789.riftherald.core.maps.Map;

public class Maps {
    private static Maps instance;

    public Map byName(String name) {
        return new Map(name);
    }
    public Map byId(int id) {
        return new Map(id);
    }

    public static Maps getInstance() {
        if (instance == null) {
            instance = new Maps();
        }
        return instance;
    }
}
