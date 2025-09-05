package de.cristelknight.wwoo.fabric;

import net.fabricmc.api.ModInitializer;

import de.cristelknight.wwoo.WWOO;

public final class WWOOFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        WWOO.init();
    }
}
