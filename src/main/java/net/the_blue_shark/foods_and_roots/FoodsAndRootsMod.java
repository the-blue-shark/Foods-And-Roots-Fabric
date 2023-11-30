package net.the_blue_shark.foods_and_roots;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodsAndRootsMod implements ModInitializer {
	public static final String MOD_ID = "foods_and_roots";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Everyone!");
	}
}