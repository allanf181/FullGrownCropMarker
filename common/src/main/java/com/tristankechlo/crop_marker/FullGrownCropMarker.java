package com.tristankechlo.crop_marker;

import com.tristankechlo.crop_marker.config.ConfigManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ServiceLoader;

public final class FullGrownCropMarker {

    public static final String MOD_ID = "crop_marker";
    public static final String MOD_NAME = "FullGrownCropMarker";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);
    public static final String GITHUB_URL = "https://github.com/tristankechlo/FullGrownCropMarker";
    public static final String GITHUB_ISSUE_URL = GITHUB_URL + "/issues";
    public static final String GITHUB_WIKI_URL = GITHUB_URL + "/wiki";
    public static final String DISCORD_URL = "https://discord.gg/bhUaWhq";
    public static final String CURSEFORGE_URL = "https://curseforge.com/minecraft/mc-mods/full-grown-crop-marker";
    public static final String MODRINTH_URL = "https://modrinth.com/mod/full-grown-crop-marker";

    public static void init() {
        LOGGER.info("FullGrownCropMarker is loading...");
        ConfigManager.loadAndVerifyConfig();
    }

    public static <T> T load(Class<T> clazz) {
        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        LOGGER.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }

}
