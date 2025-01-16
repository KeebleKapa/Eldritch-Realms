package net.keeblekapa.eldritchrealms.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.keeblekapa.eldritchrealms.block.custom.AlkWheatCropBlock;
import net.keeblekapa.eldritchrealms.sound.EldritchRealmsSounds;
import net.keeblekapa.eldritchrealms.util.EldritchRealmsTags;
import net.keeblekapa.eldritchrealms.world.tree.EldemSaplingGenerator;
import net.keeblekapa.eldritchrealms.world.tree.PhontumSaplingGenerator;
import net.keeblekapa.eldritchrealms.world.tree.UmbramOakSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

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
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block SHADOWSLATE_STAIRS = registerBlock("shadowslate_stairs",
            new StairsBlock(EldritchRealmsBlocks.VEILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block SHADOWSLATE_SLAB = registerBlock("shadowslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block SHADOWSLATE_WALL = registerBlock("shadowslate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));

    public static final Block POLISHED_SHADOWSLATE = registerBlock("polished_shadowslate",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block POLISHED_SHADOWSLATE_STAIRS = registerBlock("polished_shadowslate_stairs",
            new StairsBlock(EldritchRealmsBlocks.VEILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block POLISHED_SHADOWSLATE_SLAB = registerBlock("polished_shadowslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block POLISHED_SHADOWSLATE_WALL = registerBlock("polished_shadowslate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));

    public static final Block SHADOWSLATE_BRICKS = registerBlock("shadowslate_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block SHADOWSLATE_BRICK_STAIRS = registerBlock("shadowslate_brick_stairs",
            new StairsBlock(EldritchRealmsBlocks.VEILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block SHADOWSLATE_BRICK_SLAB = registerBlock("shadowslate_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block SHADOWSLATE_BRICK_WALL = registerBlock("shadowslate_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));

    public static final Block CRACKED_SHADOWSLATE_BRICKS = registerBlock("cracked_shadowslate_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block CRACKED_SHADOWSLATE_BRICK_STAIRS = registerBlock("cracked_shadowslate_brick_stairs",
            new StairsBlock(EldritchRealmsBlocks.VEILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block CRACKED_SHADOWSLATE_BRICK_SLAB = registerBlock("cracked_shadowslate_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block CRACKED_SHADOWSLATE_BRICK_WALL = registerBlock("cracked_shadowslate_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));

    public static final Block SHADOWSLATE_TILES = registerBlock("shadowslate_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block SHADOWSLATE_TILE_STAIRS = registerBlock("shadowslate_tile_stairs",
            new StairsBlock(EldritchRealmsBlocks.VEILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block SHADOWSLATE_TILE_SLAB = registerBlock("shadowslate_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block SHADOWSLATE_TILE_WALL = registerBlock("shadowslate_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));

    public static final Block CRACKED_SHADOWSLATE_TILES = registerBlock("cracked_shadowslate_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block CRACKED_SHADOWSLATE_TILE_STAIRS = registerBlock("cracked_shadowslate_tile_stairs",
            new StairsBlock(EldritchRealmsBlocks.VEILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block CRACKED_SHADOWSLATE_TILE_SLAB = registerBlock("cracked_shadowslate_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));
    public static final Block CRACKED_SHADOWSLATE_TILE_WALL = registerBlock("cracked_shadowslate_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f, 10f)));



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
    public static final Block EBON_OBSIDIAN = registerBlock("ebon_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).strength(75.0F, 2400.0F).luminance(4)));
    public static final Block GLISTENING_EBON_OBSIDIAN = registerBlock("glistening_ebon_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.CRYING_OBSIDIAN).strength(75.0F, 2400.0F)));

    // Mystic Marble

    // Netherweave

    // Twilight Shale

    // Ghostly Gabbro

    // Enigma Basalt

    // Silent Sandstone

    // Cryptic Chert



    //--------------------------------------------------------
    //                           Ores
    //--------------------------------------------------------

    // Nebula Lapis
    public static final Block VEILSTONE_NEBULATIC_LAPIS_ORE = registerBlock("veilstone_nebulatic_lapis_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.VEILSTONE).strength(3f, 7f), UniformIntProvider.create(2, 7)));
    public static final Block SHADOWSLATE_NEBULATIC_LAPIS_ORE = registerBlock("shadowslate_nebulatic_lapis_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.SHADOWSLATE).strength(4.75f, 11f), UniformIntProvider.create(2, 7)));

    public static final Block NEBULATIC_LAPIS_BLOCK = registerBlock("nebulatic_lapis_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).strength(4f)));


    // Dreadquartz
    public static final Block VEILSTONE_DREADQUARTZ_ORE = registerBlock("veilstone_dreadquartz_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.VEILSTONE).strength(3f, 7f), UniformIntProvider.create(0, 4)));

    public static final Block SHADOWSLATE_DREADQUARTZ_ORE = registerBlock("shadowslate_dreadquartz_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.SHADOWSLATE).strength(4.75f, 11f), UniformIntProvider.create(0, 5)));


    public static final Block DREADQUARTZ_BLOCK = registerBlock("dreadquartz_block",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).strength(1.25f, 4.5f)));
    public static final Block DREADQUARTZ_STAIRS = registerBlock("dreadquartz_stairs",
            new StairsBlock(EldritchRealmsBlocks.DREADQUARTZ_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(EldritchRealmsBlocks.DREADQUARTZ_BLOCK)));
    public static final Block DREADQUARTZ_SLAB = registerBlock("dreadquartz_slab",
            new SlabBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.DREADQUARTZ_BLOCK)));
    public static final Block DREADQUARTZ_WALL = registerBlock("dreadquartz_wall",
            new WallBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.DREADQUARTZ_BLOCK)));


    public static final Block SMOOTH_DREADQUARTZ = registerBlock("smooth_dreadquartz",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).strength(2f, 6f)));
    public static final Block SMOOTH_DREADQUARTZ_STAIRS = registerBlock("smooth_dreadquartz_stairs",
            new StairsBlock(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ.getDefaultState(),
                    FabricBlockSettings.copyOf(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ)));
    public static final Block SMOOTH_DREADQUARTZ_SLAB = registerBlock("smooth_dreadquartz_slab",
            new SlabBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ)));
    public static final Block SMOOTH_DREADQUARTZ_WALL = registerBlock("smooth_dreadquartz_wall",
            new WallBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ)));


    public static final Block DREADQUARTZ_BRICKS = registerBlock("dreadquartz_bricks",
            new Block(FabricBlockSettings.copyOf(EldritchRealmsBlocks.DREADQUARTZ_BLOCK)));
    public static final Block DREADQUARTZ_BRICK_STAIRS = registerBlock("dreadquartz_brick_stairs",
            new StairsBlock(EldritchRealmsBlocks.DREADQUARTZ_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(EldritchRealmsBlocks.DREADQUARTZ_BRICKS)));
    public static final Block DREADQUARTZ_BRICK_SLAB = registerBlock("dreadquartz_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.DREADQUARTZ_BRICKS)));
    public static final Block DREADQUARTZ_BRICK_WALL = registerBlock("dreadquartz_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.DREADQUARTZ_BRICKS)));


    public static final Block DREADQUARTZ_PILLAR = registerBlock("dreadquartz_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.DREADQUARTZ_BLOCK)));


    public static final Block CHISELED_DREADQUARTZ = registerBlock("chiseled_dreadquartz",
            new PillarBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.DREADQUARTZ_BLOCK)));


    // Eclipsium

    // Soulspark

    // Dreadium

    // Etherealite (Stronger than Phantomite)

    // Phantomite (Stronger than Shadowsteel)

    // Shadowsteel (Stronger than Netherite)
    public static final Block VEILSTONE_SHADOWSTEEL_ORE = registerBlock("veilstone_shadowsteel_ore",
            new Block(FabricBlockSettings.copyOf(EldritchRealmsBlocks.VEILSTONE).strength(3f, 7f)));
    public static final Block SHADOWSLATE_SHADOWSTEEL_ORE = registerBlock("shadowslate_shadowsteel_ore",
            new Block(FabricBlockSettings.copyOf(EldritchRealmsBlocks.SHADOWSLATE).strength(4.75f, 11f)));

    public static final Block SHADOWSTEEL_BLOCK = registerBlock("shadowsteel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));

    // Voidstone

    // Mystic Crystal

    // Eldritch Essence

    // Hallowed Gold (Stronger than Iron)

    // Gantix Silver (Stronger Than E-Iron)

    // Enigmatic Iron (Stronger than Diamond)


    //--------------------------------------------------------
    //                       Wood Blocks
    //--------------------------------------------------------

    // Phontum
    public static final Block PHONTUM_SAPLING = registerBlock("phontum_sapling",
            new SaplingBlock(new PhontumSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)) {
                @Override
                public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
                    BlockState blockState = world.getBlockState(pos.down());

                    return blockState.isIn(EldritchRealmsTags.Blocks.ELDRITCH_PLANTS_CAN_PLACE_ON);
                }

            });

    public static final Block PHONTUM_LOG = registerBlock("phontum_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.5f, 4.5f)));
    public static final Block PHONTUM_WOOD = registerBlock("phontum_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.5f, 4.5f)));
    public static final Block STRIPPED_PHONTUM_LOG = registerBlock("stripped_phontum_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2.5f, 4.5f)));
    public static final Block STRIPPED_PHONTUM_WOOD = registerBlock("stripped_phontum_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2.5f, 4.5f)));

    public static final Block PHONTUM_PLANKS = registerBlock("phontum_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f)));
    public static final Block PHONTUM_STAIRS = registerBlock("phontum_stairs",
            new StairsBlock(EldritchRealmsBlocks.PHONTUM_PLANKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).strength(2.5f, 4.5f)));
    public static final Block PHONTUM_SLAB = registerBlock("phontum_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f)));
    public static final Block PHONTUM_PRESSURE_PLATE = registerBlock("phontum_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0f, 3.5f), BlockSetType.OAK));
    public static final Block PHONTUM_BUTTON = registerBlock("phontum_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(1.5f, 2.5f),
                    BlockSetType.OAK, 20, true));
    public static final Block PHONTUM_DOOR = registerBlock("phontum_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f), BlockSetType.OAK));
    public static final Block PHONTUM_TRAPDOOR = registerBlock("phontum_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f), BlockSetType.OAK));
    public static final Block PHONTUM_FENCE = registerBlock("phontum_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f)));
    public static final Block PHONTUM_FENCE_GATE = registerBlock("phontum_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f), WoodType.OAK));

    public static final Block PHONTUM_LEAVES = registerBlock("phontum_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.5f).nonOpaque()));
    public static final Block FLOWERING_PHONTUM_LEAVES = registerBlock("flowering_phontum_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.5f).nonOpaque()) {
                @Override
                public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
                    ItemStack itemStack = player.getStackInHand(hand);

                    // Check if the player is holding shears
                    if (itemStack.isOf(Items.SHEARS)) {
                        // Damage the shears
                        itemStack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
                        world.playSound(null, pos, SoundEvents.ENTITY_SHEEP_SHEAR, SoundCategory.BLOCKS, 1.0f, 1.0f);

                        // Drop the Blue Petal Block
                        if (!world.isClient) {
                            ItemScatterer.spawn(world, pos.getX(), pos.getY(), pos.getZ(),
                                    new ItemStack(EldritchRealmsBlocks.PHONTUM_PETALS));
                        }

                        // Replace the Flowering Leaves with Normal Leaves
                        if (!world.isClient) {
                            world.setBlockState(pos, EldritchRealmsBlocks.PHONTUM_LEAVES.getDefaultState());
                        }

                        // Return success
                        return ActionResult.SUCCESS;
                    }

                    // Default behavior for other items
                    return super.onUse(state, world, pos, player, hand, hit);
                }

            });

    public static final Block PHONTUM_PETALS = registerBlock("phontum_petals",
            new FlowerbedBlock(FabricBlockSettings.copyOf(Blocks.PINK_PETALS)) {
                @Override
                public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
                    BlockState blockState = world.getBlockState(pos.down());

                    return blockState.isIn(EldritchRealmsTags.Blocks.ELDRITCH_PLANTS_CAN_PLACE_ON);
                }
            });


    // Eldem
    public static final Block ELDEM_SAPLING = registerBlock("eldem_sapling",
            new SaplingBlock(new EldemSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)) {
                @Override
                public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
                    BlockState blockState = world.getBlockState(pos.down());

                    return blockState.isIn(EldritchRealmsTags.Blocks.ELDRITCH_PLANTS_CAN_PLACE_ON);
                }

            });

    public static final Block ELDEM_LOG = registerBlock("eldem_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.5f, 4.5f)));
    public static final Block ELDEM_WOOD = registerBlock("eldem_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.5f, 4.5f)));
    public static final Block STRIPPED_ELDEM_LOG = registerBlock("stripped_eldem_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2.5f, 4.5f)));
    public static final Block STRIPPED_ELDEM_WOOD = registerBlock("stripped_eldem_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2.5f, 4.5f)));

    public static final Block ELDEM_PLANKS = registerBlock("eldem_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f)));
    public static final Block ELDEM_STAIRS = registerBlock("eldem_stairs",
            new StairsBlock(EldritchRealmsBlocks.PHONTUM_PLANKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).strength(2.5f, 4.5f)));
    public static final Block ELDEM_SLAB = registerBlock("eldem_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f)));
    public static final Block ELDEM_PRESSURE_PLATE = registerBlock("eldem_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0f, 3.5f), BlockSetType.OAK));
    public static final Block ELDEM_BUTTON = registerBlock("eldem_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(1.5f, 2.5f),
                    BlockSetType.OAK, 20, true));
    public static final Block ELDEM_DOOR = registerBlock("eldem_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f), BlockSetType.OAK));
    public static final Block ELDEM_TRAPDOOR = registerBlock("eldem_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f), BlockSetType.OAK));
    public static final Block ELDEM_FENCE = registerBlock("eldem_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f)));
    public static final Block ELDEM_FENCE_GATE = registerBlock("eldem_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f), WoodType.OAK));

    public static final Block ELDEM_LEAVES = registerBlock("eldem_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.5f).nonOpaque()));

    // Umbram Oak
    public static final Block UMBRAM_OAK_SAPLING = registerBlock("umbram_oak_sapling",
            new SaplingBlock(new UmbramOakSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)) {
                @Override
                public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
                    BlockState blockState = world.getBlockState(pos.down());

                    return blockState.isIn(EldritchRealmsTags.Blocks.ELDRITCH_PLANTS_CAN_PLACE_ON);
                }

            });

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
    public static final Block UMBRAM_OAK_STAIRS = registerBlock("umbram_oak_stairs",
            new StairsBlock(EldritchRealmsBlocks.UMBRAM_OAK_PLANKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).strength(2.5f, 4.5f)));
    public static final Block UMBRAM_OAK_SLAB = registerBlock("umbram_oak_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f)));
    public static final Block UMBRAM_OAK_PRESSURE_PLATE = registerBlock("umbram_oak_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0f, 3.5f), BlockSetType.OAK));
    public static final Block UMBRAM_OAK_BUTTON = registerBlock("umbram_oak_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(1.5f, 2.5f),
                    BlockSetType.OAK, 20, true));
    public static final Block UMBRAM_OAK_DOOR = registerBlock("umbram_oak_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f), BlockSetType.OAK));
    public static final Block UMBRAM_OAK_TRAPDOOR = registerBlock("umbram_oak_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f), BlockSetType.OAK));
    public static final Block UMBRAM_OAK_FENCE = registerBlock("umbram_oak_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f)));
    public static final Block UMBRAM_OAK_FENCE_GATE = registerBlock("umbram_oak_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f, 4.5f), WoodType.OAK));

    public static final Block UMBRAM_OAK_LEAVES = registerBlock("umbram_oak_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.5f).nonOpaque()));



    //--------------------------------------------------------
    //                      Ground Blocks
    //--------------------------------------------------------

    // Mythral Grass
    public static final Block MYTHRAL_GRASS_BLOCK = registerBlock("mythral_grass_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).strength(1.5f)) {
                private BlockState getRandomFlower(Random random) {
                    Block[] flowers = new Block[]{
                            Blocks.AIR,
                            EldritchRealmsBlocks.SABLEBELL,
                            EldritchRealmsBlocks.PHONTUM_PETALS
                    };

                    return flowers[random.nextInt(flowers.length)].getDefaultState();
                }

                @Override
                public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
                        // Check if there's a solid block directly above
                        BlockState blockAbove = world.getBlockState(pos.up());
                        if (blockAbove.isSolidBlock(world, pos.up())) {
                            // Replace with Marred Soil after a random tick
                            world.setBlockState(pos, EldritchRealmsBlocks.MARRED_SOIL.getDefaultState(), 3);
                        }
                }

                @Override
                public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
                    ItemStack itemStack = player.getStackInHand(hand);

                    // Check if the item is bonemeal
                    if (itemStack.isOf(Items.BONE_MEAL)) {
                        BlockPos.Mutable mutablePos = new BlockPos.Mutable();
                        Random random = world.getRandom();
                        boolean hasMythralGrassBlockNearby = false;

                        // Check for Mythral Grass Blocks within a 2-block radius
                        for (int x = -2; x <= 2; x++) {
                            for (int z = -2; z <= 2; z++) {

                                mutablePos.set(pos.getX() + x, pos.getY(), pos.getZ() + z);

                                // Check if the block is a Mythral Grass Block
                                if (world.getBlockState(mutablePos).getBlock() == MYTHRAL_GRASS_BLOCK) {
                                    hasMythralGrassBlockNearby = true;
                                    break;
                                }
                            }
                            if (hasMythralGrassBlockNearby) break;
                        }

                        // Only proceed if there is at least one Mythral Grass Block nearby
                        if (hasMythralGrassBlockNearby) {

                            // Loop over the area again to place flowers/grass on top of Mythral Grass Blocks
                            for (int x = -2; x <= 2; x++) {

                                for (int z = -2; z <= 2; z++) {

                                    mutablePos.set(pos.getX() + x, pos.getY(), pos.getZ() + z);

                                    if (world.getBlockState(mutablePos).getBlock() == MYTHRAL_GRASS_BLOCK) {

                                        // Position to place the flower or grass
                                        BlockPos flowerPos = mutablePos.up();

                                        // Check if the block above is empty
                                        if (world.isAir(flowerPos)) {

                                            // Random chance to place Mythral Grass, Tall Mythral Grass, or flowers
                                            if (random.nextInt(10) < 4) {

                                                // Place Mythral Grass (40% chance)
                                                world.setBlockState(flowerPos, MYTHRAL_GRASS.getDefaultState(), 3);

                                            } else if (random.nextInt(10) < 2) {
                                                // Check for space above before placing Tall Mythral Grass (20% chance)

                                                BlockPos flowerPosAbove = flowerPos.up(); // One block above the current flowerPos

                                                if (world.isAir(flowerPosAbove)) {

                                                    // If space is clear, place Tall Mythral Grass
                                                    world.setBlockState(flowerPos, TALL_MYTHRAL_GRASS.getDefaultState(), 3);
                                                    world.setBlockState(flowerPosAbove, TALL_MYTHRAL_GRASS.getDefaultState().with(TallPlantBlock.HALF, DoubleBlockHalf.UPPER), 3);

                                                } else {

                                                    // If no space above, either place regular Mythral Grass or do nothing
                                                    if (random.nextInt(2) == 0) {
                                                        world.setBlockState(flowerPos, MYTHRAL_GRASS.getDefaultState(), 3);
                                                    }

                                                }
                                            } else if (random.nextInt(10) < 4) {
                                                // Place a random flower (40% chance)

                                                BlockState flowerState = getRandomFlower(random);

                                                if (flowerState != null) {
                                                    world.setBlockState(flowerPos, flowerState, 3);
                                                }

                                            }
                                        }
                                    }
                                }
                            }

                            // Play the bonemeal particles and sound
                            world.syncWorldEvent(2005, pos, 0);

                            // Consume the bonemeal
                            if (!player.isCreative()) {
                                itemStack.decrement(1);
                            }

                            return ActionResult.SUCCESS;
                        }
                    }

                    // Check if the item is a hoe (using a tag)
                    if (itemStack.isIn(ItemTags.HOES)) {
                        if (!world.isClient) {
                            // Replace the Marred Soil with Tilled Marred Soil
                            world.setBlockState(pos, EldritchRealmsBlocks.TILLED_MARRED_SOIL.getDefaultState(), 3);

                            // Play a sound effect
                            world.playSound(null, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0f, 1.0f);

                            // Damage the hoe
                            itemStack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
                        }

                        return ActionResult.SUCCESS;
                    }

                    return super.onUse(state, world, pos, player, hand, hit);
                }
            });

    public static final Block MYTHRAL_GRASS = registerBlock("mythral_grass",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.GRASS)) {
                @Override
                public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
                    BlockState blockState = world.getBlockState(pos.down());

                    return blockState.isIn(EldritchRealmsTags.Blocks.ELDRITCH_PLANTS_CAN_PLACE_ON);
                }

                @Override
                public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
                    ItemStack itemStack = player.getStackInHand(hand);

                    // Check if the item is bonemeal
                    if (itemStack.isOf(Items.BONE_MEAL)) {

                        // Check if there's space above for tall grass (2 blocks total height)
                        if (world.isAir(pos.up()) && world.isAir(pos.up(2))) {

                            // Replace the Mythral Grass with the bottom half of Tall Mythral Grass
                            world.setBlockState(pos, EldritchRealmsBlocks.TALL_MYTHRAL_GRASS.getDefaultState().with(TallPlantBlock.HALF, DoubleBlockHalf.LOWER), 3);
                            // Place the upper half of Tall Mythral Grass one block above
                            world.setBlockState(pos.up(), EldritchRealmsBlocks.TALL_MYTHRAL_GRASS.getDefaultState().with(TallPlantBlock.HALF, DoubleBlockHalf.UPPER), 3);

                            // Consume the bonemeal
                            if (!player.isCreative()) {
                                itemStack.decrement(1);
                            }

                            // Play the bonemeal particles and sound
                            world.syncWorldEvent(2005, pos, 0);
                            return ActionResult.SUCCESS;

                        } else {
                            return ActionResult.FAIL;
                        }
                    }
                    return super.onUse(state, world, pos, player, hand, hit);
                }
            });

    public static final Block TALL_MYTHRAL_GRASS = registerBlock("tall_mythral_grass",
            new TallPlantBlock(FabricBlockSettings.copyOf(Blocks.GRASS)) {
                @Override
                public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
                    BlockState blockState = world.getBlockState(pos.down());

                    return blockState.isIn(EldritchRealmsTags.Blocks.ELDRITCH_PLANTS_CAN_PLACE_ON);
                }


            });

    //    Flowers    //
    public static final Block SABLEBELL = registerBlock("sablebell",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY)) {
                @Override
                public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
                    BlockState blockState = world.getBlockState(pos.down());

                    return blockState.isIn(EldritchRealmsTags.Blocks.ELDRITCH_PLANTS_CAN_PLACE_ON);
                }
            });


    // Marred Soil
    public static final Block MARRED_SOIL = registerBlock("marred_soil",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).strength(1f)) {
                @Override
                public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
                    ItemStack itemStack = player.getStackInHand(hand);

                    // Check if the item is a hoe (using a tag)
                    if (itemStack.isIn(ItemTags.HOES)) {
                        if (!world.isClient) {
                            // Replace the Marred Soil with Tilled Marred Soil
                            world.setBlockState(pos, EldritchRealmsBlocks.TILLED_MARRED_SOIL.getDefaultState(), 3);

                            // Play a sound effect
                            world.playSound(null, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0f, 1.0f);

                            // Damage the hoe
                            itemStack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
                        }

                        return ActionResult.SUCCESS;
                    }

                    return super.onUse(state, world, pos, player, hand, hit);
                }

                @Override
                public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
                    // Check if there's a solid block directly above
                    BlockState blockAbove = world.getBlockState(pos.up());
                    if (blockAbove.isSolidBlock(world, pos.up())) {
                        // Do nothing if a solid block is above
                        return;
                    }

                    // Check if any adjacent block is a Mythral Grass Block
                    for (Direction direction : Direction.values()) {
                        BlockState adjacentState = world.getBlockState(pos.offset(direction));
                        if (adjacentState.isOf(EldritchRealmsBlocks.MYTHRAL_GRASS_BLOCK)) {
                            // Replace with Mythral Grass after a random tick
                            world.setBlockState(pos, EldritchRealmsBlocks.MYTHRAL_GRASS_BLOCK.getDefaultState(), 3);
                            break;
                        }
                    }
                }

                @Override
                public boolean hasRandomTicks(BlockState state) {
                    return true; // Enable random tick behavior
                }
            });

    public static final Block TILLED_MARRED_SOIL = registerBlock("tilled_marred_soil",
            new DirtPathBlock(FabricBlockSettings.copyOf(Blocks.FARMLAND).strength(1.2f)) {
                @Override
                public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
                }

                public static void setToMarredSoil(@Nullable Entity entity, BlockState state, World world, BlockPos pos) {
                    BlockState blockState = pushEntitiesUpBeforeBlockChange(state, EldritchRealmsBlocks.MARRED_SOIL.getDefaultState(), world, pos);
                    world.setBlockState(pos, blockState);
                    world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(entity, blockState));
                }

                @Override
                public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
                    if (!world.isClient
                            && world.random.nextFloat() < fallDistance - 0.5F
                            && entity instanceof LivingEntity
                            && (entity instanceof PlayerEntity || world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING))
                            && entity.getWidth() * entity.getWidth() * entity.getHeight() > 0.512F) {
                        setToMarredSoil(entity, state, world, pos);
                    }

                    super.onLandedUpon(world, state, pos, entity, fallDistance);
                }
            });


    // Eerie Gravel
    public static final Block EERIE_GRAVEL = registerBlock("eerie_gravel",
            new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL).strength(1f)));

    // Astral Sand
    public static final Block ASTRAL_SAND = registerBlock("astral_sand",
            new SandBlock(0, FabricBlockSettings.copyOf(Blocks.SAND)));

    public static final Block ASTRAL_SANDSTONE = registerBlock("astral_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).strength(1f)));

    public static final Block ASTRAL_SANDSTONE_STAIRS = registerBlock("astral_sandstone_stairs",
            new StairsBlock(EldritchRealmsBlocks.ASTRAL_SANDSTONE.getDefaultState(), FabricBlockSettings.copyOf(ASTRAL_SANDSTONE)));

    public static final Block ASTRAL_SANDSTONE_SLAB = registerBlock("astral_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.ASTRAL_SANDSTONE)));

    public static final Block ASTRAL_SANDSTONE_WALL = registerBlock("astral_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.ASTRAL_SANDSTONE)));

    public static final Block ASTRAL_SANDSTONE_BRICKS = registerBlock("astral_sandstone_bricks",
            new Block(FabricBlockSettings.copyOf(EldritchRealmsBlocks.ASTRAL_SANDSTONE)));

    public static final Block ASTRAL_SANDSTONE_BRICK_STAIRS = registerBlock("astral_sandstone_brick_stairs",
            new StairsBlock(EldritchRealmsBlocks.ASTRAL_SANDSTONE.getDefaultState(), FabricBlockSettings.copyOf(ASTRAL_SANDSTONE_BRICKS)));

    public static final Block ASTRAL_SANDSTONE_BRICK_SLAB = registerBlock("astral_sandstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICKS)));

    public static final Block ASTRAL_SANDSTONE_BRICK_WALL = registerBlock("astral_sandstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICKS)));

    public static final Block SMOOTH_ASTRAL_SANDSTONE = registerBlock("smooth_astral_sandstone",
            new Block(FabricBlockSettings.copyOf(EldritchRealmsBlocks.ASTRAL_SANDSTONE)));

    public static final Block SMOOTH_ASTRAL_SANDSTONE_STAIRS = registerBlock("smooth_astral_sandstone_stairs",
            new StairsBlock(EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE.getDefaultState(), FabricBlockSettings.copyOf(EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE).strength(2f, 6f)));

    public static final Block SMOOTH_ASTRAL_SANDSTONE_SLAB = registerBlock("smooth_astral_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE)));

    public static final Block SMOOTH_ASTRAL_SANDSTONE_WALL = registerBlock("smooth_astral_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE)));



    //--------------------------------------------------------
    //                    Functional Blocks
    //--------------------------------------------------------

    // Nebulatic Enchanting Table
    public static final Block NEBULATIC_ENCHANTING_TABLE = registerBlock("nebulatic_enchanting_table",
            new EnchantingTableBlock(FabricBlockSettings.copyOf(Blocks.ENCHANTING_TABLE).luminance(8)));

    // Ebonic Smithing Table


    //--------------------------------------------------------
    //                         Crops
    //--------------------------------------------------------

    public static final Block ALK_WHEAT = Registry.register(Registries.BLOCK, new Identifier(EldritchRealms.MOD_ID, "alk_wheat"),
            new AlkWheatCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)) {
                @Override
                public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
                    BlockState blockState = world.getBlockState(pos.down());

                    return blockState.isIn(EldritchRealmsTags.Blocks.ELDRITCH_CROPS_CAN_PLACE_ON);
                }
            });





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
