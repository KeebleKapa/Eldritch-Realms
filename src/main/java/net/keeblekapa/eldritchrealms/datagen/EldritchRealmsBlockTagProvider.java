package net.keeblekapa.eldritchrealms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
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
                .add(EldritchRealmsBlocks.SHADOWSLATE)
                .add(EldritchRealmsBlocks.SHADOWSLATE_SLAB)
                .add(EldritchRealmsBlocks.SHADOWSLATE_STAIRS)
                .add(EldritchRealmsBlocks.SHADOWSLATE_WALL)
                .add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE)
                .add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_SLAB)
                .add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_STAIRS)
                .add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_WALL)
                .add(EldritchRealmsBlocks.SHADOWSLATE_BRICKS)
                .add(EldritchRealmsBlocks.SHADOWSLATE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.SHADOWSLATE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.SHADOWSLATE_BRICK_WALL)
                .add(EldritchRealmsBlocks.SHADOWSLATE_TILES)
                .add(EldritchRealmsBlocks.SHADOWSLATE_TILE_SLAB)
                .add(EldritchRealmsBlocks.SHADOWSLATE_TILE_STAIRS)
                .add(EldritchRealmsBlocks.SHADOWSLATE_TILE_WALL)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICKS)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_WALL)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILES)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_SLAB)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_STAIRS)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(EldritchRealmsBlocks.GLOOMARBLE)

        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)

        ;

        // Needs Netherite Tool
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))

        ;

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)

        ;

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_LEAVES)
                .add(EldritchRealmsBlocks.PHONTUM_LEAVES)

        ;

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_LOG)
                .add(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_LOG)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_WOOD)
                .add(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_WOOD)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_PLANKS)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_STAIRS)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_SLAB)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_FENCE)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_FENCE_GATE)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_DOOR)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_TRAPDOOR)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_PRESSURE_PLATE)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_BUTTON)

                .add(EldritchRealmsBlocks.PHONTUM_LOG)
                .add(EldritchRealmsBlocks.STRIPPED_PHONTUM_LOG)
                .add(EldritchRealmsBlocks.PHONTUM_WOOD)
                .add(EldritchRealmsBlocks.STRIPPED_PHONTUM_WOOD)
                .add(EldritchRealmsBlocks.PHONTUM_PLANKS)
                .add(EldritchRealmsBlocks.PHONTUM_STAIRS)
                .add(EldritchRealmsBlocks.PHONTUM_SLAB)
                .add(EldritchRealmsBlocks.PHONTUM_FENCE)
                .add(EldritchRealmsBlocks.PHONTUM_FENCE_GATE)
                .add(EldritchRealmsBlocks.PHONTUM_DOOR)
                .add(EldritchRealmsBlocks.PHONTUM_TRAPDOOR)
                .add(EldritchRealmsBlocks.PHONTUM_PRESSURE_PLATE)
                .add(EldritchRealmsBlocks.PHONTUM_BUTTON)

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

                .add(EldritchRealmsBlocks.SHADOWSLATE)
                .add(EldritchRealmsBlocks.SHADOWSLATE_SLAB)
                .add(EldritchRealmsBlocks.SHADOWSLATE_STAIRS)
                .add(EldritchRealmsBlocks.SHADOWSLATE_WALL)
                .add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE)
                .add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_SLAB)
                .add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_STAIRS)
                .add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_WALL)
                .add(EldritchRealmsBlocks.SHADOWSLATE_BRICKS)
                .add(EldritchRealmsBlocks.SHADOWSLATE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.SHADOWSLATE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.SHADOWSLATE_BRICK_WALL)
                .add(EldritchRealmsBlocks.SHADOWSLATE_TILES)
                .add(EldritchRealmsBlocks.SHADOWSLATE_TILE_SLAB)
                .add(EldritchRealmsBlocks.SHADOWSLATE_TILE_STAIRS)
                .add(EldritchRealmsBlocks.SHADOWSLATE_TILE_WALL)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICKS)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_WALL)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILES)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_SLAB)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_STAIRS)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_WALL)

                .add(EldritchRealmsBlocks.CRIMSON_COBBLE)
                .add(EldritchRealmsBlocks.CRIMSON_COBBLE_SLAB)
                .add(EldritchRealmsBlocks.CRIMSON_COBBLE_STAIRS)
                .add(EldritchRealmsBlocks.CRIMSON_COBBLE_WALL)

                .add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE)
                .add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_PILLAR)
                .add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_SLAB)
                .add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_STAIRS)
                .add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_WALL)
                .add(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE)
                .add(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_SLAB)
                .add(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_STAIRS)
                .add(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_WALL)
                .add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS)
                .add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_WALL)

                .add(EldritchRealmsBlocks.GLOOMARBLE)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_FENCE)
                .add(EldritchRealmsBlocks.PHONTUM_FENCE)
        ;

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_FENCE_GATE)
                .add(EldritchRealmsBlocks.PHONTUM_FENCE_GATE)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_PRESSURE_PLATE)
                .add(EldritchRealmsBlocks.PHONTUM_PRESSURE_PLATE)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_BUTTON)
                .add(EldritchRealmsBlocks.PHONTUM_BUTTON)
        ;

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_FENCE)
                .add(EldritchRealmsBlocks.PHONTUM_FENCE)
        ;

        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_PRESSURE_PLATE)
                .add(EldritchRealmsBlocks.PHONTUM_PRESSURE_PLATE)
        ;

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_BUTTON)
                .add(EldritchRealmsBlocks.PHONTUM_BUTTON)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_DOOR)
                .add(EldritchRealmsBlocks.PHONTUM_DOOR)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_TRAPDOOR)
                .add(EldritchRealmsBlocks.PHONTUM_TRAPDOOR)
        ;

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_DOOR)
                .add(EldritchRealmsBlocks.PHONTUM_DOOR)
        ;

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_TRAPDOOR)
                .add(EldritchRealmsBlocks.PHONTUM_TRAPDOOR)
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

                .add(EldritchRealmsBlocks.SHADOWSLATE_SLAB)
                .add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_SLAB)
                .add(EldritchRealmsBlocks.SHADOWSLATE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.SHADOWSLATE_TILE_SLAB)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_SLAB)

                .add(EldritchRealmsBlocks.CRIMSON_COBBLE_SLAB)

                .add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_SLAB)
                .add(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_SLAB)
                .add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_SLAB)

                .add(EldritchRealmsBlocks.UMBRAM_OAK_SLAB)
                .add(EldritchRealmsBlocks.PHONTUM_SLAB)
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

                .add(EldritchRealmsBlocks.SHADOWSLATE_STAIRS)
                .add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_STAIRS)
                .add(EldritchRealmsBlocks.SHADOWSLATE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.SHADOWSLATE_TILE_STAIRS)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_STAIRS)

                .add(EldritchRealmsBlocks.CRIMSON_COBBLE_STAIRS)

                .add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_STAIRS)
                .add(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_STAIRS)
                .add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_STAIRS)

                .add(EldritchRealmsBlocks.UMBRAM_OAK_STAIRS)
                .add(EldritchRealmsBlocks.PHONTUM_STAIRS)

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

                .add(EldritchRealmsBlocks.SHADOWSLATE_WALL)
                .add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_WALL)
                .add(EldritchRealmsBlocks.SHADOWSLATE_BRICK_WALL)
                .add(EldritchRealmsBlocks.SHADOWSLATE_TILE_WALL)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_WALL)
                .add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_WALL)

                .add(EldritchRealmsBlocks.CRIMSON_COBBLE_WALL)

                .add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_WALL)
                .add(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_WALL)
                .add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_WALL)

        ;

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_LOG)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_WOOD)
                .add(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_LOG)
                .add(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_WOOD)
                .add(EldritchRealmsBlocks.PHONTUM_LOG)
                .add(EldritchRealmsBlocks.PHONTUM_WOOD)
                .add(EldritchRealmsBlocks.STRIPPED_PHONTUM_LOG)
                .add(EldritchRealmsBlocks.STRIPPED_PHONTUM_WOOD)

        ;
    }
}
