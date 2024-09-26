package de.cristelknight.wwoo.fabric;

import net.fabricmc.api.ModInitializer;

import de.cristelknight.wwoo.WWOO;

public final class WWOOFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        WWOO.init();
    }
}
