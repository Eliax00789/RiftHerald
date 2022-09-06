package me.eliax00789.riftherald.core.champions.champion.spells.spell;

import me.eliax00789.riftherald.core.files.Json;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class EffectBurn {
    private final JSONObject data;

    public EffectBurn(JSONObject data) {
        this.data = data;
    }

    public String get(int key) {
        try {
            return data.getString(String.valueOf(key));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<String> all() {
        ArrayList<String> all = new ArrayList<>();
        for (Iterator it = data.keys(); it.hasNext();) {
            String i = (String) it.next();
            all.add(i);
        }
        return all;
    }
}
