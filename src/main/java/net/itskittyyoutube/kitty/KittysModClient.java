package net.itskittyyoutube.kitty;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.itskittyyoutube.kitty.block.ModBlocks;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.client.render.RenderLayer;

public class KittysModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(ModBlocks.DARK_OAK_DOOR_WITH_WINDOWS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.DARK_OAK_TRAPDOOR_WITH_WINDOWS, BlockRenderLayer.CUTOUT);
    }
}
