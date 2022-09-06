package me.eliax00789.riftherald.core.champions.champion.spells.spell;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Leveltip {
    public final JSONObject data;

    public Leveltip(JSONObject data) {
        this.data = data;
    }

    public JSONArray label() {
        try {
            return data.getJSONArray("label");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public JSONArray effect() {
        try {
            return data.getJSONArray("effect");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
