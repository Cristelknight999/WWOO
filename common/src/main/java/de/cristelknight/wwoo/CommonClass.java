package de.cristelknight.wwoo;

import de.cristelknight.wwoo.config.WWOOConfig;

public class CommonClass {

    public static void init() {
        Constants.LOG.debug("Loading WWOO");
        WWOOConfig.register();
    }
}