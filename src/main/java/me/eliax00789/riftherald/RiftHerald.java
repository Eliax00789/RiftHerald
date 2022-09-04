package me.eliax00789.riftherald;

import me.eliax00789.riftherald.core.Files;
import me.eliax00789.riftherald.core.files.Version;

public class RiftHerald {
    private static RiftHerald instance;
    public RiftHerald() {
        Files.getInstance();
    }

    public Files files() {
        return Files.getInstance();
    }

    public static RiftHerald getInstance() {
        if (instance == null) {
            instance = new RiftHerald();
        }
        return instance;
    }
}