package me.eliax00789.riftherald;

import me.eliax00789.riftherald.core.*;
import me.eliax00789.riftherald.settings.Files;
import me.eliax00789.riftherald.settings.Language;

public class RiftHerald {
    private static RiftHerald instance;
    public RiftHerald() {
        Files.getInstance();
    }

    //SETTINGS
    public Files files() {
        return Files.getInstance();
    }
    public Language language() {
        return Language.getInstance();
    }


    //MAIN
    public Challenges challenges() {
        return Challenges.getInstance();
    }

    public Champions champions() {
        return Champions.getInstance();
    }

    public Items items() {
        return Items.getInstance();
    }

    public Languages languages() { return Languages.getInstance(); }

    public Maps maps() { return Maps.getInstance(); }

    public static RiftHerald getInstance() {
        if (instance == null) {
            instance = new RiftHerald();
        }
        return instance;
    }
}