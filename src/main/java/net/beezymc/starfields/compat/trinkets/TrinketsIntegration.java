package net.beezymc.starfields.compat.trinkets;

import dev.emi.trinkets.api.client.TrinketRendererRegistry;

import net.beezymc.starfields.item.PlushieItem;
import net.beezymc.starfields.item.RareplushieItem;

import static com.mojang.text2speech.Narrator.LOGGER;

public class TrinketsIntegration {
    public static void registerTrinkets() {
        LOGGER.info("Trinkets Bein Registered aw fuck?");
        TrinketRendererRegistry.registerRenderer(new PlushieItem(), new TrinketsClientRenderer());
        TrinketRendererRegistry.registerRenderer(new RareplushieItem(), new TrinketsClientRenderer());
    }
    }

