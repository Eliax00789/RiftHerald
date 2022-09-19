package me.eliax00789.riftherald.core.items.item;

import org.json.JSONException;
import org.json.JSONObject;

public class Gold {
    public final JSONObject gold;

    public Gold(JSONObject gold) {
        this.gold = gold;
    }

    public int base() {
        try {
            return gold.getInt("base");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean purchasable() {
        try {
            return gold.getBoolean("purchasable");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int total() {
        try {
            return gold.getInt("total");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int sell() {
        try {
            return gold.getInt("sell");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
