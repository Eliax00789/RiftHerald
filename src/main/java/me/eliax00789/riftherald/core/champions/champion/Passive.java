package me.eliax00789.riftherald.core.champions.champion;

import me.eliax00789.riftherald.core.champions.champion.passive.Image;
import org.json.JSONException;
import org.json.JSONObject;

public class Passive {
    private final JSONObject data;

    public Passive(JSONObject data) {
        this.data = data;
    }

    public String name() {
        try {
            return data.getString("name");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String description() {
        try {
            return data.getString("description");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Image image() {
        try {
            return new Image(data.getJSONObject("image"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}