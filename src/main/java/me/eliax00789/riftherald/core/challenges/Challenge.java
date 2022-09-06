package me.eliax00789.riftherald.core.challenges;

import me.eliax00789.riftherald.core.challenges.challenge.LevelToIconPath;
import me.eliax00789.riftherald.core.challenges.challenge.Thresholds;
import me.eliax00789.riftherald.core.files.Json;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class Challenge {
    public JSONObject challenge;

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

    public int id() {
        try {
            return challenge.getInt("id");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String name() {
        try {
            return challenge.getString("name");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String description() {
        try {
            return challenge.getString("description");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String shortDescription() {
        try {
            return challenge.getString("shortDescription");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Boolean hasLeaderboard() {
        try {
            return challenge.getBoolean("hasLeaderboard");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public LevelToIconPath levelToIconPath() {
        try {
            return new LevelToIconPath(challenge.getJSONObject("levelToIconPath"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Thresholds thresholds() {
        try {
            return new Thresholds(challenge.getJSONObject("thresholds"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
