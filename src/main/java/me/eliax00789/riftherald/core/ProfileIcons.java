package me.eliax00789.riftherald.core;

import me.eliax00789.riftherald.core.profileicons.ProfileIcon;

public class ProfileIcons {
    private static ProfileIcons instance;

    public ProfileIcon byId(int id) {
        return new ProfileIcon(id);
    }

    public static ProfileIcons getInstance() {
        if (instance == null) {
            instance = new ProfileIcons();
        }
        return instance;
    }
}
