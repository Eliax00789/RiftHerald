package me.eliax00789.riftherald.core.challenges.challenge;

import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public class LevelToIconPath {
    private final JSONObject data;
    private final String baseUrl;

    public LevelToIconPath(JSONObject data) {
        this.data = data;
        baseUrl = "https://ddragon.leagueoflegends.com/cdn/img";
    }

    @Nullable
    public String ironURL() {
        try {
            return baseUrl + data.getString("IRON");
        } catch (JSONException e) {
            return null;
        }
    }
    @Nullable
    public String bronzeURL() {
        try {
            return baseUrl + data.getString("BRONZE");
        } catch (JSONException e) {
            return null;
        }
    }
    @Nullable
    public String silverURL() {
        try {
            return baseUrl + data.getString("SILVER");
        } catch (JSONException e) {
            return null;
        }
    }
    @Nullable
    public String goldURL() {
        try {
            return baseUrl + data.getString("GOLD");
        } catch (JSONException e) {
            return null;
        }
    }
    @Nullable
    public String platinumURL() {
        try {
            return baseUrl + data.getString("PLATINUM");
        } catch (JSONException e) {
            return null;
        }
    }
    @Nullable
    public String masterURL() {
        try {
            return baseUrl + data.getString("MASTER");
        } catch (JSONException e) {
            return null;
        }
    }
    @Nullable
    public String grandmasterURL() {
        try {
            return baseUrl + data.getString("GRANDMASTER");
        } catch (JSONException e) {
            return null;
        }
    }
    @Nullable
    public String challengerURL() {
        try {
            return baseUrl + data.getString("CHALLENGER");
        } catch (JSONException e) {
            return null;
        }
    }
}
