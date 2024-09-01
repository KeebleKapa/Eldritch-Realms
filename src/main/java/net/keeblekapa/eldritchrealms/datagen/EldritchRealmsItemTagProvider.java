package net.keeblekapa.eldritchrealms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class EldritchRealmsItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public EldritchRealmsItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_LOG.asItem())
                .add(EldritchRealmsBlocks.UMBRAM_OAK_WOOD.asItem())
                .add(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_LOG.asItem())
                .add(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_WOOD.asItem())
                .add(EldritchRealmsBlocks.PHONTUM_LOG.asItem())
                .add(EldritchRealmsBlocks.PHONTUM_WOOD.asItem())
                .add(EldritchRealmsBlocks.STRIPPED_PHONTUM_LOG.asItem())
                .add(EldritchRealmsBlocks.STRIPPED_PHONTUM_WOOD.asItem());


        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_PLANKS.asItem())
                .add(EldritchRealmsBlocks.PHONTUM_PLANKS.asItem());

    }
}
