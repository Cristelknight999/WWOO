package de.cristelknight.wwoo;

import net.minecraft.resources.ResourceLocation;

public class OORL {

    public static ResourceLocation create(String path){
        return ResourceLocation.fromNamespaceAndPath(WWOO.MOD_ID, path);
    }

    public static String asString(String path) {
        return WWOO.MOD_ID + ":" + path;
    }
}