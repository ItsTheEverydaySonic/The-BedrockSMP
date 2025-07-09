package net.itskittyyoutube.kitty.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.itskittyyoutube.kitty.KittysMod;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    public static final Block PLANKS_TEMPLATE = registerBlock("planks_template",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block WHITE_PLANKS = registerBlock("white_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block LIGHT_GRAY_PLANKS = registerBlock("light_gray_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block GRAY_PLANKS = registerBlock("gray_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BLACK_PLANKS = registerBlock("black_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BROWN_PLANKS = registerBlock("brown_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block RED_PLANKS = registerBlock("red_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block ORANGE_PLANKS = registerBlock("orange_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block YELLOW_PLANKS = registerBlock("yellow_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block LIME_PLANKS = registerBlock("lime_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block GREEN_PLANKS = registerBlock("green_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block CYAN_PLANKS = registerBlock("cyan_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block LIGHT_BLUE_PLANKS = registerBlock("light_blue_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BLUE_PLANKS = registerBlock("blue_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block PURPLE_PLANKS = registerBlock("purple_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MAGENTA_PLANKS = registerBlock("magenta_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block PINK_PLANKS = registerBlock("pink_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block DARK_OAK_DOOR_WITH_WINDOW = registerBlock("dark_oak_door_with_window",
            properties -> new DoorBlock(BlockSetType.DARK_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY)));




    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(KittysMod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(KittysMod.MOD_ID, name), toRegister);
    }

    private static Block registerBlockWithoutBlockItem(String name, Function<AbstractBlock.Settings, Block> function) {
        return Registry.register(Registries.BLOCK, Identifier.of(KittysMod.MOD_ID, name),
                function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(KittysMod.MOD_ID, name)))));
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(KittysMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(KittysMod.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        KittysMod.LOGGER.info("Registering Mod Blocks for " + KittysMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(PLANKS_TEMPLATE);
            entries.add(WHITE_PLANKS);
            entries.add(LIGHT_GRAY_PLANKS);
            entries.add(GRAY_PLANKS);
            entries.add(BLACK_PLANKS);
            entries.add(BROWN_PLANKS);
            entries.add(RED_PLANKS);
            entries.add(ORANGE_PLANKS);
            entries.add(YELLOW_PLANKS);
            entries.add(LIME_PLANKS);
            entries.add(GREEN_PLANKS);
            entries.add(CYAN_PLANKS);
            entries.add(LIGHT_BLUE_PLANKS);
            entries.add(BLUE_PLANKS);
            entries.add(PURPLE_PLANKS);
            entries.add(MAGENTA_PLANKS);
            entries.add(PINK_PLANKS);
            entries.add(DARK_OAK_DOOR_WITH_WINDOW);
        });
    }
}