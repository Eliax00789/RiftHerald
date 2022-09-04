package me.eliax00789.riftherald.core.challenges.challenge;

import me.eliax00789.riftherald.core.challenges.challenge.thresholds.Rank;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public class Thresholds {
    private final JSONObject data;

    public Thresholds(JSONObject data) {
        this.data = data;
    }

    @Nullable
    public Rank iron() {
        try {
            return new Rank(data.getJSONObject("IRON"));
        } catch (JSONException e) {
            return null;
        }
    }
    @Nullable
    public Rank bronze() {
        try {
            return new Rank(data.getJSONObject("BRONZE"));
        } catch (JSONException e) {
            return null;
        }
    }
    @Nullable
    public Rank silver() {
        try {
            return new Rank(data.getJSONObject("SILVER"));
        } catch (JSONException e) {
            return null;
        }
    }
    @Nullable
    public Rank gold() {
        try {
            return new Rank(data.getJSONObject("GOLD"));
        } catch (JSONException e) {
            return null;
        }
    }
    @Nullable
    public Rank platinum() {
        try {
            return new Rank(data.getJSONObject("PLATINUM"));
        } catch (JSONException e) {
            return null;
        }
    }
    @Nullable
    public Rank diamond() {
        try {
            return new Rank(data.getJSONObject("DIAMOND"));
        } catch (JSONException e) {
            return null;
        }
    }
    @Nullable
    public Rank master() {
        try {
            return new Rank(data.getJSONObject("MASTER"));
        } catch (JSONException e) {
            return null;
        }
    }
    @Nullable
    public Rank grandmaster() {
        try {
            return new Rank(data.getJSONObject("GRANDMASTER"));
        } catch (JSONException e) {
            return null;
        }
    }
    @Nullable
    public Rank challenger() {
        try {
            return new Rank(data.getJSONObject("CHALLENGER"));
        } catch (JSONException e) {
            return null;
        }
    }
}
