package net.beezymc.starfields;

import net.beezymc.starfields.compat.trinkets.TrinketsIntegration;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ClientInit implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		if (StarfieldsMod.IS_TRINKETS_LOADED) {
			TrinketsIntegration.registerTrinkets();
		}
	}
}
