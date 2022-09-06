package me.eliax00789.riftherald.core.champions.champion.spells.spell.effect;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class EffectLevels {
    private final JSONObject data;

    public EffectLevels(JSONObject data) {
        this.data = data;
    }

    public int get(int spelllevel) {
        try {
            return data.getInt(String.valueOf(spelllevel - 1));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Integer> all() {
        ArrayList<Integer> all = new ArrayList<>();
        for (Iterator it = data.keys(); it.hasNext();) {
            int i = (int) it.next();
            all.add(i);
        }
        return all;
    }
}
