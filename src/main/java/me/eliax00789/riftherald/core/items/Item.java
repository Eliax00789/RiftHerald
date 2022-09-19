package me.eliax00789.riftherald.core.items;

import me.eliax00789.riftherald.core.files.Json;
import me.eliax00789.riftherald.core.items.item.Gold;
import me.eliax00789.riftherald.core.items.item.Image;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Item {
    private JSONObject item;

    public Item(int key) {
        try {
            item = Json.getInstance().itemJSON().getJSONObject("data").getJSONObject(String.valueOf(key));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Item(String name) {
        try {
            for (Iterator it =  Json.getInstance().itemJSON().getJSONObject("data").keys(); it.hasNext();) {
                String i = (String) it.next();
                if (Json.getInstance().itemJSON().getJSONObject("data").getJSONObject(i).getString("name").equals(name)) {
                    item = Json.getInstance().itemJSON().getJSONObject("data").getJSONObject(i);
                }
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String name() {
        try {
            return item.getString("name");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String description() {
        try {
            return item.getString("description");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String colloq() {
        try {
            return item.getString("colloq");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String plaintext() {
        try {
            return item.getString("plaintext");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<Item> into() {
        ArrayList<Item> items = new ArrayList<>();
        try {
            for (int i = 0; i < item.getJSONArray("into").length(); i++) {
                items.add(new Item(Integer.parseInt(item.getJSONArray("into").getString(i))));
            }
            return items;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Image image() {
        try {
            return new Image(item.getJSONObject("image"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Gold gold() {
        try {
            return new Gold(item.getJSONObject("gold"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<String> tags() {
        ArrayList<String> tags = new ArrayList<>();
        try {
            for (int i = 0; i < item.getJSONArray("tags").length(); i++) {
                tags.add(item.getJSONArray("tags").getString(i));
            }
            return tags;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public HashMap<Integer, Boolean> maps() {
        HashMap<Integer,Boolean> maps = new HashMap<>();
        try {
            for (Iterator it = item.getJSONObject("maps").keys(); it.hasNext();) {
                Integer i = (Integer) it.next();
                maps.put(i,item.getJSONObject("maps").getBoolean(String.valueOf(i)));
            }
            return maps;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public HashMap<String,Integer> stats() {
        HashMap<String,Integer> stats = new HashMap<>();
        try {
            for (Iterator it = item.getJSONObject("stats").keys(); it.hasNext();) {
                String i = (String) it.next();
                stats.put(i,item.getJSONObject("stats").getInt(i));
            }
            return stats;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
