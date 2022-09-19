package me.eliax00789.riftherald.core.items;

import me.eliax00789.riftherald.core.files.Json;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Tree {
    private JSONObject tree;

    public Tree(int key) {
        try {
            tree = Json.getInstance().itemJSON().getJSONObject("tree").getJSONObject(String.valueOf(key));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Tree(String header) {
        try {
            for (Iterator it = Json.getInstance().itemJSON().getJSONObject("tree").keys(); it.hasNext();) {
                String i = (String) it.next();
                if (Json.getInstance().itemJSON().getJSONObject("tree").getJSONObject(i).getString("header").equals(header)) {
                    tree = Json.getInstance().itemJSON().getJSONObject("tree").getJSONObject(i);
                }
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String header() {
        try {
            return tree.getString("header");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<String> tags() {
        ArrayList<String> tags = new ArrayList<>();
        try {
            for (int i = 0; i < tree.getJSONArray("tags").length(); i++) {
                tags.add(tree.getJSONArray("tags").getString(i));
            }
            return tags;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
