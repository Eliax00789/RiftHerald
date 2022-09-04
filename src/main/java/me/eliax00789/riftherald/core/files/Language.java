package me.eliax00789.riftherald.core.files;

import org.json.JSONException;

public class Language {
    private static Language instance;
    private static String langcode;

    public Language() {
        setDefault();
    }

    public void set(String langcode) {
        if (!exists(langcode)) {
            throw new IllegalArgumentException("Language code does not exist");
        }
        Language.langcode = langcode;
    }

    public void setDefault() {
        Language.langcode = "en_US";
    }

    public String get() {
        return langcode;
    }

    private boolean exists(String langcode) {
        for (int i = 0; i < Json.getInstance().languagesJSON().length(); i++) {
            try {
                if (Json.getInstance().languagesJSON().getString(i).equals(langcode)) {
                    return true;
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    public static Language getInstance() {
        if (instance == null) {
            instance = new Language();
        }
        return instance;
    }
}
