package me.eliax00789.riftherald.core.champions.champion;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class Enemytips {
    private final JSONObject data;

    public Enemytips(JSONObject data) {
        this.data = data;
    }

    public String byKey(int key) {
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
            try {
                all.add(data.getString(i));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return all;
    }
}
