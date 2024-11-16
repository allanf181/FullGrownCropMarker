package com.tristankechlo.crop_marker.platform;

import com.tristankechlo.crop_marker.FullGrownCropMarker;

import java.nio.file.Path;

public interface IPlatformHelper {

    IPlatformHelper INSTANCE = FullGrownCropMarker.load(IPlatformHelper.class);

    String getPlatformName();

    boolean isModLoaded(String modId);

    boolean isDevelopmentEnvironment();

    default String getEnvironmentName() {

        return isDevelopmentEnvironment() ? "development" : "production";
    }

    Path getConfigDirectory();

}