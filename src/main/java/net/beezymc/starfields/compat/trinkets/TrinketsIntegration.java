package net.beezymc.starfields.compat.trinkets;

import dev.emi.trinkets.api.client.TrinketRendererRegistry;
import net.beezymc.starfields.init.StarfieldsModItems;

import static com.mojang.text2speech.Narrator.LOGGER;

public class TrinketsIntegration {
    public static void registerTrinkets() {
        LOGGER.info("Trinkets Bein Registered aw fuck?");
        TrinketRendererRegistry.registerRenderer(StarfieldsModItems.PLUSHIE, new TrinketsClientRenderer());
        TrinketRendererRegistry.registerRenderer(StarfieldsModItems.RARE_PLUSHIE, new TrinketsClientRenderer());
    }
}

