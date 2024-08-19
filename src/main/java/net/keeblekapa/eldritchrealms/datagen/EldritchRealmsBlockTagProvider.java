package net.keeblekapa.eldritchrealms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class EldritchRealmsBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public EldritchRealmsBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)

        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)

        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)

        ;

        // Needs Netherite Tool
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))

        ;

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)

        ;

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)

        ;

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)

        ;

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS)
                .add(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_WALL)
                .add(EldritchRealmsBlocks.ABYSSAL_GRANITE)
                .add(EldritchRealmsBlocks.ABYSSAL_GRANITE_SLAB)
                .add(EldritchRealmsBlocks.ABYSSAL_GRANITE_STAIRS)
                .add(EldritchRealmsBlocks.ABYSSAL_GRANITE_WALL)
                .add(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS)
                .add(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_WALL)
                .add(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE)
                .add(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_SLAB)
                .add(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_STAIRS)
                .add(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_WALL)
                .add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS)
                .add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_WALL)
                .add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE)
                .add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_SLAB)
                .add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_STAIRS)
                .add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_WALL)
                .add(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS)
                .add(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_WALL)
                .add(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE)
                .add(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB)
                .add(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_STAIRS)
                .add(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_WALL)

                .add(EldritchRealmsBlocks.VEILSTONE)
                .add(EldritchRealmsBlocks.VEILSTONE_SLAB)
                .add(EldritchRealmsBlocks.VEILSTONE_STAIRS)
                .add(EldritchRealmsBlocks.VEILSTONE_WALL)
                .add(EldritchRealmsBlocks.COBBLED_VEILSTONE)
                .add(EldritchRealmsBlocks.COBBLED_VEILSTONE_SLAB)
                .add(EldritchRealmsBlocks.COBBLED_VEILSTONE_STAIRS)
                .add(EldritchRealmsBlocks.COBBLED_VEILSTONE_WALL)
                .add(EldritchRealmsBlocks.VEILSTONE_BRICKS)
                .add(EldritchRealmsBlocks.VEILSTONE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.VEILSTONE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.VEILSTONE_BRICK_WALL)
                .add(EldritchRealmsBlocks.SMOOTH_VEILSTONE)
                .add(EldritchRealmsBlocks.SMOOTH_VEILSTONE_SLAB)
                .add(EldritchRealmsBlocks.SMOOTH_VEILSTONE_STAIRS)
                .add(EldritchRealmsBlocks.SMOOTH_VEILSTONE_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.ABYSSAL_GRANITE_SLAB)
                .add(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_SLAB)
                .add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_SLAB)
                .add(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB)

                .add(EldritchRealmsBlocks.VEILSTONE_SLAB)
                .add(EldritchRealmsBlocks.COBBLED_VEILSTONE_SLAB)
                .add(EldritchRealmsBlocks.VEILSTONE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.SMOOTH_VEILSTONE_SLAB)
        ;

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.ABYSSAL_GRANITE_STAIRS)
                .add(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_STAIRS)
                .add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_STAIRS)
                .add(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_STAIRS)

                .add(EldritchRealmsBlocks.VEILSTONE_STAIRS)
                .add(EldritchRealmsBlocks.COBBLED_VEILSTONE_STAIRS)
                .add(EldritchRealmsBlocks.VEILSTONE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.SMOOTH_VEILSTONE_STAIRS)
        ;

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_WALL)
                .add(EldritchRealmsBlocks.ABYSSAL_GRANITE_WALL)
                .add(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_WALL)
                .add(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_WALL)
                .add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_WALL)
                .add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_WALL)
                .add(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_WALL)
                .add(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_WALL)

                .add(EldritchRealmsBlocks.VEILSTONE_WALL)
                .add(EldritchRealmsBlocks.COBBLED_VEILSTONE_WALL)
                .add(EldritchRealmsBlocks.VEILSTONE_BRICK_WALL)
                .add(EldritchRealmsBlocks.SMOOTH_VEILSTONE_WALL)
        ;
    }
}
