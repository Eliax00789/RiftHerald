package me.eliax00789.riftherald.settings;

import me.eliax00789.riftherald.settings.files.Download;
import me.eliax00789.riftherald.settings.files.Json;
import me.eliax00789.riftherald.settings.files.Language;
import me.eliax00789.riftherald.settings.files.Version;

public class Files {
    private static Files instance;

    public Files() {
        Download.getInstance();
    }

    public Download download() {
        return Download.getInstance();
    }
    public Json json() {
        return Json.getInstance();
    }
    public Language language() {
        return Language.getInstance();
    }
    public Version version() {
        return Version.getInstance();
    }

    public static Files getInstance() {
        if (instance == null) {
            instance = new Files();
        }
        return instance;
    }
}
