package me.eliax00789.riftherald.core;

import me.eliax00789.riftherald.core.files.Json;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;

public class Language {
    private static Language instance;

    public String byKey(String key) {
        try {
            return Json.getInstance().languageJSON().getString(key);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    public HashMap<String,String> all() {
        HashMap<String,String> all = new HashMap<>();
        try {
            for (Iterator it = Json.getInstance().languageJSON().getJSONObject("data").keys(); it.hasNext();) {
                String i = (String) it.next();
                all.put(i, Json.getInstance().languageJSON().getJSONObject("data").getString(i));
            }
            return all;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }


    public static Language getInstance() {
        if (instance == null) {
            instance = new Language();
        }
        return instance;
    }
}
