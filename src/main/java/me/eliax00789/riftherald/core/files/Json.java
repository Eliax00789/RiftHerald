package me.eliax00789.riftherald.core.files;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Json {
    private static Json instance;

    private static JSONArray versions;
    private static JSONArray languages;
    private static JSONObject champion;

    public JSONArray getVersionsJSON() {
        if (versions == null) {
            versions = getJSONArray("offline/RiftHerald/versions.json");
        }
        return versions;
    }

    public JSONArray getLanguagesJSON() {
        if (languages == null) {
            languages = getJSONArray("offline/RiftHerald/language.json");
        }
        return languages;
    }

    public JSONObject getChampionJSON() {
        if (champion == null) {
            champion = getJSON("offline/RiftHerald/champion.json");
        }
        return champion;
    }

    public JSONObject getChampJSON(String champ) {
        return getJSON("offline/RiftHerald/champions/" + champ + ".json");
    }

    private JSONArray getJSONArray(String path) {
        try {
            File file = new File(path);
            BufferedInputStream is = new BufferedInputStream(new FileInputStream(file));
            byte[] data = new byte[(int) file.length()];
            is.read(data);
            is.close();
            String txt = new String(data, StandardCharsets.UTF_8);
            return new JSONArray(txt);
        } catch (IOException | JSONException e) {
            throw new RuntimeException(e);
        }
    }

    private JSONObject getJSON(String path) {
        try {
            File file = new File(path);
            BufferedInputStream is = new BufferedInputStream(new FileInputStream(file));
            byte[] data = new byte[(int) file.length()];
            is.read(data);
            is.close();
            String txt = new String(data,StandardCharsets.UTF_8);
            return new JSONObject(txt);
        } catch (IOException | JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static Json getInstance() {
        if (instance == null) {
            instance = new Json();
        }
        return instance;
    }
}
