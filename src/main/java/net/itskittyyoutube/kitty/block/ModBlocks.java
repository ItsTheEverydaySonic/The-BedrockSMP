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

    public static final Block DARK_OAK_DOOR_WITH_WINDOWS = registerBlock("dark_oak_door_with_windows",
            properties -> new DoorBlock(BlockSetType.DARK_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DARK_OAK_TRAPDOOR_WITH_WINDOWS = registerBlock("dark_oak_trapdoor_with_windows",
            properties -> new TrapdoorBlock(BlockSetType.DARK_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable()));

    public static final Block WHITE_DOOR = registerBlock("white_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block WHITE_TRAPDOOR = registerBlock("white_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block WHITE_BUTTON = registerBlock("white_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block WHITE_PRESSURE_PLATE = registerBlock("white_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block WHITE_STAIRS = registerBlock("white_stairs",
            properties -> new StairsBlock(ModBlocks.WHITE_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block WHITE_SLAB = registerBlock("white_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block WHITE_FENCE = registerBlock("white_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block WHITE_FENCE_GATE = registerBlock("white_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block LIGHT_GRAY_DOOR = registerBlock("light_gray_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_TRAPDOOR = registerBlock("light_gray_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_BUTTON = registerBlock("light_gray_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_PRESSURE_PLATE = registerBlock("light_gray_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_STAIRS = registerBlock("light_gray_stairs",
            properties -> new StairsBlock(ModBlocks.LIGHT_GRAY_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_SLAB = registerBlock("light_gray_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_FENCE = registerBlock("light_gray_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_FENCE_GATE = registerBlock("light_gray_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block GRAY_DOOR = registerBlock("gray_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_TRAPDOOR = registerBlock("gray_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_BUTTON = registerBlock("gray_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_PRESSURE_PLATE = registerBlock("gray_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_STAIRS = registerBlock("gray_stairs",
            properties -> new StairsBlock(ModBlocks.GRAY_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_SLAB = registerBlock("gray_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_FENCE = registerBlock("gray_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_FENCE_GATE = registerBlock("gray_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block BLACK_DOOR = registerBlock("black_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_TRAPDOOR = registerBlock("black_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_BUTTON = registerBlock("black_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_PRESSURE_PLATE = registerBlock("black_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_STAIRS = registerBlock("black_stairs",
            properties -> new StairsBlock(ModBlocks.BLACK_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_SLAB = registerBlock("black_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_FENCE = registerBlock("black_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_FENCE_GATE = registerBlock("black_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block BROWN_DOOR = registerBlock("brown_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_TRAPDOOR = registerBlock("brown_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_BUTTON = registerBlock("brown_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_PRESSURE_PLATE = registerBlock("brown_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_STAIRS = registerBlock("brown_stairs",
            properties -> new StairsBlock(ModBlocks.BROWN_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_SLAB = registerBlock("brown_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_FENCE = registerBlock("brown_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_FENCE_GATE = registerBlock("brown_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block RED_DOOR = registerBlock("red_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_TRAPDOOR = registerBlock("red_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_BUTTON = registerBlock("red_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_PRESSURE_PLATE = registerBlock("red_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_STAIRS = registerBlock("red_stairs",
            properties -> new StairsBlock(ModBlocks.RED_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_SLAB = registerBlock("red_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_FENCE = registerBlock("red_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_FENCE_GATE = registerBlock("red_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block ORANGE_DOOR = registerBlock("orange_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_TRAPDOOR = registerBlock("orange_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_BUTTON = registerBlock("orange_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_PRESSURE_PLATE = registerBlock("orange_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_STAIRS = registerBlock("orange_stairs",
            properties -> new StairsBlock(ModBlocks.ORANGE_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_SLAB = registerBlock("orange_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_FENCE = registerBlock("orange_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_FENCE_GATE = registerBlock("orange_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block YELLOW_DOOR = registerBlock("yellow_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_TRAPDOOR = registerBlock("yellow_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_BUTTON = registerBlock("yellow_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_PRESSURE_PLATE = registerBlock("yellow_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_STAIRS = registerBlock("yellow_stairs",
            properties -> new StairsBlock(ModBlocks.YELLOW_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_SLAB = registerBlock("yellow_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_FENCE = registerBlock("yellow_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_FENCE_GATE = registerBlock("yellow_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block LIME_DOOR = registerBlock("lime_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_TRAPDOOR = registerBlock("lime_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_BUTTON = registerBlock("lime_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_PRESSURE_PLATE = registerBlock("lime_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_STAIRS = registerBlock("lime_stairs",
            properties -> new StairsBlock(ModBlocks.LIME_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_SLAB = registerBlock("lime_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_FENCE = registerBlock("lime_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_FENCE_GATE = registerBlock("lime_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block GREEN_DOOR = registerBlock("green_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_TRAPDOOR = registerBlock("green_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_BUTTON = registerBlock("green_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_PRESSURE_PLATE = registerBlock("green_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_STAIRS = registerBlock("green_stairs",
            properties -> new StairsBlock(ModBlocks.GREEN_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_SLAB = registerBlock("green_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_FENCE = registerBlock("green_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_FENCE_GATE = registerBlock("green_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block CYAN_DOOR = registerBlock("cyan_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_TRAPDOOR = registerBlock("cyan_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_BUTTON = registerBlock("cyan_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_PRESSURE_PLATE = registerBlock("cyan_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_STAIRS = registerBlock("cyan_stairs",
            properties -> new StairsBlock(ModBlocks.CYAN_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_SLAB = registerBlock("cyan_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_FENCE = registerBlock("cyan_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_FENCE_GATE = registerBlock("cyan_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block LIGHT_BLUE_DOOR = registerBlock("light_blue_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_TRAPDOOR = registerBlock("light_blue_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_BUTTON = registerBlock("light_blue_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_PRESSURE_PLATE = registerBlock("light_blue_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_STAIRS = registerBlock("light_blue_stairs",
            properties -> new StairsBlock(ModBlocks.LIGHT_BLUE_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_SLAB = registerBlock("light_blue_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_FENCE = registerBlock("light_blue_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_FENCE_GATE = registerBlock("light_blue_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block BLUE_DOOR = registerBlock("blue_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_TRAPDOOR = registerBlock("blue_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_BUTTON = registerBlock("blue_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_PRESSURE_PLATE = registerBlock("blue_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_STAIRS = registerBlock("blue_stairs",
            properties -> new StairsBlock(ModBlocks.BLUE_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_SLAB = registerBlock("blue_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_FENCE = registerBlock("blue_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_FENCE_GATE = registerBlock("blue_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block PURPLE_DOOR = registerBlock("purple_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_TRAPDOOR = registerBlock("purple_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_BUTTON = registerBlock("purple_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_PRESSURE_PLATE = registerBlock("purple_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_STAIRS = registerBlock("purple_stairs",
            properties -> new StairsBlock(ModBlocks.PURPLE_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_SLAB = registerBlock("purple_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_FENCE = registerBlock("purple_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_FENCE_GATE = registerBlock("purple_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block MAGENTA_DOOR = registerBlock("magenta_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_TRAPDOOR = registerBlock("magenta_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_BUTTON = registerBlock("magenta_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_PRESSURE_PLATE = registerBlock("magenta_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_STAIRS = registerBlock("magenta_stairs",
            properties -> new StairsBlock(ModBlocks.MAGENTA_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_SLAB = registerBlock("magenta_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_FENCE = registerBlock("magenta_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_FENCE_GATE = registerBlock("magenta_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static final Block PINK_DOOR = registerBlock("pink_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_TRAPDOOR = registerBlock("pink_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_BUTTON = registerBlock("pink_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_PRESSURE_PLATE = registerBlock("pink_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_STAIRS = registerBlock("pink_stairs",
            properties -> new StairsBlock(ModBlocks.PINK_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_SLAB = registerBlock("pink_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_FENCE = registerBlock("pink_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_FENCE_GATE = registerBlock("pink_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));



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
            entries.add(WHITE_STAIRS);
            entries.add(WHITE_SLAB);
            entries.add(WHITE_FENCE);
            entries.add(WHITE_FENCE_GATE);
            entries.add(WHITE_DOOR);
            entries.add(WHITE_TRAPDOOR);
            entries.add(WHITE_PRESSURE_PLATE);
            entries.add(WHITE_BUTTON);
            entries.add(LIGHT_GRAY_PLANKS);
            entries.add(LIGHT_GRAY_STAIRS);
            entries.add(LIGHT_GRAY_SLAB);
            entries.add(LIGHT_GRAY_FENCE);
            entries.add(LIGHT_GRAY_FENCE_GATE);
            entries.add(LIGHT_GRAY_DOOR);
            entries.add(LIGHT_GRAY_TRAPDOOR);
            entries.add(LIGHT_GRAY_PRESSURE_PLATE);
            entries.add(LIGHT_GRAY_BUTTON);
            entries.add(GRAY_PLANKS);
            entries.add(GRAY_STAIRS);
            entries.add(GRAY_SLAB);
            entries.add(GRAY_FENCE);
            entries.add(GRAY_FENCE_GATE);
            entries.add(GRAY_DOOR);
            entries.add(GRAY_TRAPDOOR);
            entries.add(GRAY_PRESSURE_PLATE);
            entries.add(GRAY_BUTTON);
            entries.add(BLACK_PLANKS);
            entries.add(BLACK_STAIRS);
            entries.add(BLACK_SLAB);
            entries.add(BLACK_FENCE);
            entries.add(BLACK_FENCE_GATE);
            entries.add(BLACK_DOOR);
            entries.add(BLACK_TRAPDOOR);
            entries.add(BLACK_PRESSURE_PLATE);
            entries.add(BLACK_BUTTON);
            entries.add(BROWN_PLANKS);
            entries.add(BROWN_STAIRS);
            entries.add(BROWN_SLAB);
            entries.add(BROWN_FENCE);
            entries.add(BROWN_FENCE_GATE);
            entries.add(BROWN_DOOR);
            entries.add(BROWN_TRAPDOOR);
            entries.add(BROWN_PRESSURE_PLATE);
            entries.add(BROWN_BUTTON);
            entries.add(RED_PLANKS);
            entries.add(RED_STAIRS);
            entries.add(RED_SLAB);
            entries.add(RED_FENCE);
            entries.add(RED_FENCE_GATE);
            entries.add(RED_DOOR);
            entries.add(RED_TRAPDOOR);
            entries.add(RED_PRESSURE_PLATE);
            entries.add(RED_BUTTON);
            entries.add(ORANGE_PLANKS);
            entries.add(ORANGE_STAIRS);
            entries.add(ORANGE_SLAB);
            entries.add(ORANGE_FENCE);
            entries.add(ORANGE_FENCE_GATE);
            entries.add(ORANGE_DOOR);
            entries.add(ORANGE_TRAPDOOR);
            entries.add(ORANGE_PRESSURE_PLATE);
            entries.add(ORANGE_BUTTON);
            entries.add(YELLOW_PLANKS);
            entries.add(YELLOW_STAIRS);
            entries.add(YELLOW_SLAB);
            entries.add(YELLOW_FENCE);
            entries.add(YELLOW_FENCE_GATE);
            entries.add(YELLOW_DOOR);
            entries.add(YELLOW_TRAPDOOR);
            entries.add(YELLOW_PRESSURE_PLATE);
            entries.add(YELLOW_BUTTON);
            entries.add(LIME_PLANKS);
            entries.add(LIME_STAIRS);
            entries.add(LIME_SLAB);
            entries.add(LIME_FENCE);
            entries.add(LIME_FENCE_GATE);
            entries.add(LIME_DOOR);
            entries.add(LIME_TRAPDOOR);
            entries.add(LIME_PRESSURE_PLATE);
            entries.add(LIME_BUTTON);
            entries.add(GREEN_PLANKS);
            entries.add(GREEN_STAIRS);
            entries.add(GREEN_SLAB);
            entries.add(GREEN_FENCE);
            entries.add(GREEN_FENCE_GATE);
            entries.add(GREEN_DOOR);
            entries.add(GREEN_TRAPDOOR);
            entries.add(GREEN_PRESSURE_PLATE);
            entries.add(GREEN_BUTTON);
            entries.add(CYAN_PLANKS);
            entries.add(CYAN_STAIRS);
            entries.add(CYAN_SLAB);
            entries.add(CYAN_FENCE);
            entries.add(CYAN_FENCE_GATE);
            entries.add(CYAN_DOOR);
            entries.add(CYAN_TRAPDOOR);
            entries.add(CYAN_PRESSURE_PLATE);
            entries.add(CYAN_BUTTON);
            entries.add(LIGHT_BLUE_PLANKS);
            entries.add(LIGHT_BLUE_STAIRS);
            entries.add(LIGHT_BLUE_SLAB);
            entries.add(LIGHT_BLUE_FENCE);
            entries.add(LIGHT_BLUE_FENCE_GATE);
            entries.add(LIGHT_BLUE_DOOR);
            entries.add(LIGHT_BLUE_TRAPDOOR);
            entries.add(LIGHT_BLUE_PRESSURE_PLATE);
            entries.add(LIGHT_BLUE_BUTTON);
            entries.add(BLUE_PLANKS);
            entries.add(BLUE_STAIRS);
            entries.add(BLUE_SLAB);
            entries.add(BLUE_FENCE);
            entries.add(BLUE_FENCE_GATE);
            entries.add(BLUE_DOOR);
            entries.add(BLUE_TRAPDOOR);
            entries.add(BLUE_PRESSURE_PLATE);
            entries.add(BLUE_BUTTON);
            entries.add(PURPLE_PLANKS);
            entries.add(PURPLE_STAIRS);
            entries.add(PURPLE_SLAB);
            entries.add(PURPLE_FENCE);
            entries.add(PURPLE_FENCE_GATE);
            entries.add(PURPLE_DOOR);
            entries.add(PURPLE_TRAPDOOR);
            entries.add(PURPLE_PRESSURE_PLATE);
            entries.add(PURPLE_BUTTON);
            entries.add(MAGENTA_PLANKS);
            entries.add(MAGENTA_STAIRS);
            entries.add(MAGENTA_SLAB);
            entries.add(MAGENTA_FENCE);
            entries.add(MAGENTA_FENCE_GATE);
            entries.add(MAGENTA_DOOR);
            entries.add(MAGENTA_TRAPDOOR);
            entries.add(MAGENTA_PRESSURE_PLATE);
            entries.add(MAGENTA_BUTTON);
            entries.add(PINK_PLANKS);
            entries.add(PINK_STAIRS);
            entries.add(PINK_SLAB);
            entries.add(PINK_FENCE);
            entries.add(PINK_FENCE_GATE);
            entries.add(PINK_DOOR);
            entries.add(PINK_TRAPDOOR);
            entries.add(PINK_PRESSURE_PLATE);
            entries.add(PINK_BUTTON);
            entries.add(DARK_OAK_DOOR_WITH_WINDOWS);
            entries.add(DARK_OAK_TRAPDOOR_WITH_WINDOWS);
        });
    }
}