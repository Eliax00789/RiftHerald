package me.eliax00789.riftherald.core.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Download {
    private static Download instance;

    public void versionsJSON() {
        download("https://ddragon.leagueoflegends.com/api/versions.json","offline/RiftHerald/versions.json");
    }
    public void languagesJSON() {
        download("https://ddragon.leagueoflegends.com/cdn/languages.json","offline/RiftHerald/languages.json");
    }

    public void allJSON() {
        String baseUrl = "https://ddragon.leagueoflegends.com/cdn/" + Version.getInstance().get() + "/data/" + Language.getInstance().get() + "/";
        String basePath = "offline/RiftHerald/" + Language.getInstance().get() + "/";
        download(baseUrl + "challenges.json",basePath + "challenges.json");
        download(baseUrl + "championFull.json",basePath + "championFull.json");
        download(baseUrl + "item.json",basePath + "item.json");
        download(baseUrl + "language.json",basePath + "language.json");
        download(baseUrl + "map.json",basePath + "map.json");
        download(baseUrl + "minion-assets.json",basePath + "minion-assets.json");
        download(baseUrl + "profileicon.json",basePath + "profileicon.json");
        download(baseUrl + "runesReforged.json",basePath + "runesReforged.json");
        download(baseUrl + "summoner.json",basePath + "summoner.json");
    }

    private void createFileIfNotExists(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void download(String urlStr, String file) {
        try {
            createFileIfNotExists(file);
            URL url = new URL(urlStr);
            ReadableByteChannel rbc = Channels.newChannel(url.openStream());
            FileOutputStream fos = new FileOutputStream(file);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            fos.close();
            rbc.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Download getInstance() {
        if (instance == null) {
            instance = new Download();
        }
        return instance;
    }
}
