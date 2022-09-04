package me.eliax00789.riftherald;

import me.eliax00789.riftherald.core.Challenges;
import me.eliax00789.riftherald.core.Champions;
import me.eliax00789.riftherald.core.Files;

public class RiftHerald {
    private static RiftHerald instance;
    public RiftHerald() {
        Files.getInstance();
    }

    public Files files() {
        return Files.getInstance();
    }

    public Challenges challenges() {
        return Challenges.getInstance();
    }

    public Champions champions() {
        return Champions.getInstance();
    }

    public static RiftHerald getInstance() {
        if (instance == null) {
            instance = new RiftHerald();
        }
        return instance;
    }
}