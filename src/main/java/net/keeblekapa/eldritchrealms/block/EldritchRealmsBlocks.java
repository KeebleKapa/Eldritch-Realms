package net.keeblekapa.eldritchrealms.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.keeblekapa.eldritchrealms.sound.EldritchRealmsSounds;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EldritchRealmsBlocks {

    //--------------------------------------------------------
    //                       Stone Blocks
    //--------------------------------------------------------

    // Abyssal Granite
    public static final Block ABYSSAL_GRANITE = registerBlock("abyssal_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block ABYSSAL_GRANITE_STAIRS = registerBlock("abyssal_granite_stairs",
            new StairsBlock(EldritchRealmsBlocks.ABYSSAL_GRANITE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block ABYSSAL_GRANITE_SLAB = registerBlock("abyssal_granite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block ABYSSAL_GRANITE_WALL = registerBlock("abyssal_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));


    public static final Block POLISHED_ABYSSAL_GRANITE = registerBlock("polished_abyssal_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block POLISHED_ABYSSAL_GRANITE_STAIRS = registerBlock("polished_abyssal_granite_stairs",
            new StairsBlock(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block POLISHED_ABYSSAL_GRANITE_SLAB = registerBlock("polished_abyssal_granite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block POLISHED_ABYSSAL_GRANITE_WALL = registerBlock("polished_abyssal_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));


    public static final Block ABYSSAL_GRANITE_BRICKS = registerBlock("abyssal_granite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block ABYSSAL_GRANITE_BRICK_STAIRS = registerBlock("abyssal_granite_brick_stairs",
            new StairsBlock(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block ABYSSAL_GRANITE_BRICK_SLAB = registerBlock("abyssal_granite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block ABYSSAL_GRANITE_BRICK_WALL = registerBlock("abyssal_granite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));


    public static final Block CRACKED_ABYSSAL_GRANITE_BRICKS = registerBlock("cracked_abyssal_granite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block CRACKED_ABYSSAL_GRANITE_BRICK_STAIRS = registerBlock("cracked_abyssal_granite_brick_stairs",
            new StairsBlock(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block CRACKED_ABYSSAL_GRANITE_BRICK_SLAB = registerBlock("cracked_abyssal_granite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block CRACKED_ABYSSAL_GRANITE_BRICK_WALL = registerBlock("cracked_abyssal_granite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));


    public static final Block MOSSY_ABYSSAL_GRANITE = registerBlock("mossy_abyssal_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block MOSSY_ABYSSAL_GRANITE_STAIRS = registerBlock("mossy_abyssal_granite_stairs",
            new StairsBlock(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block MOSSY_ABYSSAL_GRANITE_SLAB = registerBlock("mossy_abyssal_granite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block MOSSY_ABYSSAL_GRANITE_WALL = registerBlock("mossy_abyssal_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));


    public static final Block MOSSY_POLISHED_ABYSSAL_GRANITE = registerBlock("mossy_polished_abyssal_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block MOSSY_POLISHED_ABYSSAL_GRANITE_STAIRS = registerBlock("mossy_polished_abyssal_granite_stairs",
            new StairsBlock(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB = registerBlock("mossy_polished_abyssal_granite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block MOSSY_POLISHED_ABYSSAL_GRANITE_WALL = registerBlock("mossy_polished_abyssal_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));


    public static final Block MOSSY_ABYSSAL_GRANITE_BRICKS = registerBlock("mossy_abyssal_granite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS = registerBlock("mossy_abyssal_granite_brick_stairs",
            new StairsBlock(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block MOSSY_ABYSSAL_GRANITE_BRICK_SLAB = registerBlock("mossy_abyssal_granite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block MOSSY_ABYSSAL_GRANITE_BRICK_WALL = registerBlock("mossy_abyssal_granite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));


    public static final Block CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS = registerBlock("cracked_mossy_abyssal_granite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS = registerBlock("cracked_mossy_abyssal_granite_brick_stairs",
            new StairsBlock(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB = registerBlock("cracked_mossy_abyssal_granite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));
    public static final Block CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_WALL = registerBlock("cracked_mossy_abyssal_granite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).strength(2f, 6f)));



    // Veilstone
    public static final Block VEILSTONE = registerBlock("veilstone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f)));
    public static final Block VEILSTONE_STAIRS = registerBlock("veilstone_stairs",
            new StairsBlock(EldritchRealmsBlocks.VEILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f)));
    public static final Block VEILSTONE_SLAB = registerBlock("veilstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f)));
    public static final Block VEILSTONE_WALL = registerBlock("veilstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f)));

    public static final Block COBBLED_VEILSTONE = registerBlock("cobbled_veilstone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f)));
    public static final Block COBBLED_VEILSTONE_STAIRS = registerBlock("cobbled_veilstone_stairs",
            new StairsBlock(EldritchRealmsBlocks.COBBLED_VEILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f)));
    public static final Block COBBLED_VEILSTONE_SLAB = registerBlock("cobbled_veilstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f)));
    public static final Block COBBLED_VEILSTONE_WALL = registerBlock("cobbled_veilstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f)));

    public static final Block VEILSTONE_BRICKS = registerBlock("veilstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f)));
    public static final Block VEILSTONE_BRICK_STAIRS = registerBlock("veilstone_brick_stairs",
            new StairsBlock(EldritchRealmsBlocks.VEILSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f)));
    public static final Block VEILSTONE_BRICK_SLAB = registerBlock("veilstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f)));
    public static final Block VEILSTONE_BRICK_WALL = registerBlock("veilstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f, 6f)));

    public static final Block SMOOTH_VEILSTONE = registerBlock("smooth_veilstone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2.2f, 6f)));
    public static final Block SMOOTH_VEILSTONE_STAIRS = registerBlock("smooth_veilstone_stairs",
            new StairsBlock(EldritchRealmsBlocks.SMOOTH_VEILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE).strength(2.2f, 6f)));
    public static final Block SMOOTH_VEILSTONE_SLAB = registerBlock("smooth_veilstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2.2f, 6f)));
    public static final Block SMOOTH_VEILSTONE_WALL = registerBlock("smooth_veilstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2.2f, 6f)));



    // Gloomarble
    public static final Block GLOOMARBLE = registerBlock("gloomarble",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).strength(1.2f, 3f).luminance(8).requiresTool()));

    // Shadowslate
    public static final Block SHADOWSLATE = registerBlock("shadowslate",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block SHADOWSLATE_STAIRS = registerBlock("shadowslate_stairs",
            new StairsBlock(EldritchRealmsBlocks.VEILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block SHADOWSLATE_SLAB = registerBlock("shadowslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block SHADOWSLATE_WALL = registerBlock("shadowslate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));

    public static final Block POLISHED_SHADOWSLATE = registerBlock("polished_shadowslate",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block POLISHED_SHADOWSLATE_STAIRS = registerBlock("polished_shadowslate_stairs",
            new StairsBlock(EldritchRealmsBlocks.VEILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block POLISHED_SHADOWSLATE_SLAB = registerBlock("polished_shadowslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block POLISHED_SHADOWSLATE_WALL = registerBlock("polished_shadowslate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));

    public static final Block SHADOWSLATE_BRICKS = registerBlock("shadowslate_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block SHADOWSLATE_BRICK_STAIRS = registerBlock("shadowslate_brick_stairs",
            new StairsBlock(EldritchRealmsBlocks.VEILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block SHADOWSLATE_BRICK_SLAB = registerBlock("shadowslate_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block SHADOWSLATE_BRICK_WALL = registerBlock("shadowslate_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));

    public static final Block CRACKED_SHADOWSLATE_BRICKS = registerBlock("cracked_shadowslate_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block CRACKED_SHADOWSLATE_BRICK_STAIRS = registerBlock("cracked_shadowslate_brick_stairs",
            new StairsBlock(EldritchRealmsBlocks.VEILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block CRACKED_SHADOWSLATE_BRICK_SLAB = registerBlock("cracked_shadowslate_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block CRACKED_SHADOWSLATE_BRICK_WALL = registerBlock("cracked_shadowslate_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));

    public static final Block SHADOWSLATE_TILES = registerBlock("shadowslate_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block SHADOWSLATE_TILE_STAIRS = registerBlock("shadowslate_tile_stairs",
            new StairsBlock(EldritchRealmsBlocks.VEILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block SHADOWSLATE_TILE_SLAB = registerBlock("shadowslate_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block SHADOWSLATE_TILE_WALL = registerBlock("shadowslate_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));

    public static final Block CRACKED_SHADOWSLATE_TILES = registerBlock("cracked_shadowslate_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block CRACKED_SHADOWSLATE_TILE_STAIRS = registerBlock("cracked_shadowslate_tile_stairs",
            new StairsBlock(EldritchRealmsBlocks.VEILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block CRACKED_SHADOWSLATE_TILE_SLAB = registerBlock("cracked_shadowslate_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));
    public static final Block CRACKED_SHADOWSLATE_TILE_WALL = registerBlock("cracked_shadowslate_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f).sounds(EldritchRealmsSounds.SHADOWSLATE_SOUNDS)));



    // Crimson Cobble
    public static final Block CRIMSON_COBBLE = registerBlock("crimson_cobble",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).strength(1.8f, 3.5f)));
    public static final Block CRIMSON_COBBLE_STAIRS = registerBlock("crimson_cobble_stairs",
            new StairsBlock(EldritchRealmsBlocks.VEILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.COBBLESTONE).strength(1.8f, 3.5f)));
    public static final Block CRIMSON_COBBLE_SLAB = registerBlock("crimson_cobble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).strength(1.8f, 3.5f)));
    public static final Block CRIMSON_COBBLE_WALL = registerBlock("crimson_cobble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).strength(1.8f, 3.5f)));

    // Eldritch Limestone

    public static final Block ELDRITCH_LIMESTONE_PILLAR = registerBlock("eldritch_limestone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.TUFF).strength(2.5f, 6f).sounds(EldritchRealmsSounds.TUFF_BRICK_SOUNDS)));

    public static final Block ELDRITCH_LIMESTONE = registerBlock("eldritch_limestone",
            new Block(FabricBlockSettings.copyOf(Blocks.TUFF).strength(2.5f, 6f)));
    public static final Block ELDRITCH_LIMESTONE_STAIRS = registerBlock("eldritch_limestone_stairs",
            new StairsBlock(EldritchRealmsBlocks.ELDRITCH_LIMESTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TUFF).strength(2.5f, 6f)));
    public static final Block ELDRITCH_LIMESTONE_SLAB = registerBlock("eldritch_limestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TUFF).strength(2.5f, 6f)));
    public static final Block ELDRITCH_LIMESTONE_WALL = registerBlock("eldritch_limestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TUFF).strength(2.5f, 6f)));

    public static final Block POLISHED_ELDRITCH_LIMESTONE = registerBlock("polished_eldritch_limestone",
            new Block(FabricBlockSettings.copyOf(Blocks.TUFF).strength(2.5f, 6f)));
    public static final Block POLISHED_ELDRITCH_LIMESTONE_STAIRS = registerBlock("polished_eldritch_limestone_stairs",
            new StairsBlock(EldritchRealmsBlocks.ELDRITCH_LIMESTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TUFF).strength(2.5f, 6f)));
    public static final Block POLISHED_ELDRITCH_LIMESTONE_SLAB = registerBlock("polished_eldritch_limestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TUFF).strength(2.5f, 6f)));
    public static final Block POLISHED_ELDRITCH_LIMESTONE_WALL = registerBlock("polished_eldritch_limestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TUFF).strength(2.5f, 6f)));

    public static final Block ELDRITCH_LIMESTONE_BRICKS = registerBlock("eldritch_limestone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TUFF).strength(2.5f, 6f).sounds(EldritchRealmsSounds.TUFF_BRICK_SOUNDS)));
    public static final Block ELDRITCH_LIMESTONE_BRICK_STAIRS = registerBlock("eldritch_limestone_brick_stairs",
            new StairsBlock(EldritchRealmsBlocks.ELDRITCH_LIMESTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TUFF).strength(2.5f, 6f).sounds(EldritchRealmsSounds.TUFF_BRICK_SOUNDS)));
    public static final Block ELDRITCH_LIMESTONE_BRICK_SLAB = registerBlock("eldritch_limestone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TUFF).strength(2.5f, 6f).sounds(EldritchRealmsSounds.TUFF_BRICK_SOUNDS)));
    public static final Block ELDRITCH_LIMESTONE_BRICK_WALL = registerBlock("eldritch_limestone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TUFF).strength(2.5f, 6f).sounds(EldritchRealmsSounds.TUFF_BRICK_SOUNDS)));



    // Umbral Onyx

    // Wraithstone

    // Hauntrock

    // Ebon Obsidian

    // Mystic Marble

    // Netherweave

    // Twilight Shale

    // Ghostly Gabbro

    // Enigma Basalt

    // Silent Sandstone

    // Cryptic Chert



    //--------------------------------------------------------
    //                Blocks With Ore Variant
    //--------------------------------------------------------

    // Nebula Lapis

    // Dreadquartz

    // Eclipsium

    // Soulspark

    // Dreadium

    // Etherealite (Stronger than Phantomite)

    // Phantomite (Stronger than Shadowsteel)

    // Shadowsteel (Stronger than Netherite)

    // Voidstone

    // Mystic Crystal

    // Eldritch Essence

    // Hallowed Gold (Stronger than Iron)

    // Gantix Silver (Stronger Than E-Iron)

    // Enigmatic Iron (Stronger than Diamond)


    //--------------------------------------------------------
    //                       Wood Blocks
    //--------------------------------------------------------

    // Phantom

    // Elder

    // Umbram Oak
    public static final Block UMBRAM_OAK_LOG = registerBlock("umbram_oak_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.5f, 4.5f)));
    public static final Block UMBRAM_OAK_WOOD = registerBlock("umbram_oak_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.5f, 4.5f)));
    public static final Block STRIPPED_UMBRAM_OAK_LOG = registerBlock("stripped_umbram_oak_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2.5f, 4.5f)));
    public static final Block STRIPPED_UMBRAM_OAK_WOOD = registerBlock("stripped_umbram_oak_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2.5f, 4.5f)));

    public static final Block UMBRAM_OAK_PLANKS = registerBlock("umbram_oak_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f)));
    public static final Block UMBRAM_OAK_LEAVES = registerBlock("umbram_oak_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(2.5f, 4.5f).nonOpaque()));



    //--------------------------------------------------------
    //                      Ground Blocks
    //--------------------------------------------------------

    // Mythral Grass

    // Shadowsoil

    // Eerie Gravel

    // Astral Sand


    //--------------------------------------------------------
    //                    Functional Blocks
    //--------------------------------------------------------

    // Nebulatic Enchanting Table

    // Ebonic Smithing Table




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(EldritchRealms.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(EldritchRealms.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {
        EldritchRealms.LOGGER.info("Registering Blocks for " + EldritchRealms.MOD_ID);
    }
}
