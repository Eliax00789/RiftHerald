package me.eliax00789.riftherald.core.challenges.challenge.thresholds;

import me.eliax00789.riftherald.core.challenges.challenge.thresholds.rank.Rewards;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public class Rank {
    private final JSONObject data;

    public Rank(JSONObject data) {
        this.data = data;
    }

    public int value() {
        try {
            return data.getInt("value");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    @Nullable
    public Rewards rewards() {
        try {
            return new Rewards(data.getJSONObject("rewards"));
        } catch (JSONException e) {
            return null;
        }
    }
}
