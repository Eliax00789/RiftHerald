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
    private final String baseUrl;
    private final String basePath;

    public Download() {
        versionsJSON();
        languagesJSON();
        baseUrl = "https://ddragon.leagueoflegends.com/cdn/" + Version.getInstance().get() + "/data/";
        basePath = "offline/RiftHerald/";
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
            download(baseUrl + Language.getInstance().get() + "/challenges.json",basePath + Language.getInstance().get() + "/challenges.json");
        }
    }
    public void championJSON() {
        if (netIsAvailable()) {
            download(baseUrl + Language.getInstance().get() + "/championFull.json",basePath + Language.getInstance().get() + "/championFull.json");
        }
    }
    public void itemJSON() {
        if (netIsAvailable()) {
            download(baseUrl + Language.getInstance().get() + "/item.json",basePath + Language.getInstance().get() + "/item.json");
        }
    }
    public void languageJSON() {
        if (netIsAvailable()) {
            download(baseUrl + Language.getInstance().get() + "/language.json",basePath + Language.getInstance().get() + "/language.json");
        }
    }
    public void mapJSON() {
        if (netIsAvailable()) {
            download(baseUrl + Language.getInstance().get() + "/map.json",basePath + Language.getInstance().get() + "/map.json");
        }
    }
    public void minionAssetsJSON() {
        if (netIsAvailable()) {
            download(baseUrl + Language.getInstance().get() + "/mission-assets.json",basePath + Language.getInstance().get() + "/mission-assets.json");
        }
    }
    public void profileIconJSON() {
        if (netIsAvailable()) {
            download(baseUrl + Language.getInstance().get() + "/profileicon.json",basePath + Language.getInstance().get() + "/profileicon.json");
        }
    }
    public void runesReforgedJSON() {
        if (netIsAvailable()) {
            download(baseUrl + Language.getInstance().get() + "/runesReforged.json",basePath + Language.getInstance().get() + "/runesReforged.json");
        }
    }
    public void summonerJSON() {
        if (netIsAvailable()) {
            download(baseUrl + Language.getInstance().get() + "/summoner.json",basePath + Language.getInstance().get() + "/summoner.json");
        }
    }
    public void allJSON() {
        if (netIsAvailable()) {
            download(baseUrl + Language.getInstance().get() + "/challenges.json", basePath + Language.getInstance().get() + "/challenges.json");
            download(baseUrl + Language.getInstance().get() + "/championFull.json", basePath + Language.getInstance().get() + "/championFull.json");
            download(baseUrl + Language.getInstance().get() + "/item.json", basePath + Language.getInstance().get() + "/item.json");
            download(baseUrl + Language.getInstance().get() + "/language.json", basePath + Language.getInstance().get() + "/language.json");
            download(baseUrl + Language.getInstance().get() + "/map.json", basePath + Language.getInstance().get() + "/map.json");
            download(baseUrl + Language.getInstance().get() + "/mission-assets.json", basePath + Language.getInstance().get() + "/mission-assets.json");
            download(baseUrl + Language.getInstance().get() + "/profileicon.json", basePath + Language.getInstance().get() + "/profileicon.json");
            download(baseUrl + Language.getInstance().get() + "/runesReforged.json", basePath + Language.getInstance().get() + "/runesReforged.json");
            download(baseUrl + Language.getInstance().get() + "/summoner.json", basePath + Language.getInstance().get() + "/summoner.json");
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
