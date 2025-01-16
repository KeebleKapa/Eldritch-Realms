package net.keeblekapa.eldritchrealms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.keeblekapa.eldritchrealms.util.EldritchRealmsTags;
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

                .add(EldritchRealmsBlocks.DREADQUARTZ_BLOCK)
                .add(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ)
                .add(EldritchRealmsBlocks.DREADQUARTZ_BRICKS)
                .add(EldritchRealmsBlocks.DREADQUARTZ_PILLAR)
                .add(EldritchRealmsBlocks.CHISELED_DREADQUARTZ)

                .add(EldritchRealmsBlocks.GLOOMARBLE)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(EldritchRealmsBlocks.VEILSTONE_DREADQUARTZ_ORE)
                .add(EldritchRealmsBlocks.SHADOWSLATE_DREADQUARTZ_ORE)
                .add(EldritchRealmsBlocks.NEBULATIC_LAPIS_BLOCK)


        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)

                .add(EldritchRealmsBlocks.SHADOWSTEEL_BLOCK)
                .add(EldritchRealmsBlocks.VEILSTONE_NEBULATIC_LAPIS_ORE)
                .add(EldritchRealmsBlocks.SHADOWSLATE_NEBULATIC_LAPIS_ORE)

        ;

        // Needs Netherite Tool
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))

                .add(EldritchRealmsBlocks.VEILSTONE_SHADOWSTEEL_ORE)
                .add(EldritchRealmsBlocks.SHADOWSLATE_SHADOWSTEEL_ORE)
        ;

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(EldritchRealmsBlocks.MARRED_SOIL)
                .add(EldritchRealmsBlocks.TILLED_MARRED_SOIL)
                .add(EldritchRealmsBlocks.MYTHRAL_GRASS_BLOCK)
                .add(EldritchRealmsBlocks.ASTRAL_SAND)
        ;

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_LEAVES)
                .add(EldritchRealmsBlocks.PHONTUM_LEAVES)
                .add(EldritchRealmsBlocks.FLOWERING_PHONTUM_LEAVES)
                .add(EldritchRealmsBlocks.ELDEM_LEAVES)

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

                .add(EldritchRealmsBlocks.ELDEM_LOG)
                .add(EldritchRealmsBlocks.STRIPPED_ELDEM_LOG)
                .add(EldritchRealmsBlocks.ELDEM_WOOD)
                .add(EldritchRealmsBlocks.STRIPPED_ELDEM_WOOD)
                .add(EldritchRealmsBlocks.ELDEM_PLANKS)
                .add(EldritchRealmsBlocks.ELDEM_STAIRS)
                .add(EldritchRealmsBlocks.ELDEM_SLAB)
                .add(EldritchRealmsBlocks.ELDEM_FENCE)
                .add(EldritchRealmsBlocks.ELDEM_FENCE_GATE)
                .add(EldritchRealmsBlocks.ELDEM_DOOR)
                .add(EldritchRealmsBlocks.ELDEM_TRAPDOOR)
                .add(EldritchRealmsBlocks.ELDEM_PRESSURE_PLATE)
                .add(EldritchRealmsBlocks.ELDEM_BUTTON)

        ;

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)

                .add(EldritchRealmsBlocks.NEBULATIC_LAPIS_BLOCK)
                .add(EldritchRealmsBlocks.VEILSTONE_NEBULATIC_LAPIS_ORE)
                .add(EldritchRealmsBlocks.SHADOWSLATE_NEBULATIC_LAPIS_ORE)

                .add(EldritchRealmsBlocks.SHADOWSTEEL_BLOCK)
                .add(EldritchRealmsBlocks.VEILSTONE_SHADOWSTEEL_ORE)
                .add(EldritchRealmsBlocks.SHADOWSLATE_SHADOWSTEEL_ORE)


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

                .add(EldritchRealmsBlocks.VEILSTONE_DREADQUARTZ_ORE)
                .add(EldritchRealmsBlocks.SHADOWSLATE_DREADQUARTZ_ORE)
                .add(EldritchRealmsBlocks.DREADQUARTZ_BLOCK)
                .add(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ)
                .add(EldritchRealmsBlocks.DREADQUARTZ_BRICKS)
                .add(EldritchRealmsBlocks.DREADQUARTZ_PILLAR)
                .add(EldritchRealmsBlocks.CHISELED_DREADQUARTZ)

                .add(EldritchRealmsBlocks.ASTRAL_SANDSTONE)
                .add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_STAIRS)
                .add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_SLAB)
                .add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_WALL)
                .add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICKS)
                .add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICK_WALL)
                .add(EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE)
                .add(EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE_STAIRS)
                .add(EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE_SLAB)
                .add(EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_FENCE)
                .add(EldritchRealmsBlocks.PHONTUM_FENCE)
                .add(EldritchRealmsBlocks.ELDEM_FENCE)
        ;

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_FENCE_GATE)
                .add(EldritchRealmsBlocks.PHONTUM_FENCE_GATE)
                .add(EldritchRealmsBlocks.ELDEM_FENCE_GATE)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_PRESSURE_PLATE)
                .add(EldritchRealmsBlocks.PHONTUM_PRESSURE_PLATE)
                .add(EldritchRealmsBlocks.ELDEM_PRESSURE_PLATE)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_BUTTON)
                .add(EldritchRealmsBlocks.PHONTUM_BUTTON)
                .add(EldritchRealmsBlocks.ELDEM_BUTTON)
        ;

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_FENCE)
                .add(EldritchRealmsBlocks.PHONTUM_FENCE)
                .add(EldritchRealmsBlocks.ELDEM_FENCE)
        ;

        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_PRESSURE_PLATE)
                .add(EldritchRealmsBlocks.PHONTUM_PRESSURE_PLATE)
                .add(EldritchRealmsBlocks.ELDEM_PRESSURE_PLATE)
        ;

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_BUTTON)
                .add(EldritchRealmsBlocks.PHONTUM_BUTTON)
                .add(EldritchRealmsBlocks.ELDEM_BUTTON)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_DOOR)
                .add(EldritchRealmsBlocks.PHONTUM_DOOR)
                .add(EldritchRealmsBlocks.ELDEM_DOOR)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_TRAPDOOR)
                .add(EldritchRealmsBlocks.PHONTUM_TRAPDOOR)
                .add(EldritchRealmsBlocks.ELDEM_TRAPDOOR)
        ;

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_DOOR)
                .add(EldritchRealmsBlocks.PHONTUM_DOOR)
                .add(EldritchRealmsBlocks.ELDEM_DOOR)
        ;

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(EldritchRealmsBlocks.UMBRAM_OAK_TRAPDOOR)
                .add(EldritchRealmsBlocks.PHONTUM_TRAPDOOR)
                .add(EldritchRealmsBlocks.ELDEM_TRAPDOOR)
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
                .add(EldritchRealmsBlocks.ELDEM_SLAB)

                .add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_SLAB)
                .add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICK_SLAB)
                .add(EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE_SLAB)
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
                .add(EldritchRealmsBlocks.ELDEM_STAIRS)

                .add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_STAIRS)
                .add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICK_STAIRS)
                .add(EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE_STAIRS)
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

                .add(EldritchRealmsBlocks.DREADQUARTZ_WALL)
                .add(EldritchRealmsBlocks.DREADQUARTZ_BRICK_WALL)
                .add(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ_WALL)

                .add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_WALL)
                .add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICK_WALL)
                .add(EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE_WALL)

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
                .add(EldritchRealmsBlocks.ELDEM_LOG)
                .add(EldritchRealmsBlocks.ELDEM_WOOD)
                .add(EldritchRealmsBlocks.STRIPPED_ELDEM_LOG)
                .add(EldritchRealmsBlocks.STRIPPED_ELDEM_WOOD)

        ;

        getOrCreateTagBuilder(EldritchRealmsTags.Blocks.ELDRITCH_PLANTS_CAN_PLACE_ON)
                .add(EldritchRealmsBlocks.MYTHRAL_GRASS_BLOCK)
                .add(EldritchRealmsBlocks.MARRED_SOIL)
        ;

        getOrCreateTagBuilder(EldritchRealmsTags.Blocks.ELDRITCH_CROPS_CAN_PLACE_ON)
                .add(EldritchRealmsBlocks.TILLED_MARRED_SOIL)
        ;

    }
}
