package net.mythicalrev.testmod;

import net.fabricmc.api.ModInitializer;

import net.mythicalrev.testmod.block.ModBlocks;
import net.mythicalrev.testmod.item.ModItemGroups;
import net.mythicalrev.testmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();
	}
}