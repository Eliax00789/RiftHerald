package me.eliax00789.riftherald.core.profileicons;

import me.eliax00789.riftherald.core.profileicons.profileicon.Image;
import me.eliax00789.riftherald.settings.files.Json;
import org.json.JSONException;
import org.json.JSONObject;

public class ProfileIcon {
    private JSONObject profileIcon;

    public ProfileIcon(int id) {
        try {
            profileIcon = Json.getInstance().profileiconJSON().getJSONObject("data").getJSONObject(String.valueOf(id));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public int id() {
        try {
            return profileIcon.getInt("id");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public Image image() {
        try {
            return new Image(profileIcon.getJSONObject("image"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
