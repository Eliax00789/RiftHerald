package me.eliax00789.riftherald.core.items;

import me.eliax00789.riftherald.core.files.Json;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class Group {
    public JSONObject group;

    public Group(int key) {
        try {
            group = Json.getInstance().itemJSON().getJSONObject("groups").getJSONObject(String.valueOf(key));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Group(String id) {
        try {
            for (Iterator it = Json.getInstance().itemJSON().getJSONObject("groups").keys(); it.hasNext();) {
                String i = (String) it.next();
                if (Json.getInstance().itemJSON().getJSONObject("groups").getJSONObject(i).getString("id").equals(id)) {
                    group = Json.getInstance().itemJSON().getJSONObject("groups").getJSONObject(i);
                }
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String id() {
        try {
            return group.getString("id");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int maxGroupOwnable() {
        try {
            return Integer.parseInt(group.getString("MaxGroupOwnable"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
