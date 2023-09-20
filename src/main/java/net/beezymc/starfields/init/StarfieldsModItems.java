package net.beezymc.starfields.init;

import net.beezymc.starfields.StarfieldsMod;
import net.beezymc.starfields.item.PlushieItem;
import net.beezymc.starfields.item.RareplushieItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.mojang.text2speech.Narrator.LOGGER;


public class StarfieldsModItems {
	public static Item RARE_PLUSHIE;
	public static Item PLUSHIE;

	public static void load() {
		LOGGER.info("ITEMS GOT INITIALIZED?");
		RARE_PLUSHIE = Registry.register(Registries.ITEM, new Identifier(StarfieldsMod.MOD_ID, "rare_plushie"), new RareplushieItem());
		PLUSHIE = Registry.register(Registries.ITEM, new Identifier(StarfieldsMod.MOD_ID, "plushie"), new PlushieItem());
	}

}