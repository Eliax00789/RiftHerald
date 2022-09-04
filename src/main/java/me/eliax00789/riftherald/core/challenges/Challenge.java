package me.eliax00789.riftherald.core.challenges;

import me.eliax00789.riftherald.core.challenges.challenge.LevelToIconPath;
import me.eliax00789.riftherald.core.challenges.challenge.Thresholds;
import me.eliax00789.riftherald.core.files.Json;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class Challenge {
    public static JSONObject challenge;

    public Challenge(short key) {
        try {
            challenge = Json.getInstance().challengesJSON().getJSONObject(String.valueOf(key));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Challenge(int id) {
        for (Iterator it = Json.getInstance().challengesJSON().keys(); it.hasNext();) {
            String i = (String) it.next();
            try {
                if (Json.getInstance().challengesJSON().getJSONObject(i).getInt("id") == id) {
                    challenge = Json.getInstance().challengesJSON().getJSONObject(i);
                    return;
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public Challenge(String name) {
        for (Iterator it = Json.getInstance().challengesJSON().keys(); it.hasNext();) {
            String i = (String) it.next();
            try {
                if (Json.getInstance().challengesJSON().getJSONObject(i).getString("name").equals(name)) {
                    challenge = Json.getInstance().challengesJSON().getJSONObject(i);
                    return;
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int id() throws JSONException {
        return challenge.getInt("id");
    }
    public String name() throws JSONException {
        return challenge.getString("name");
    }
    public String description() throws JSONException {
        return challenge.getString("description");
    }
    public String shortDescription() throws JSONException {
        return challenge.getString("shortDescription");
    }
    public Boolean hasLeaderboard() throws JSONException {
        return challenge.getBoolean("hasLeaderboard");
    }
    public LevelToIconPath levelToIconPath() throws JSONException {
        return new LevelToIconPath(challenge.getJSONObject("levelToIconPath"));
    }
    public Thresholds thresholds() throws JSONException {
        return new Thresholds(challenge.getJSONObject("thresholds"));
    }
}
