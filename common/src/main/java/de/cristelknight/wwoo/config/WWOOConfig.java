package de.cristelknight.wwoo.config;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import de.cristelknight.cristellib.config.simple.ConfigRegistry;
import de.cristelknight.cristellib.config.simple.ConfigSettings;
import de.cristelknight.wwoo.WWOO;
import net.minecraft.Util;

import java.util.HashMap;

public record WWOOConfig(
        boolean navigableRivers,
        boolean cliffsAndCoves,
        boolean toweringTepuis
) {

    public static final Codec<WWOOConfig> CODEC = RecordCodecBuilder.create(builder ->
            builder.group(
                    Codec.BOOL.fieldOf("navigableRivers").forGetter(WWOOConfig::navigableRivers),
                    Codec.BOOL.fieldOf("cliffsAndCoves").forGetter(WWOOConfig::cliffsAndCoves),
                    Codec.BOOL.fieldOf("toweringTepuis").forGetter(WWOOConfig::toweringTepuis)
            ).apply(builder, WWOOConfig::new)
    );

    public static final ConfigSettings<WWOOConfig> SETTINGS = new ConfigSettings<>() {
        @Override
        public String getSubPath() {
            return WWOO.MOD_ID + "/config";
        }

        @Override
        public Codec<WWOOConfig> getCodec() {
            return CODEC;
        }

        @Override
        public WWOOConfig getDefault() {
            return new WWOOConfig(
                    false,
                    false,
                    false
            );
        }

        @Override
        public String getHeader() {
            return """
                   WWOO add-on Config
                   The config to enable various add-ons for William Wythers' Overhauled Overworld!
                   """;
        }

        @Override
        public HashMap<String, String> getComments() {
            return Util.make(new HashMap<>(), map -> {
                map.put("navigableRivers", """
                    This add-on modifies rivers to make them a viable method of travel.""");
                map.put("cliffsAndCoves", """
                    This add-on makes coastlines more interesting, creating nice flat beached coves, rugged rocky escarpments, and rocky pools.""");
                map.put("toweringTepuis", """
                    This add-on adds tepuis to mountainous regions bordering the Jungle biome.""");
            });
        }
    };

    public static void register() {
        ConfigRegistry.registerWithScreen(WWOOConfig.class, SETTINGS,
                WWOO.MOD_ID, "Auto-config", () -> {});
    }
}
