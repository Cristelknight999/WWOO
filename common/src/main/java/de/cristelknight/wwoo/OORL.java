package de.cristelknight.wwoo;

import net.minecraft.resources.Identifier;

public class OORL {

    public static Identifier create(String path){
        return Identifier.fromNamespaceAndPath(WWOO.MOD_ID, path);
    }

    public static String asString(String path) {
        return WWOO.MOD_ID + ":" + path;
    }
}
