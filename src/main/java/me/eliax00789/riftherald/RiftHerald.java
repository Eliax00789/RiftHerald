package me.eliax00789.riftherald;

import me.eliax00789.riftherald.core.Files;

public class RiftHerald {
    private static RiftHerald instance;
    public RiftHerald() {
        Files.getInstance();
    }

    public static RiftHerald getInstance() {
        if (instance == null) {
            instance = new RiftHerald();
        }
        return instance;
    }
}