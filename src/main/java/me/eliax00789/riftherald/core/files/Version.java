package me.eliax00789.riftherald.core.files;

import me.eliax00789.riftherald.core.RiftHeraldException;
import org.json.JSONException;

public class Version {
    private static Version instance;
    private static String version;

    public Version() {
        setLatest();
    }

    public void set(String version) throws RiftHeraldException {
        if (!exists(version)) {
            throw new RiftHeraldException("Version does not exist");
        }
        Version.version = version;
    }

    public void setLatest() {
        try {
            version = Json.getVersionsJSON().getString(0);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String get() {
        return version;
    }

    private boolean exists(String version) {
        for (int i = 0; i < Json.getVersionsJSON().length(); i++) {
            try {
                if (Json.getVersionsJSON().getString(i).equals(version)) {
                    return true;
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    public static Version getInstance() {
        if (instance == null) {
            instance = new Version();
        }
        return instance;
    }
}
