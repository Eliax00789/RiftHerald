package me.eliax00789.riftherald.core.champions;

import me.eliax00789.riftherald.core.champions.champion.*;
import me.eliax00789.riftherald.settings.files.Json;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class Champion {
    private JSONObject champion;

    public Champion(String idOrName,boolean type) {
        if (type) {
            try {
                for (Iterator it = Json.getInstance().championFullJSON().getJSONObject("data").keys(); it.hasNext();) {
                    String i = (String) it.next();
                    if (Json.getInstance().championFullJSON().getJSONObject("data").getJSONObject(i).getString("id").equals(idOrName)) {
                        champion = Json.getInstance().championFullJSON().getJSONObject("data").getJSONObject(i);
                        return;
                    }
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                for (Iterator it = Json.getInstance().championFullJSON().getJSONObject("data").keys(); it.hasNext();) {
                    String i = (String) it.next();
                    if (Json.getInstance().championFullJSON().getJSONObject("data").getJSONObject(i).getString("name").equals(idOrName)) {
                        champion = Json.getInstance().championFullJSON().getJSONObject("data").getJSONObject(i);
                        return;
                    }
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public Champion(int key) {
        try {
            for (Iterator it = Json.getInstance().championFullJSON().getJSONObject("data").keys(); it.hasNext();) {
                String i = (String) it.next();
                if (Json.getInstance().championFullJSON().getJSONObject("data").getJSONObject(i).getInt("key") == key) {
                    champion = Json.getInstance().championFullJSON().getJSONObject("data").getJSONObject(i);
                    return;
                }
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String id() {
        try {
            return champion.getString("id");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public int key() {
        try {
            return champion.getInt("key");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String name() {
        try {
            return champion.getString("name");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String title() {
        try {
            return champion.getString("title");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Image image() {
        try {
            return new Image(champion.getJSONObject("image"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Skins skins() {
        try {
            return new Skins(champion.getJSONObject("skins"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String lore() {
        try {
            return champion.getString("lore");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String blurb() {
        try {
            return champion.getString("blurb");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Allytips allytips() {
        try {
            return new Allytips(champion.getJSONObject("allytips"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Enemytips enemytips() {
        try {
            return new Enemytips(champion.getJSONObject("enemytips"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Tags tags() {
        try {
            return new Tags(champion.getJSONObject("tags"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public String partype() {
        try {
            return champion.getString("partype");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Info info() {
        try {
            return new Info(champion.getJSONObject("info"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Stats stats() {
        try {
            return new Stats(champion.getJSONObject("stats"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Spells spells() {
        try {
            return new Spells(champion.getJSONObject("spells"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public Passive passive() {
        try {
            return new Passive(champion.getJSONObject("passive"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public JSONArray recommended() {
        try {
            return champion.getJSONArray("recommended");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}