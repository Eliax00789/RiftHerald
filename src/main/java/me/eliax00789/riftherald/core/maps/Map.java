package me.eliax00789.riftherald.core.maps;

import me.eliax00789.riftherald.settings.files.Json;
import me.eliax00789.riftherald.core.maps.map.Image;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class Map {
    private JSONObject map;

    public Map(String name) {
        try {
            for (Iterator it = Json.getInstance().mapJSON().getJSONObject("data").keys(); it.hasNext();) {
                String i = (String) it.next();
                if (Json.getInstance().mapJSON().getJSONObject("data").getJSONObject(i).getString("MapName").equals(name)) {
                    map = Json.getInstance().mapJSON().getJSONObject("data").getJSONObject(i);
                }
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Map(int id) {
        try {
            map = Json.getInstance().mapJSON().getJSONObject("data").getJSONObject(String.valueOf(id));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String name() {
        try {
            return map.getString("MapName");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int id() {
        try {
            return Integer.parseInt(map.getString("MapId"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Image image() {
        try {
            return new Image(map.getJSONObject("image"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
