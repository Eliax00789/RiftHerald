package me.eliax00789.riftherald.core.champions.champion.skins;

import org.json.JSONException;
import org.json.JSONObject;

public class Skin {
    private final JSONObject data;

    public Skin(JSONObject data) {
        this.data = data;
    }

    public String id() {
        try {
            return data.getString("id");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int num() {
        try {
            return data.getInt("num");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String name() {
        try {
            return data.getString("name");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean chromas() {
        try {
            return data.getBoolean("chromas");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
