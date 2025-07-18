package net.itskittyyoutube.kitty;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
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

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PLANKS_TEMPLATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_PLANKS, 5, 20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_SLAB, 5, 20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_FENCE_GATE, 5, 20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_FENCE, 5, 20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_STAIRS, 5, 20);
	}
}