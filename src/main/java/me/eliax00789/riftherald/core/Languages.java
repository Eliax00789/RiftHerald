package me.eliax00789.riftherald.core;

import me.eliax00789.riftherald.core.languages.Language;

public class Languages {

    private static Languages instance;

    public Language get() {
        return new Language();
    }

    public static Languages getInstance() {
        if (instance == null) {
            instance = new Languages();
        }
        return instance;
    }
}
