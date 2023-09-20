package net.beezymc.starfields.init;

import net.beezymc.starfields.StarfieldsMod;
import net.beezymc.starfields.item.PlushieItem;
import net.beezymc.starfields.item.RarePlushieItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class StarfieldsModItems {
	public static final Item PLUSHIE = register("plushie", new PlushieItem());
	public static final Item RARE_PLUSHIE = register("rare_plushie", new RarePlushieItem());

	public static void load() {
		StarfieldsMod.LOGGER.info("ITEMS GOT INITIALIZED?");
	}

	private static Item register(String path, Item item) {
		return Registry.register(Registries.ITEM, StarfieldsMod.id(path), item);
	}
}