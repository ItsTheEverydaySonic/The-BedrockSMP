package net.itskittyyoutube.kitty.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.itskittyyoutube.kitty.block.ModBlocks;
import net.itskittyyoutube.kitty.item.ModItems;
import net.minecraft.client.data.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLANKS_TEMPLATE);
        BlockStateModelGenerator.BlockTexturePool whitePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_PLANKS);
        whitePlanksPool.stairs(ModBlocks.WHITE_STAIRS);
        whitePlanksPool.slab(ModBlocks.WHITE_SLAB);

        whitePlanksPool.button(ModBlocks.WHITE_BUTTON);
        whitePlanksPool.pressurePlate(ModBlocks.WHITE_PRESSURE_PLATE);

        whitePlanksPool.fence(ModBlocks.WHITE_FENCE);
        whitePlanksPool.fenceGate(ModBlocks.WHITE_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.WHITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.WHITE_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool lightGrayPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GRAY_PLANKS);
        lightGrayPlanksPool.stairs(ModBlocks.LIGHT_GRAY_STAIRS);
        lightGrayPlanksPool.slab(ModBlocks.LIGHT_GRAY_SLAB);

        lightGrayPlanksPool.button(ModBlocks.LIGHT_GRAY_BUTTON);
        lightGrayPlanksPool.pressurePlate(ModBlocks.LIGHT_GRAY_PRESSURE_PLATE);

        lightGrayPlanksPool.fence(ModBlocks.LIGHT_GRAY_FENCE);
        lightGrayPlanksPool.fenceGate(ModBlocks.LIGHT_GRAY_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.LIGHT_GRAY_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.LIGHT_GRAY_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool grayPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRAY_PLANKS);
        grayPlanksPool.stairs(ModBlocks.GRAY_STAIRS);
        grayPlanksPool.slab(ModBlocks.GRAY_SLAB);

        grayPlanksPool.button(ModBlocks.GRAY_BUTTON);
        grayPlanksPool.pressurePlate(ModBlocks.GRAY_PRESSURE_PLATE);

        grayPlanksPool.fence(ModBlocks.GRAY_FENCE);
        grayPlanksPool.fenceGate(ModBlocks.GRAY_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.GRAY_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.GRAY_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool blackPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_PLANKS);
        blackPlanksPool.stairs(ModBlocks.BLACK_STAIRS);
        blackPlanksPool.slab(ModBlocks.BLACK_SLAB);

        blackPlanksPool.button(ModBlocks.BLACK_BUTTON);
        blackPlanksPool.pressurePlate(ModBlocks.BLACK_PRESSURE_PLATE);

        blackPlanksPool.fence(ModBlocks.BLACK_FENCE);
        blackPlanksPool.fenceGate(ModBlocks.BLACK_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.BLACK_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BLACK_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool brownPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_PLANKS);
        brownPlanksPool.stairs(ModBlocks.BROWN_STAIRS);
        brownPlanksPool.slab(ModBlocks.BROWN_SLAB);

        brownPlanksPool.button(ModBlocks.BROWN_BUTTON);
        brownPlanksPool.pressurePlate(ModBlocks.BROWN_PRESSURE_PLATE);

        brownPlanksPool.fence(ModBlocks.BROWN_FENCE);
        brownPlanksPool.fenceGate(ModBlocks.BROWN_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.BROWN_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BROWN_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool redPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_PLANKS);
        redPlanksPool.stairs(ModBlocks.RED_STAIRS);
        redPlanksPool.slab(ModBlocks.RED_SLAB);

        redPlanksPool.button(ModBlocks.RED_BUTTON);
        redPlanksPool.pressurePlate(ModBlocks.RED_PRESSURE_PLATE);

        redPlanksPool.fence(ModBlocks.RED_FENCE);
        redPlanksPool.fenceGate(ModBlocks.RED_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.RED_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RED_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool orangePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_PLANKS);
        orangePlanksPool.stairs(ModBlocks.ORANGE_STAIRS);
        orangePlanksPool.slab(ModBlocks.ORANGE_SLAB);

        orangePlanksPool.button(ModBlocks.ORANGE_BUTTON);
        orangePlanksPool.pressurePlate(ModBlocks.ORANGE_PRESSURE_PLATE);

        orangePlanksPool.fence(ModBlocks.ORANGE_FENCE);
        orangePlanksPool.fenceGate(ModBlocks.ORANGE_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.ORANGE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ORANGE_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool yellowPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_PLANKS);
        yellowPlanksPool.stairs(ModBlocks.YELLOW_STAIRS);
        yellowPlanksPool.slab(ModBlocks.YELLOW_SLAB);

        yellowPlanksPool.button(ModBlocks.YELLOW_BUTTON);
        yellowPlanksPool.pressurePlate(ModBlocks.YELLOW_PRESSURE_PLATE);

        yellowPlanksPool.fence(ModBlocks.YELLOW_FENCE);
        yellowPlanksPool.fenceGate(ModBlocks.YELLOW_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.YELLOW_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.YELLOW_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool limePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_PLANKS);
        limePlanksPool.stairs(ModBlocks.LIME_STAIRS);
        limePlanksPool.slab(ModBlocks.LIME_SLAB);

        limePlanksPool.button(ModBlocks.LIME_BUTTON);
        limePlanksPool.pressurePlate(ModBlocks.LIME_PRESSURE_PLATE);

        limePlanksPool.fence(ModBlocks.LIME_FENCE);
        limePlanksPool.fenceGate(ModBlocks.LIME_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.LIME_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.LIME_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool greenPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_PLANKS);
        greenPlanksPool.stairs(ModBlocks.GREEN_STAIRS);
        greenPlanksPool.slab(ModBlocks.GREEN_SLAB);

        greenPlanksPool.button(ModBlocks.GREEN_BUTTON);
        greenPlanksPool.pressurePlate(ModBlocks.GREEN_PRESSURE_PLATE);

        greenPlanksPool.fence(ModBlocks.GREEN_FENCE);
        greenPlanksPool.fenceGate(ModBlocks.GREEN_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.GREEN_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.GREEN_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool cyanPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_PLANKS);
        cyanPlanksPool.stairs(ModBlocks.CYAN_STAIRS);
        cyanPlanksPool.slab(ModBlocks.CYAN_SLAB);

        cyanPlanksPool.button(ModBlocks.CYAN_BUTTON);
        cyanPlanksPool.pressurePlate(ModBlocks.CYAN_PRESSURE_PLATE);

        cyanPlanksPool.fence(ModBlocks.CYAN_FENCE);
        cyanPlanksPool.fenceGate(ModBlocks.CYAN_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.CYAN_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CYAN_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool lightBluePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_PLANKS);
        lightBluePlanksPool.stairs(ModBlocks.LIGHT_BLUE_STAIRS);
        lightBluePlanksPool.slab(ModBlocks.LIGHT_BLUE_SLAB);

        lightBluePlanksPool.button(ModBlocks.LIGHT_BLUE_BUTTON);
        lightBluePlanksPool.pressurePlate(ModBlocks.LIGHT_BLUE_PRESSURE_PLATE);

        lightBluePlanksPool.fence(ModBlocks.LIGHT_BLUE_FENCE);
        lightBluePlanksPool.fenceGate(ModBlocks.LIGHT_BLUE_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.LIGHT_BLUE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.LIGHT_BLUE_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool bluePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_PLANKS);
        bluePlanksPool.stairs(ModBlocks.BLUE_STAIRS);
        bluePlanksPool.slab(ModBlocks.BLUE_SLAB);

        bluePlanksPool.button(ModBlocks.BLUE_BUTTON);
        bluePlanksPool.pressurePlate(ModBlocks.BLUE_PRESSURE_PLATE);

        bluePlanksPool.fence(ModBlocks.BLUE_FENCE);
        bluePlanksPool.fenceGate(ModBlocks.BLUE_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.BLUE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BLUE_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool purplePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_PLANKS);
        purplePlanksPool.stairs(ModBlocks.PURPLE_STAIRS);
        purplePlanksPool.slab(ModBlocks.PURPLE_SLAB);

        purplePlanksPool.button(ModBlocks.PURPLE_BUTTON);
        purplePlanksPool.pressurePlate(ModBlocks.PURPLE_PRESSURE_PLATE);

        purplePlanksPool.fence(ModBlocks.PURPLE_FENCE);
        purplePlanksPool.fenceGate(ModBlocks.PURPLE_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.PURPLE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PURPLE_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool magentaPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_PLANKS);
        magentaPlanksPool.stairs(ModBlocks.MAGENTA_STAIRS);
        magentaPlanksPool.slab(ModBlocks.MAGENTA_SLAB);

        magentaPlanksPool.button(ModBlocks.MAGENTA_BUTTON);
        magentaPlanksPool.pressurePlate(ModBlocks.MAGENTA_PRESSURE_PLATE);

        magentaPlanksPool.fence(ModBlocks.MAGENTA_FENCE);
        magentaPlanksPool.fenceGate(ModBlocks.MAGENTA_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.MAGENTA_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.MAGENTA_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool pinkPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_PLANKS);
        pinkPlanksPool.stairs(ModBlocks.PINK_STAIRS);
        pinkPlanksPool.slab(ModBlocks.PINK_SLAB);

        pinkPlanksPool.button(ModBlocks.PINK_BUTTON);
        pinkPlanksPool.pressurePlate(ModBlocks.PINK_PRESSURE_PLATE);

        pinkPlanksPool.fence(ModBlocks.PINK_FENCE);
        pinkPlanksPool.fenceGate(ModBlocks.PINK_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.PINK_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_TRAPDOOR);

        blockStateModelGenerator.registerDoor(ModBlocks.DARK_OAK_DOOR_WITH_WINDOWS);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.DARK_OAK_TRAPDOOR_WITH_WINDOWS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_THE_TALE_OF_TOOTHLESS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_STEVE_LAVA_CHICKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_LAVA_TEARSSTEP, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_TERRIFYING_TEARS, Models.GENERATED);
    }
}