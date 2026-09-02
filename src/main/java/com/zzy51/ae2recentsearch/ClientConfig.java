package com.zzy51.ae2recentsearch;

import net.minecraftforge.common.ForgeConfigSpec;

public final class ClientConfig {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.IntValue MAX_VISIBLE_ENTRIES = BUILDER
            .comment("Maximum number of recent search entries shown in the terminal.")
            .defineInRange("maxVisibleEntries", 10, 1, Integer.MAX_VALUE);

    public static final ForgeConfigSpec SPEC = BUILDER.build();

    private ClientConfig() {
    }
}
