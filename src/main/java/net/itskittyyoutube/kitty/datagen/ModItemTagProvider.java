package net.itskittyyoutube.kitty.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.itskittyyoutube.kitty.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ItemTags.PLANKS)
                .add(ModBlocks.PLANKS_TEMPLATE.asItem())
                .add(ModBlocks.WHITE_PLANKS.asItem())
                .add(ModBlocks.LIGHT_GRAY_PLANKS.asItem())
                .add(ModBlocks.GRAY_PLANKS.asItem())
                .add(ModBlocks.BLACK_PLANKS.asItem())
                .add(ModBlocks.BROWN_PLANKS.asItem())
                .add(ModBlocks.RED_PLANKS.asItem())
                .add(ModBlocks.ORANGE_PLANKS.asItem())
                .add(ModBlocks.YELLOW_PLANKS.asItem())
                .add(ModBlocks.LIME_PLANKS.asItem())
                .add(ModBlocks.GREEN_PLANKS.asItem())
                .add(ModBlocks.CYAN_PLANKS.asItem())
                .add(ModBlocks.LIGHT_BLUE_PLANKS.asItem())
                .add(ModBlocks.BLUE_PLANKS.asItem())
                .add(ModBlocks.PURPLE_PLANKS.asItem())
                .add(ModBlocks.MAGENTA_PLANKS.asItem())
                .add(ModBlocks.PINK_PLANKS.asItem());

        valueLookupBuilder(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.WHITE_FENCE.asItem())
                .add(ModBlocks.LIGHT_GRAY_FENCE.asItem())
                .add(ModBlocks.GRAY_FENCE.asItem())
                .add(ModBlocks.BLACK_FENCE.asItem())
                .add(ModBlocks.BROWN_FENCE.asItem())
                .add(ModBlocks.RED_FENCE.asItem())
                .add(ModBlocks.ORANGE_FENCE.asItem())
                .add(ModBlocks.YELLOW_FENCE.asItem())
                .add(ModBlocks.LIME_FENCE.asItem())
                .add(ModBlocks.GREEN_FENCE.asItem())
                .add(ModBlocks.CYAN_FENCE.asItem())
                .add(ModBlocks.LIGHT_BLUE_FENCE.asItem())
                .add(ModBlocks.BLUE_FENCE.asItem())
                .add(ModBlocks.PURPLE_FENCE.asItem())
                .add(ModBlocks.MAGENTA_FENCE.asItem())
                .add(ModBlocks.PINK_FENCE.asItem());

        valueLookupBuilder(ItemTags.FENCE_GATES)
                .add(ModBlocks.WHITE_FENCE_GATE.asItem())
                .add(ModBlocks.LIGHT_GRAY_FENCE_GATE.asItem())
                .add(ModBlocks.GRAY_FENCE_GATE.asItem())
                .add(ModBlocks.BLACK_FENCE_GATE.asItem())
                .add(ModBlocks.BROWN_FENCE_GATE.asItem())
                .add(ModBlocks.RED_FENCE_GATE.asItem())
                .add(ModBlocks.ORANGE_FENCE_GATE.asItem())
                .add(ModBlocks.YELLOW_FENCE_GATE.asItem())
                .add(ModBlocks.LIME_FENCE_GATE.asItem())
                .add(ModBlocks.GREEN_FENCE_GATE.asItem())
                .add(ModBlocks.CYAN_FENCE_GATE.asItem())
                .add(ModBlocks.LIGHT_BLUE_FENCE_GATE.asItem())
                .add(ModBlocks.BLUE_FENCE_GATE.asItem())
                .add(ModBlocks.PURPLE_FENCE_GATE.asItem())
                .add(ModBlocks.MAGENTA_FENCE_GATE.asItem())
                .add(ModBlocks.PINK_FENCE_GATE.asItem());

        valueLookupBuilder(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.WHITE_DOOR.asItem())
                .add(ModBlocks.DARK_OAK_DOOR_WITH_WINDOWS.asItem())
                .add(ModBlocks.LIGHT_GRAY_DOOR.asItem())
                .add(ModBlocks.GRAY_DOOR.asItem())
                .add(ModBlocks.BLACK_DOOR.asItem())
                .add(ModBlocks.BROWN_DOOR.asItem())
                .add(ModBlocks.RED_DOOR.asItem())
                .add(ModBlocks.ORANGE_DOOR.asItem())
                .add(ModBlocks.YELLOW_DOOR.asItem())
                .add(ModBlocks.LIME_DOOR.asItem())
                .add(ModBlocks.GREEN_DOOR.asItem())
                .add(ModBlocks.CYAN_DOOR.asItem())
                .add(ModBlocks.LIGHT_BLUE_DOOR.asItem())
                .add(ModBlocks.BLUE_DOOR.asItem())
                .add(ModBlocks.PURPLE_DOOR.asItem())
                .add(ModBlocks.MAGENTA_DOOR.asItem())
                .add(ModBlocks.PINK_DOOR.asItem());

        valueLookupBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.WHITE_TRAPDOOR.asItem())
                .add(ModBlocks.DARK_OAK_TRAPDOOR_WITH_WINDOWS.asItem())
                .add(ModBlocks.LIGHT_GRAY_TRAPDOOR.asItem())
                .add(ModBlocks.GRAY_TRAPDOOR.asItem())
                .add(ModBlocks.BLACK_TRAPDOOR.asItem())
                .add(ModBlocks.BROWN_TRAPDOOR.asItem())
                .add(ModBlocks.RED_TRAPDOOR.asItem())
                .add(ModBlocks.ORANGE_TRAPDOOR.asItem())
                .add(ModBlocks.YELLOW_TRAPDOOR.asItem())
                .add(ModBlocks.LIME_TRAPDOOR.asItem())
                .add(ModBlocks.GREEN_TRAPDOOR.asItem())
                .add(ModBlocks.CYAN_TRAPDOOR.asItem())
                .add(ModBlocks.LIGHT_BLUE_TRAPDOOR.asItem())
                .add(ModBlocks.BLUE_TRAPDOOR.asItem())
                .add(ModBlocks.PURPLE_TRAPDOOR.asItem())
                .add(ModBlocks.MAGENTA_TRAPDOOR.asItem())
                .add(ModBlocks.PINK_TRAPDOOR.asItem());

        valueLookupBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(Items.COBBLESTONE)
                .add(Items.BLACKSTONE)
                .add(Items.COBBLED_DEEPSLATE)
                .add(Items.ANDESITE)
                .add(Items.BASALT)
                .add(Items.DIORITE)
                .add(Items.GRANITE)
                .add(Items.TUFF)
                .add(Items.STONE)
                .add(Items.DEEPSLATE)
                .add(Items.END_STONE)
                .add(Items.NETHERRACK)
                .add(Items.SANDSTONE)
                .add(Items.RED_SANDSTONE)
                .add(Items.PRISMARINE)
                .add(Items.BRICKS)
                .add(Items.RESIN_BRICKS)
                .add(Items.MUD_BRICKS);

        valueLookupBuilder(ItemTags.STONE_TOOL_MATERIALS)
                .add(Items.COBBLESTONE)
                .add(Items.BLACKSTONE)
                .add(Items.COBBLED_DEEPSLATE)
                .add(Items.ANDESITE)
                .add(Items.BASALT)
                .add(Items.DIORITE)
                .add(Items.GRANITE)
                .add(Items.TUFF)
                .add(Items.STONE)
                .add(Items.DEEPSLATE)
                .add(Items.END_STONE)
                .add(Items.NETHERRACK)
                .add(Items.SANDSTONE)
                .add(Items.RED_SANDSTONE)
                .add(Items.PRISMARINE)
                .add(Items.BRICKS)
                .add(Items.RESIN_BRICKS)
                .add(Items.MUD_BRICKS);
    }
}