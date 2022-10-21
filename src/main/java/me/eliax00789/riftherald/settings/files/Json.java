package me.eliax00789.riftherald.settings.files;

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

    private String basePath;
    private JSONArray versions;
    private JSONArray languages;
    private JSONObject challenges;
    private JSONObject championFull;
    private JSONObject item;
    private JSONObject language;
    private JSONObject map;
    private JSONObject missionAssets;
    private JSONObject profileicon;
    private JSONObject runesReforged;
    private JSONObject summoner;

    public Json() {
        basePath = "offline/RiftHerald/" + Language.getInstance().get() + "/";
    }

    public JSONArray versionsJSON() {
        if (versions == null) {
            versions = getJSONArray("offline/RiftHerald/versions.json");
        }
        return versions;
    }

    public JSONArray languagesJSON() {
        if (languages == null) {
            languages = getJSONArray("offline/RiftHerald/language.json");
        }
        return languages;
    }

    public JSONObject challengesJSON() {
        if (challenges == null) {
            challenges = getJSON(basePath + "challenges.json");
        }
        return challenges;
    }

    public JSONObject championFullJSON() {
        if (championFull == null) {
            championFull = getJSON(basePath + "championFull.json");
        }
        return championFull;
    }

    public JSONObject itemJSON() {
        if (item == null) {
            item = getJSON(basePath + "item.json");
        }
        return item;
    }

    public JSONObject languageJSON() {
        if (language == null) {
            language = getJSON(basePath + "language.json");
        }
        return language;
    }

    public JSONObject mapJSON() {
        if (map == null) {
            map = getJSON(basePath + "map.json");
        }
        return map;
    }

    public JSONObject missionAssetsJSON() {
        if (missionAssets == null) {
            missionAssets = getJSON(basePath + "mission-assets.json");
        }
        return missionAssets;
    }

    public JSONObject profileiconJSON() {
        if (profileicon == null) {
            profileicon = getJSON(basePath + "profileicon.json");
        }
        return profileicon;
    }

    public JSONObject runesReforgedJSON() {
        if (runesReforged == null) {
            runesReforged = getJSON(basePath + "runesReforged.json");
        }
        return runesReforged;
    }

    public JSONObject summonerJSON() {
        if (summoner == null) {
            summoner = getJSON(basePath + "summoner.json");
        }
        return summoner;
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
