package me.eliax00789.riftherald.core.champions.champion;

import org.json.JSONException;
import org.json.JSONObject;

public class Info {
    private final JSONObject data;

    public Info(JSONObject data) {
        this.data = data;
    }

    public int attack() {
        try {
            return data.getInt("attack");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int defense() {
        try {
            return data.getInt("defense");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int magic() {
        try {
            return data.getInt("magic");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int difficulty() {
        try {
            return data.getInt("difficulty");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
