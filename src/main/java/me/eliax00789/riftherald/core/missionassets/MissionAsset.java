package me.eliax00789.riftherald.core.missionassets;

import me.eliax00789.riftherald.core.MissionAssets;
import me.eliax00789.riftherald.core.missionassets.missionasset.Image;
import me.eliax00789.riftherald.settings.files.Json;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class MissionAsset {
    private JSONObject missionAsset;

    public MissionAsset(String key) {
        try {
            missionAsset = Json.getInstance().missionAssetsJSON().getJSONObject("data").getJSONObject(key);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public MissionAsset(int id) {
        try {
            for (Iterator it = Json.getInstance().missionAssetsJSON().getJSONObject("data").keys(); it.hasNext();) {
                String i = (String) it.next();
                if (Json.getInstance().missionAssetsJSON().getJSONObject("data").getJSONObject(i).getInt("id") == id) {
                    missionAsset = Json.getInstance().missionAssetsJSON().getJSONObject("data").getJSONObject(i);
                }
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public int id() {
        try {
            return missionAsset.getInt("id");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public Image image() {
        try {
            return new Image(missionAsset.getJSONObject("image"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
