package de.cristelknight.wwoo;

import de.cristelknight.cristellib.api.CristelLibAPI;
import de.cristelknight.cristellib.api.CristelPlugin;
import de.cristelknight.cristellib.builtinpacks.BuiltInDataPackLoader;
import de.cristelknight.cristellib.config.simple.ConfigRegistry;
import de.cristelknight.wwoo.config.WWOOConfig;
import net.minecraft.network.chat.Component;

@CristelPlugin
public class APIImpl implements CristelLibAPI {

    @Override
    public void registerBuiltInPacks() {
        BuiltInDataPackLoader.registerAlwaysOnPack(OORL.create("resources/wwoo_main"), Component.literal("WWOO Main Worldgen Pack"));

        BuiltInDataPackLoader.registerPack(OORL.create("resources/navigable_rivers_add_on"), Component.literal("Navigable Rivers (WWOO add-on)"), () -> ConfigRegistry.get(WWOOConfig.class).navigableRivers());
        BuiltInDataPackLoader.registerPack(OORL.create("resources/cliffs_coves_add_on"), Component.literal("Cliffs & Coves (WWOO add-on)"), () -> ConfigRegistry.get(WWOOConfig.class).cliffsAndCoves());
        BuiltInDataPackLoader.registerPack(OORL.create("resources/towering_tepuis_add_on"), Component.literal("Towering Tepuis (WWOO add-on)"), () -> ConfigRegistry.get(WWOOConfig.class).toweringTepuis());
    }

}