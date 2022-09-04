package me.eliax00789.riftherald.core.challenges.challenge.thresholds.rank;

import me.eliax00789.riftherald.core.challenges.challenge.thresholds.rank.rewards.Reward;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class Rewards {
    private final JSONObject data;

    public Rewards(JSONObject data) {
        this.data = data;
    }

    @Nullable
    public Reward get(int key) {
        try {
            return new Reward(data.getJSONObject(String.valueOf(key)));
        } catch (JSONException e) {
            return null;
        }
    }
    public ArrayList<Reward> all() {
        ArrayList<Reward> all = new ArrayList<>();
        for (Iterator it = data.keys(); it.hasNext();) {
            String i = (String) it.next();
            try {
                all.add(new Reward(data.getJSONObject(i)));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return all;
    }
}
