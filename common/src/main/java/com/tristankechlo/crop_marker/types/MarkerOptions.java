package com.tristankechlo.crop_marker.types;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record MarkerOptions(int yOffset, boolean animated, boolean hasMarker, MarkerColor color) {

    public static final MarkerOptions DEFAULT = new MarkerOptions(0, false, true, MarkerColor.GREEN);
    public static final Codec<MarkerOptions> CODEC = RecordCodecBuilder.create(
            (instance) -> instance.group(
                    Codec.INT.fieldOf("offset").forGetter(MarkerOptions::yOffset),
                    Codec.BOOL.fieldOf("animated").forGetter(MarkerOptions::animated),
                    Codec.BOOL.fieldOf("hasMarker").forGetter(MarkerOptions::hasMarker),
                    MarkerColor.CODEC.fieldOf("color").forGetter(MarkerOptions::color)
            ).apply(instance, MarkerOptions::new));

}
