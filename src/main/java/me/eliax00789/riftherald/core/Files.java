package me.eliax00789.riftherald.core;

import me.eliax00789.riftherald.RiftHerald;
import me.eliax00789.riftherald.core.files.Download;
import me.eliax00789.riftherald.core.files.Language;
import me.eliax00789.riftherald.core.files.Version;

public class Files {
    private static Files instance;
    public Files() {
        Language.getInstance();
        Version.getInstance();
        Download.getInstance();
    }

    public Language language() {
        return Language.getInstance();
    }
    public Version version() {
        return Version.getInstance();
    }
    public Download download() {
        return Download.getInstance();
    }

    public static Files getInstance() {
        if (instance == null) {
            instance = new Files();
        }
        return instance;
    }
}
