package me.eliax00789.riftherald.settings.files;

import org.json.JSONException;

public class Version {
    private static Version instance;
    private static String version;

    public Version() {
        setLatest();
    }

    public void setLatest() {
        try {
            version = Json.getInstance().versionsJSON().getString(0);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String get() {
        return version;
    }

    public static Version getInstance() {
        if (instance == null) {
            instance = new Version();
        }
        return instance;
    }
}
