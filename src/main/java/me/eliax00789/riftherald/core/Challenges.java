package me.eliax00789.riftherald.core;

import me.eliax00789.riftherald.core.challenges.Challenge;
import org.json.JSONException;

import java.util.ArrayList;

public class Challenges {
    private static Challenges instance;

    public Challenge byKey(int key) {
        return new Challenge((short) key);
    }
    public Challenge byId(int id) {
        return new Challenge(id);
    }
    public Challenge byName(String name) {
        return new Challenge(name);
    }

    public static Challenges getInstance() {
        if (instance == null) {
            instance = new Challenges();
        }
        return instance;
    }
}
