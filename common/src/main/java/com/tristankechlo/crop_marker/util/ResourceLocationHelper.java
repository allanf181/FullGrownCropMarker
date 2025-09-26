package com.tristankechlo.crop_marker.util;

import net.minecraft.resources.ResourceLocation;

public interface ResourceLocationHelper {

    static boolean FullGrownCropMarker$shouldHaveMarker(ResourceLocation id) {
        try {
            return ((ResourceLocationHelper) (Object) id).FullGrownCropMarker$shouldHaveMarker();
        } catch (ClassCastException e) {
            return false;
        }
    }

    void FullGrownCropMarker$setShouldHaveMarker(boolean hasMarker);

    boolean FullGrownCropMarker$shouldHaveMarker();

}
