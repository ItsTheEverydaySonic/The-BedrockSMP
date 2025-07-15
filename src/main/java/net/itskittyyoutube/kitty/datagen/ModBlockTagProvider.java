package net.itskittyyoutube.kitty.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.itskittyyoutube.kitty.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.WHITE_FENCE)
                .add(ModBlocks.LIGHT_GRAY_FENCE)
                .add(ModBlocks.GRAY_FENCE)
                .add(ModBlocks.BLACK_FENCE)
                .add(ModBlocks.BROWN_FENCE)
                .add(ModBlocks.RED_FENCE)
                .add(ModBlocks.ORANGE_FENCE)
                .add(ModBlocks.YELLOW_FENCE)
                .add(ModBlocks.LIME_FENCE)
                .add(ModBlocks.GREEN_FENCE)
                .add(ModBlocks.CYAN_FENCE)
                .add(ModBlocks.LIGHT_BLUE_FENCE)
                .add(ModBlocks.BLUE_FENCE)
                .add(ModBlocks.PURPLE_FENCE)
                .add(ModBlocks.MAGENTA_FENCE)
                .add(ModBlocks.PINK_FENCE);

        valueLookupBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.WHITE_FENCE_GATE)
                .add(ModBlocks.LIGHT_GRAY_FENCE_GATE)
                .add(ModBlocks.GRAY_FENCE_GATE)
                .add(ModBlocks.BLACK_FENCE_GATE)
                .add(ModBlocks.BROWN_FENCE_GATE)
                .add(ModBlocks.RED_FENCE_GATE)
                .add(ModBlocks.ORANGE_FENCE_GATE)
                .add(ModBlocks.YELLOW_FENCE_GATE)
                .add(ModBlocks.LIME_FENCE_GATE)
                .add(ModBlocks.GREEN_FENCE_GATE)
                .add(ModBlocks.CYAN_FENCE_GATE)
                .add(ModBlocks.LIGHT_BLUE_FENCE_GATE)
                .add(ModBlocks.BLUE_FENCE_GATE)
                .add(ModBlocks.PURPLE_FENCE_GATE)
                .add(ModBlocks.MAGENTA_FENCE_GATE)
                .add(ModBlocks.PINK_FENCE_GATE);

        valueLookupBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.WHITE_DOOR)
                .add(ModBlocks.DARK_OAK_DOOR_WITH_WINDOWS)
                .add(ModBlocks.LIGHT_GRAY_DOOR)
                .add(ModBlocks.GRAY_DOOR)
                .add(ModBlocks.BLACK_DOOR)
                .add(ModBlocks.BROWN_DOOR)
                .add(ModBlocks.RED_DOOR)
                .add(ModBlocks.ORANGE_DOOR)
                .add(ModBlocks.YELLOW_DOOR)
                .add(ModBlocks.LIME_DOOR)
                .add(ModBlocks.GREEN_DOOR)
                .add(ModBlocks.CYAN_DOOR)
                .add(ModBlocks.LIGHT_BLUE_DOOR)
                .add(ModBlocks.BLUE_DOOR)
                .add(ModBlocks.PURPLE_DOOR)
                .add(ModBlocks.MAGENTA_DOOR)
                .add(ModBlocks.PINK_DOOR);

        valueLookupBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.WHITE_TRAPDOOR)
                .add(ModBlocks.DARK_OAK_TRAPDOOR_WITH_WINDOWS)
                .add(ModBlocks.LIGHT_GRAY_TRAPDOOR)
                .add(ModBlocks.GRAY_TRAPDOOR)
                .add(ModBlocks.BLACK_TRAPDOOR)
                .add(ModBlocks.BROWN_TRAPDOOR)
                .add(ModBlocks.RED_TRAPDOOR)
                .add(ModBlocks.ORANGE_TRAPDOOR)
                .add(ModBlocks.YELLOW_TRAPDOOR)
                .add(ModBlocks.LIME_TRAPDOOR)
                .add(ModBlocks.GREEN_TRAPDOOR)
                .add(ModBlocks.CYAN_TRAPDOOR)
                .add(ModBlocks.LIGHT_BLUE_TRAPDOOR)
                .add(ModBlocks.BLUE_TRAPDOOR)
                .add(ModBlocks.PURPLE_TRAPDOOR)
                .add(ModBlocks.MAGENTA_TRAPDOOR)
                .add(ModBlocks.PINK_TRAPDOOR);

        valueLookupBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.WHITE_BUTTON)
                .add(ModBlocks.LIGHT_GRAY_BUTTON)
                .add(ModBlocks.GRAY_BUTTON)
                .add(ModBlocks.BLACK_BUTTON)
                .add(ModBlocks.BROWN_BUTTON)
                .add(ModBlocks.RED_BUTTON)
                .add(ModBlocks.ORANGE_BUTTON)
                .add(ModBlocks.YELLOW_BUTTON)
                .add(ModBlocks.LIME_BUTTON)
                .add(ModBlocks.GREEN_BUTTON)
                .add(ModBlocks.CYAN_BUTTON)
                .add(ModBlocks.LIGHT_BLUE_BUTTON)
                .add(ModBlocks.BLUE_BUTTON)
                .add(ModBlocks.PURPLE_BUTTON)
                .add(ModBlocks.MAGENTA_BUTTON)
                .add(ModBlocks.PINK_BUTTON);

        valueLookupBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.WHITE_SLAB)
                .add(ModBlocks.LIGHT_GRAY_SLAB)
                .add(ModBlocks.GRAY_SLAB)
                .add(ModBlocks.BLACK_SLAB)
                .add(ModBlocks.BROWN_SLAB)
                .add(ModBlocks.RED_SLAB)
                .add(ModBlocks.ORANGE_SLAB)
                .add(ModBlocks.YELLOW_SLAB)
                .add(ModBlocks.LIME_SLAB)
                .add(ModBlocks.GREEN_SLAB)
                .add(ModBlocks.CYAN_SLAB)
                .add(ModBlocks.LIGHT_BLUE_SLAB)
                .add(ModBlocks.BLUE_SLAB)
                .add(ModBlocks.PURPLE_SLAB)
                .add(ModBlocks.MAGENTA_SLAB)
                .add(ModBlocks.PINK_SLAB);

        valueLookupBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.WHITE_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_STAIRS)
                .add(ModBlocks.GRAY_STAIRS)
                .add(ModBlocks.BLACK_STAIRS)
                .add(ModBlocks.BROWN_STAIRS)
                .add(ModBlocks.RED_STAIRS)
                .add(ModBlocks.ORANGE_STAIRS)
                .add(ModBlocks.YELLOW_STAIRS)
                .add(ModBlocks.LIME_STAIRS)
                .add(ModBlocks.GREEN_STAIRS)
                .add(ModBlocks.CYAN_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_STAIRS)
                .add(ModBlocks.BLUE_STAIRS)
                .add(ModBlocks.PURPLE_STAIRS)
                .add(ModBlocks.MAGENTA_STAIRS)
                .add(ModBlocks.PINK_STAIRS);

        valueLookupBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.WHITE_PRESSURE_PLATE)
                .add(ModBlocks.LIGHT_GRAY_PRESSURE_PLATE)
                .add(ModBlocks.GRAY_PRESSURE_PLATE)
                .add(ModBlocks.BLACK_PRESSURE_PLATE)
                .add(ModBlocks.BROWN_PRESSURE_PLATE)
                .add(ModBlocks.RED_PRESSURE_PLATE)
                .add(ModBlocks.ORANGE_PRESSURE_PLATE)
                .add(ModBlocks.YELLOW_PRESSURE_PLATE)
                .add(ModBlocks.LIME_PRESSURE_PLATE)
                .add(ModBlocks.GREEN_PRESSURE_PLATE)
                .add(ModBlocks.CYAN_PRESSURE_PLATE)
                .add(ModBlocks.LIGHT_BLUE_PRESSURE_PLATE)
                .add(ModBlocks.BLUE_PRESSURE_PLATE)
                .add(ModBlocks.PURPLE_PRESSURE_PLATE)
                .add(ModBlocks.MAGENTA_PRESSURE_PLATE)
                .add(ModBlocks.PINK_PRESSURE_PLATE);
    }
}
