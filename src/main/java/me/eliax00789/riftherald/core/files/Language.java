package me.eliax00789.riftherald.core.files;

import me.eliax00789.riftherald.core.RiftHeraldException;
import org.json.JSONException;

public class Language {
    private static Language instance;
    private static String langcode;

    public Language() {
        setDefault();
    }

    public void setDefault() {
        Language.langcode = "en_US";
    }

    public String get() {
        return langcode;
    }

    public static Language getInstance() {
        if (instance == null) {
            instance = new Language();
        }
        return instance;
    }
}
