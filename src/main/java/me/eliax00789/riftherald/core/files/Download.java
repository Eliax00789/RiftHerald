package me.eliax00789.riftherald.core.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Download {
    private static Download instance;
    private String baseUrl;
    private String basePath;

    public Download() {
        versionsJSON();
        languagesJSON();
        baseUrl = "https://ddragon.leagueoflegends.com/cdn/" + Version.getInstance().get() + "/data/" + Language.getInstance().get() + "/";
        basePath = "offline/RiftHerald/" + Language.getInstance().get() + "/";
    }

    private void versionsJSON() {
        if (netIsAvailable()) {
            download("https://ddragon.leagueoflegends.com/api/versions.json","offline/RiftHerald/versions.json");
        }
    }
    private void languagesJSON() {
        if (netIsAvailable()) {
            download("https://ddragon.leagueoflegends.com/cdn/languages.json","offline/RiftHerald/languages.json");
        }
    }
    public void challengesJSON() {
        if (netIsAvailable()) {
            download(baseUrl + "challenges.json",basePath + "challenges.json");
        }
    }
    public void championJSON() {
        if (netIsAvailable()) {
            download(baseUrl + "championFull.json",basePath + "championFull.json");
        }
    }
    public void itemJSON() {
        if (netIsAvailable()) {
            download(baseUrl + "item.json",basePath + "item.json");
        }
    }
    public void languageJSON() {
        if (netIsAvailable()) {
            download(baseUrl + "language.json",basePath + "language.json");
        }
    }
    public void mapJSON() {
        if (netIsAvailable()) {
            download(baseUrl + "map.json",basePath + "map.json");
        }
    }
    public void minionAssetsJSON() {
        if (netIsAvailable()) {
            download(baseUrl + "mission-assets.json",basePath + "mission-assets.json");
        }
    }
    public void profileIconJSON() {
        if (netIsAvailable()) {
            download(baseUrl + "profileicon.json",basePath + "profileicon.json");
        }
    }
    public void runesReforgedJSON() {
        if (netIsAvailable()) {
            download(baseUrl + "runesReforged.json",basePath + "runesReforged.json");
        }
    }
    public void summonerJSON() {
        if (netIsAvailable()) {
            download(baseUrl + "summoner.json",basePath + "summoner.json");
        }
    }
    public void allJSON() {
        if (netIsAvailable()) {
            download(baseUrl + "challenges.json", basePath + "challenges.json");
            download(baseUrl + "championFull.json", basePath + "championFull.json");
            download(baseUrl + "item.json", basePath + "item.json");
            download(baseUrl + "language.json", basePath + "language.json");
            download(baseUrl + "map.json", basePath + "map.json");
            download(baseUrl + "mission-assets.json", basePath + "mission-assets.json");
            download(baseUrl + "profileicon.json", basePath + "profileicon.json");
            download(baseUrl + "runesReforged.json", basePath + "runesReforged.json");
            download(baseUrl + "summoner.json", basePath + "summoner.json");
        }
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

    private static boolean netIsAvailable() {
        try {
            URL url = new URL("https://ddragon.leagueoflegends.com/api/versions.json");
            URLConnection con = url.openConnection();
            con.connect();
            con.getInputStream().close();
            return true;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            return false;
        }
    }

    public static Download getInstance() {
        if (instance == null) {
            instance = new Download();
        }
        return instance;
    }
}
