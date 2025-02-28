package net.keeblekapa.eldritchrealms;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.minecraft.client.render.RenderLayer;

public class EldritchRealmsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.UMBRAM_OAK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.UMBRAM_OAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.UMBRAM_OAK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.UMBRAM_OAK_DOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.PHONTUM_PETALS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.PHONTUM_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.FLOWERING_PHONTUM_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.PHONTUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.PHONTUM_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.PHONTUM_DOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.ELDEM_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.ELDEM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.ELDEM_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.ELDEM_DOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.TILLED_MARRED_SOIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.MYTHRAL_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.TALL_MYTHRAL_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.VIRELUME_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.TALL_VIRELUME_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.NOCTURB_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.TALL_NOCTURB_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.SABLEBELL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EldritchRealmsBlocks.ALK_WHEAT, RenderLayer.getCutout());


    }
}
