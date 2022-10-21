package me.eliax00789.riftherald.core.languages;

import me.eliax00789.riftherald.settings.files.Json;
import org.json.JSONException;
import org.json.JSONObject;

public class Language {
    private JSONObject language;

    public Language() {
        try {
            language = Json.getInstance().languageJSON().getJSONObject("data");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String byKey(String key) {
        try {
            return language.getString(key);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
