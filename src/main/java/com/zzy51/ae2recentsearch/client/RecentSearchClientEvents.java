package com.zzy51.ae2recentsearch.client;

import com.zzy51.ae2recentsearch.AE2RecentSearch;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AE2RecentSearch.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class RecentSearchClientEvents {
    private RecentSearchClientEvents() {
    }

    @SubscribeEvent
    public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
        RecentSearchKeyMappings.register(event);
    }
}
