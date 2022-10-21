package me.eliax00789.riftherald.core.champions.champion;

import me.eliax00789.riftherald.core.champions.champion.skins.Skin;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class Skins {
    private final JSONObject data;

    public Skins(JSONObject data) {
        this.data = data;
    }

    public Skin byKey(int key) {
        try {
            return new Skin(data.getJSONObject(String.valueOf(key)));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Skin byId(String id) {
        for (Iterator it = data.keys(); it.hasNext();) {
            String i = (String) it.next();
            try {
                if (data.getJSONObject(i).getString("id").equals(id)) {
                    return new Skin(data.getJSONObject(i));
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
