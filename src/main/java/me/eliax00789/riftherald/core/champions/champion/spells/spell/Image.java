package me.eliax00789.riftherald.core.champions.champion.spells.spell;

import me.eliax00789.riftherald.settings.files.Version;
import org.json.JSONException;
import org.json.JSONObject;

public class Image {
    private final JSONObject data;

    public Image(JSONObject data) {
        this.data = data;
    }

    public String fullURL() {
        try {
            return "https://ddragon.leagueoflegends.com/cdn/" + Version.getInstance().get() + "/img/spell/" + data.getString("full");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String group() {
        try {
            return data.getString("group");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int x() {
        try {
            return data.getInt("x");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int y() {
        try {
            return data.getInt("y");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int w() {
        try {
            return data.getInt("w");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int h() {
        try {
            return data.getInt("h");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}