
package net.beezymc.starfields;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.api.ModInitializer;

import net.beezymc.starfields.init.StarfieldsModItems;


public class StarfieldsMod implements ModInitializer {
	public static final String MOD_VERSION = "1.0.1";
	public static final String MOD_ID = "starfields";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final boolean IS_TRINKETS_LOADED = FabricLoader.getInstance().getModContainer("trinkets").isPresent();


	@Override
	public void onInitialize() {
		LOGGER.info("Initializing StarfieldsMod");
		StarfieldsModItems.load();

	}
}
