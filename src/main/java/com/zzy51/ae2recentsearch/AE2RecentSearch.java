package com.zzy51.ae2recentsearch;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(AE2RecentSearch.MOD_ID)
public final class AE2RecentSearch {
    public static final String MOD_ID = "ae2_recent_search";

    public AE2RecentSearch() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ClientConfig.SPEC);
    }
}
