package me.eliax00789.riftherald.core.champions.champion.spells.spell;

import me.eliax00789.riftherald.core.champions.champion.spells.spell.effect.EffectLevels;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class Effect {
    private final JSONObject data;

    public Effect(JSONObject data) {
        this.data = data;
    }

    public EffectLevels get(int key) {
        try {
            return new EffectLevels(data.getJSONObject(String.valueOf(key)));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<EffectLevels> all() {
        ArrayList<EffectLevels> all = new ArrayList<>();
        try {
            for (Iterator it = data.keys(); it.hasNext();) {
                String i = (String) it.next();
                all.add(new EffectLevels(data.getJSONObject(i)));
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        return all;
    }
}
