package net.beezymc.starfields;

import net.beezymc.starfields.init.StarfieldsModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StarfieldsMod implements ModInitializer {
	public static final String MOD_ID = "starfields";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final boolean IS_TRINKETS_LOADED = FabricLoader.getInstance().isModLoaded("trinkets");

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing StarfieldsMod");
		StarfieldsModItems.load();
	}
}
