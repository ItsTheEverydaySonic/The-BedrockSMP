package net.itskittyyoutube.kitty;

import net.fabricmc.api.ModInitializer;

import net.itskittyyoutube.kitty.block.ModBlocks;
import net.itskittyyoutube.kitty.groups.ModGroups;
import net.itskittyyoutube.kitty.item.ModItems;
import net.itskittyyoutube.kitty.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KittysMod implements ModInitializer {
	public static final String MOD_ID = "kitty";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModSounds.registerSounds();
		ModGroups.registerGroups();
		ModBlocks.registerModBlocks();
	}
}