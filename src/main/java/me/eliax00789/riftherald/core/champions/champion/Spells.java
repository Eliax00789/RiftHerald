package me.eliax00789.riftherald.core.champions.champion;

import me.eliax00789.riftherald.core.champions.champion.spells.Spell;
import org.json.JSONException;
import org.json.JSONObject;

public class Spells {
    private final JSONObject data;

    public Spells(JSONObject data) {
        this.data = data;
    }

    public Spell q() {
        try {
            return new Spell(data.getJSONObject("0"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Spell w() {
        try {
            return new Spell(data.getJSONObject("1"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Spell e() {
        try {
            return new Spell(data.getJSONObject("2"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Spell r() {
        try {
            return new Spell(data.getJSONObject("3"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
