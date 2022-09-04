package me.eliax00789.riftherald;

import me.eliax00789.riftherald.core.files.Language;
import me.eliax00789.riftherald.core.files.Version;
import me.eliax00789.riftherald.core.files.Download;

public class RiftHerald {
    private static RiftHerald instance;
    public RiftHerald() {
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

    public static RiftHerald getInstance() {
        if (instance == null) {
            instance = new RiftHerald();
        }
        return instance;
    }
}