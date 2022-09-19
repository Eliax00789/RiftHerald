package me.eliax00789.riftherald;

import me.eliax00789.riftherald.core.*;

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

    public Items items() {
        return Items.getInstance();
    }

    public Language language() {
        return Language.getInstance();
    }

    public static RiftHerald getInstance() {
        if (instance == null) {
            instance = new RiftHerald();
        }
        return instance;
    }
}