package net.keeblekapa.eldritchrealms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.keeblekapa.eldritchrealms.item.EldritchRealmsItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class EldritchRealmsLootTableProvider extends FabricBlockLootTableProvider {
    public EldritchRealmsLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
                addDrop(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS);
                addDrop(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_STAIRS);
                addDrop(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_SLAB);
                addDrop(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_WALL);
                addDrop(EldritchRealmsBlocks.ABYSSAL_GRANITE);
                addDrop(EldritchRealmsBlocks.ABYSSAL_GRANITE_SLAB);
                addDrop(EldritchRealmsBlocks.ABYSSAL_GRANITE_STAIRS);
                addDrop(EldritchRealmsBlocks.ABYSSAL_GRANITE_WALL);
                addDrop(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS);
                addDrop(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_STAIRS);
                addDrop(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB);
                addDrop(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_WALL);
                addDrop(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE);
                addDrop(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_SLAB);
                addDrop(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_STAIRS);
                addDrop(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_WALL);
                addDrop(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS);
                addDrop(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS);
                addDrop(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB);
                addDrop(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_WALL);
                addDrop(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE);
                addDrop(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_SLAB);
                addDrop(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_STAIRS);
                addDrop(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_WALL);
                addDrop(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS);
                addDrop(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS);
                addDrop(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB);
                addDrop(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_WALL);
                addDrop(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE);
                addDrop(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB);
                addDrop(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_STAIRS);
                addDrop(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_WALL);

                addDrop(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_SLAB, slabDrops(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_SLAB));
                addDrop(EldritchRealmsBlocks.ABYSSAL_GRANITE_SLAB, slabDrops(EldritchRealmsBlocks.ABYSSAL_GRANITE_SLAB));
                addDrop(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB, slabDrops(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB));
                addDrop(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_SLAB, slabDrops(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_SLAB));
                addDrop(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB, slabDrops(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB));
                addDrop(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_SLAB, slabDrops(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_SLAB));
                addDrop(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB, slabDrops(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB));
                addDrop(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB, slabDrops(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB));


                addDrop(EldritchRealmsBlocks.VEILSTONE, stoneDrops(EldritchRealmsBlocks.VEILSTONE, EldritchRealmsBlocks.COBBLED_VEILSTONE));
                addDrop(EldritchRealmsBlocks.VEILSTONE_SLAB);
                addDrop(EldritchRealmsBlocks.VEILSTONE_STAIRS);
                addDrop(EldritchRealmsBlocks.VEILSTONE_WALL);
                addDrop(EldritchRealmsBlocks.COBBLED_VEILSTONE);
                addDrop(EldritchRealmsBlocks.COBBLED_VEILSTONE_SLAB);
                addDrop(EldritchRealmsBlocks.COBBLED_VEILSTONE_STAIRS);
                addDrop(EldritchRealmsBlocks.COBBLED_VEILSTONE_WALL);
                addDrop(EldritchRealmsBlocks.VEILSTONE_BRICKS);
                addDrop(EldritchRealmsBlocks.VEILSTONE_BRICK_SLAB);
                addDrop(EldritchRealmsBlocks.VEILSTONE_BRICK_STAIRS);
                addDrop(EldritchRealmsBlocks.VEILSTONE_BRICK_WALL);
                addDrop(EldritchRealmsBlocks.SMOOTH_VEILSTONE);
                addDrop(EldritchRealmsBlocks.SMOOTH_VEILSTONE_SLAB);
                addDrop(EldritchRealmsBlocks.SMOOTH_VEILSTONE_STAIRS);
                addDrop(EldritchRealmsBlocks.SMOOTH_VEILSTONE_WALL);

                addDrop(EldritchRealmsBlocks.VEILSTONE_SLAB, slabDrops(EldritchRealmsBlocks.VEILSTONE_SLAB));
                addDrop(EldritchRealmsBlocks.COBBLED_VEILSTONE_SLAB, slabDrops(EldritchRealmsBlocks.COBBLED_VEILSTONE_SLAB));
                addDrop(EldritchRealmsBlocks.VEILSTONE_BRICK_SLAB, slabDrops(EldritchRealmsBlocks.VEILSTONE_BRICK_SLAB));
                addDrop(EldritchRealmsBlocks.SMOOTH_VEILSTONE_SLAB, slabDrops(EldritchRealmsBlocks.SMOOTH_VEILSTONE_SLAB));


                addDrop(EldritchRealmsBlocks.SHADOWSLATE);
                addDrop(EldritchRealmsBlocks.SHADOWSLATE_STAIRS);
                addDrop(EldritchRealmsBlocks.SHADOWSLATE_WALL);
                addDrop(EldritchRealmsBlocks.POLISHED_SHADOWSLATE);
                addDrop(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_STAIRS);
                addDrop(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_WALL);
                addDrop(EldritchRealmsBlocks.SHADOWSLATE_BRICKS);
                addDrop(EldritchRealmsBlocks.SHADOWSLATE_BRICK_STAIRS);
                addDrop(EldritchRealmsBlocks.SHADOWSLATE_BRICK_WALL);
                addDrop(EldritchRealmsBlocks.SHADOWSLATE_TILES);
                addDrop(EldritchRealmsBlocks.SHADOWSLATE_TILE_STAIRS);
                addDrop(EldritchRealmsBlocks.SHADOWSLATE_TILE_WALL);
                addDrop(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICKS);
                addDrop(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_STAIRS);
                addDrop(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_WALL);
                addDrop(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILES);
                addDrop(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_STAIRS);
                addDrop(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_WALL);

                addDrop(EldritchRealmsBlocks.SHADOWSLATE_SLAB, slabDrops(EldritchRealmsBlocks.SHADOWSLATE_SLAB));
                addDrop(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_SLAB, slabDrops(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_SLAB));
                addDrop(EldritchRealmsBlocks.SHADOWSLATE_BRICK_SLAB, slabDrops(EldritchRealmsBlocks.SHADOWSLATE_BRICK_SLAB));
                addDrop(EldritchRealmsBlocks.SHADOWSLATE_TILE_SLAB, slabDrops(EldritchRealmsBlocks.SHADOWSLATE_TILE_SLAB));
                addDrop(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_SLAB, slabDrops(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_SLAB));
                addDrop(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_SLAB, slabDrops(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_SLAB));


                addDrop(EldritchRealmsBlocks.CRIMSON_COBBLE);
                addDrop(EldritchRealmsBlocks.CRIMSON_COBBLE_STAIRS);
                addDrop(EldritchRealmsBlocks.CRIMSON_COBBLE_WALL);
                addDrop(EldritchRealmsBlocks.CRIMSON_COBBLE_SLAB, slabDrops(EldritchRealmsBlocks.CRIMSON_COBBLE_SLAB));

                addDrop(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_PILLAR);
                addDrop(EldritchRealmsBlocks.ELDRITCH_LIMESTONE);
                addDrop(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_STAIRS);
                addDrop(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_SLAB, slabDrops(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_SLAB));
                addDrop(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_WALL);
                addDrop(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE);
                addDrop(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_STAIRS);
                addDrop(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_SLAB, slabDrops(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_SLAB));
                addDrop(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_WALL);
                addDrop(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS);
                addDrop(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_STAIRS);
                addDrop(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_SLAB, slabDrops(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_SLAB));
                addDrop(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_WALL);


                addDrop(EldritchRealmsBlocks.GLOOMARBLE, sevenToNineDrops(EldritchRealmsBlocks.GLOOMARBLE, EldritchRealmsItems.GLOOMARBLE_DUST));

                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_LOG);
                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_WOOD);
                addDrop(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_LOG);
                addDrop(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_WOOD);
                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_PLANKS);
                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_STAIRS);
                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_SLAB, slabDrops(EldritchRealmsBlocks.UMBRAM_OAK_SLAB));
                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_BUTTON);
                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_PRESSURE_PLATE);
                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_DOOR);
                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_FENCE);
                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_FENCE_GATE);
                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_TRAPDOOR);
                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_LEAVES, leavesDrops(EldritchRealmsBlocks.UMBRAM_OAK_LEAVES, EldritchRealmsBlocks.UMBRAM_OAK_LEAVES, 0.0025f)); // TODO

                addDrop(EldritchRealmsBlocks.PHONTUM_LOG);
                addDrop(EldritchRealmsBlocks.PHONTUM_WOOD);
                addDrop(EldritchRealmsBlocks.STRIPPED_PHONTUM_LOG);
                addDrop(EldritchRealmsBlocks.STRIPPED_PHONTUM_WOOD);
                addDrop(EldritchRealmsBlocks.PHONTUM_PLANKS);
                addDrop(EldritchRealmsBlocks.PHONTUM_STAIRS);
                addDrop(EldritchRealmsBlocks.PHONTUM_SLAB, slabDrops(EldritchRealmsBlocks.PHONTUM_SLAB));
                addDrop(EldritchRealmsBlocks.PHONTUM_BUTTON);
                addDrop(EldritchRealmsBlocks.PHONTUM_PRESSURE_PLATE);
                addDrop(EldritchRealmsBlocks.PHONTUM_DOOR);
                addDrop(EldritchRealmsBlocks.PHONTUM_FENCE);
                addDrop(EldritchRealmsBlocks.PHONTUM_FENCE_GATE);
                addDrop(EldritchRealmsBlocks.PHONTUM_TRAPDOOR);
                addDrop(EldritchRealmsBlocks.PHONTUM_LEAVES, leavesDrops(EldritchRealmsBlocks.PHONTUM_LEAVES, EldritchRealmsBlocks.PHONTUM_LEAVES, 0.0025f)); // TODO


    }

    public LootTable.Builder stoneDrops(Block drop, Block block) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder) this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(block)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(1.0f, 1.0f))))));
    }

    public LootTable.Builder oneToThreeDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder) this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(1.0f, 3.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }

    public LootTable.Builder twoToFiveDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder) this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }

    public LootTable.Builder fourToSevenDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder) this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(4.0f, 7.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }

    public LootTable.Builder sevenToNineDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder) this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(7.0f, 9.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }

    public LootTable.Builder oneToTenDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder) this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(1.0f, 10.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
