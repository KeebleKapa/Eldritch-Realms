package net.keeblekapa.eldritchrealms;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.minecraft.client.render.RenderLayer;

public class EldritchRealmsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.UMBRAM_OAK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.PHONTUM_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.ELDEM_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.UMBRAM_OAK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.PHONTUM_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.ELDEM_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.UMBRAM_OAK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.PHONTUM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.ELDEM_DOOR, RenderLayer.getCutout());

    }
}
