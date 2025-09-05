package de.cristelknight.wwoo;

import de.cristelknight.wwoo.config.WWOOConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class WWOO {
    public static final String MOD_ID = "wwoo";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static void init() {
        LOGGER.warn("Loading WWOO");
        WWOOConfig.register();
    }
}