package me.eliax00789.riftherald.core.challenges.challenge.thresholds.rank.rewards;

import org.json.JSONException;
import org.json.JSONObject;

public class Reward {
    private final JSONObject data;

    public Reward(JSONObject data) {
        this.data = data;
    }

    public String category() {
        try {
            return data.getString("category");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int quantity() {
        try {
            return data.getInt("quantity");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String title() {
        try {
            return data.getString("title");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
