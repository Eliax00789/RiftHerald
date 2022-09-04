package me.eliax00789.riftherald.core;

import me.eliax00789.riftherald.RiftHerald;
import me.eliax00789.riftherald.core.files.Download;
import me.eliax00789.riftherald.core.files.Json;
import me.eliax00789.riftherald.core.files.Language;
import me.eliax00789.riftherald.core.files.Version;

public class Files {
    private static Files instance;
    public Files() {
        Download.getInstance();
        Json.getInstance();
        Language.getInstance();
        Version.getInstance();
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
