package net.keeblekapa.eldritchrealms.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.keeblekapa.eldritchrealms.EldritchRealms;
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

    // Shadowslate

    // Cursed Cobble

    // Eldritch Limestone

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
