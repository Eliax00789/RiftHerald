package me.eliax00789.riftherald.core;

import me.eliax00789.riftherald.core.missionassets.MissionAsset;

public class MissionAssets {
    private static MissionAssets instance;

    public MissionAsset byKey(String key) {
        return new MissionAsset(key);
    }

    public MissionAsset byId(int id) {
        return new MissionAsset(id);
    }

    public static MissionAssets getInstance() {
        if (instance == null) {
            instance = new MissionAssets();
        }
        return instance;
    }
}
