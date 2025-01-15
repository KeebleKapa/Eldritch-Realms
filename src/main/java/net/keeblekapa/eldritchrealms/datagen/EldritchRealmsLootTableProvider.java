package net.keeblekapa.eldritchrealms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.keeblekapa.eldritchrealms.block.custom.AlkWheatCropBlock;
import net.keeblekapa.eldritchrealms.item.EldritchRealmsItems;
import net.minecraft.block.Block;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LocationCheckLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.BlockPredicate;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.predicate.entity.LocationPredicate;
import net.minecraft.util.math.BlockPos;

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


                addDrop(EldritchRealmsBlocks.VEILSTONE, silkTouchDrop(EldritchRealmsBlocks.VEILSTONE, EldritchRealmsBlocks.COBBLED_VEILSTONE));
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
                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_DOOR, doorDrops(EldritchRealmsBlocks.UMBRAM_OAK_DOOR));
                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_FENCE);
                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_FENCE_GATE);
                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_TRAPDOOR);
                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_SAPLING);
                addDrop(EldritchRealmsBlocks.UMBRAM_OAK_LEAVES, leavesDrops(EldritchRealmsBlocks.UMBRAM_OAK_LEAVES, EldritchRealmsBlocks.UMBRAM_OAK_SAPLING, 0.05f));

                addDrop(EldritchRealmsBlocks.PHONTUM_LOG);
                addDrop(EldritchRealmsBlocks.PHONTUM_WOOD);
                addDrop(EldritchRealmsBlocks.STRIPPED_PHONTUM_LOG);
                addDrop(EldritchRealmsBlocks.STRIPPED_PHONTUM_WOOD);
                addDrop(EldritchRealmsBlocks.PHONTUM_PLANKS);
                addDrop(EldritchRealmsBlocks.PHONTUM_STAIRS);
                addDrop(EldritchRealmsBlocks.PHONTUM_SLAB, slabDrops(EldritchRealmsBlocks.PHONTUM_SLAB));
                addDrop(EldritchRealmsBlocks.PHONTUM_BUTTON);
                addDrop(EldritchRealmsBlocks.PHONTUM_PRESSURE_PLATE);
                addDrop(EldritchRealmsBlocks.PHONTUM_DOOR, doorDrops(EldritchRealmsBlocks.PHONTUM_DOOR));
                addDrop(EldritchRealmsBlocks.PHONTUM_FENCE);
                addDrop(EldritchRealmsBlocks.PHONTUM_FENCE_GATE);
                addDrop(EldritchRealmsBlocks.PHONTUM_TRAPDOOR);
                addDrop(EldritchRealmsBlocks.PHONTUM_SAPLING);
                addDrop(EldritchRealmsBlocks.PHONTUM_LEAVES, leavesDrops(EldritchRealmsBlocks.PHONTUM_LEAVES, EldritchRealmsBlocks.PHONTUM_SAPLING, 0.05f));
                addDrop(EldritchRealmsBlocks.FLOWERING_PHONTUM_LEAVES, leavesDrops(EldritchRealmsBlocks.FLOWERING_PHONTUM_LEAVES, EldritchRealmsBlocks.PHONTUM_SAPLING, 0.05f));


                addDrop(EldritchRealmsBlocks.ELDEM_LOG);
                addDrop(EldritchRealmsBlocks.ELDEM_WOOD);
                addDrop(EldritchRealmsBlocks.STRIPPED_ELDEM_LOG);
                addDrop(EldritchRealmsBlocks.STRIPPED_ELDEM_WOOD);
                addDrop(EldritchRealmsBlocks.ELDEM_PLANKS);
                addDrop(EldritchRealmsBlocks.ELDEM_STAIRS);
                addDrop(EldritchRealmsBlocks.ELDEM_SLAB, slabDrops(EldritchRealmsBlocks.ELDEM_SLAB));
                addDrop(EldritchRealmsBlocks.ELDEM_BUTTON);
                addDrop(EldritchRealmsBlocks.ELDEM_PRESSURE_PLATE);
                addDrop(EldritchRealmsBlocks.ELDEM_DOOR, doorDrops(EldritchRealmsBlocks.ELDEM_DOOR));
                addDrop(EldritchRealmsBlocks.ELDEM_FENCE);
                addDrop(EldritchRealmsBlocks.ELDEM_FENCE_GATE);
                addDrop(EldritchRealmsBlocks.ELDEM_TRAPDOOR);
                addDrop(EldritchRealmsBlocks.ELDEM_SAPLING);
                addDrop(EldritchRealmsBlocks.ELDEM_LEAVES, leavesDrops(EldritchRealmsBlocks.ELDEM_LEAVES, EldritchRealmsBlocks.ELDEM_SAPLING, 0.05f));

                addDrop(EldritchRealmsBlocks.VEILSTONE_DREADQUARTZ_ORE, twoToFiveDrops(EldritchRealmsBlocks.VEILSTONE_DREADQUARTZ_ORE, EldritchRealmsItems.DREADQUARTZ));
                addDrop(EldritchRealmsBlocks.SHADOWSLATE_DREADQUARTZ_ORE, twoToFiveDrops(EldritchRealmsBlocks.SHADOWSLATE_DREADQUARTZ_ORE, EldritchRealmsItems.DREADQUARTZ));
                addDrop(EldritchRealmsBlocks.DREADQUARTZ_BLOCK);
                addDrop(EldritchRealmsBlocks.DREADQUARTZ_STAIRS);
                addDrop(EldritchRealmsBlocks.DREADQUARTZ_SLAB, slabDrops(EldritchRealmsBlocks.DREADQUARTZ_SLAB));
                addDrop(EldritchRealmsBlocks.DREADQUARTZ_WALL);
                addDrop(EldritchRealmsBlocks.DREADQUARTZ_BRICKS);
                addDrop(EldritchRealmsBlocks.DREADQUARTZ_BRICK_STAIRS);
                addDrop(EldritchRealmsBlocks.DREADQUARTZ_BRICK_SLAB, slabDrops(EldritchRealmsBlocks.DREADQUARTZ_BRICK_SLAB));
                addDrop(EldritchRealmsBlocks.DREADQUARTZ_BRICK_WALL);
                addDrop(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ);
                addDrop(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ_STAIRS);
                addDrop(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ_SLAB, slabDrops(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ_SLAB));
                addDrop(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ_WALL);
                addDrop(EldritchRealmsBlocks.DREADQUARTZ_PILLAR);
                addDrop(EldritchRealmsBlocks.CHISELED_DREADQUARTZ);

                addDrop(EldritchRealmsBlocks.MYTHRAL_GRASS_BLOCK, silkTouchDrop(EldritchRealmsBlocks.MYTHRAL_GRASS_BLOCK, EldritchRealmsBlocks.MARRED_SOIL));
                addDrop(EldritchRealmsBlocks.MARRED_SOIL);
                addDrop(EldritchRealmsBlocks.TILLED_MARRED_SOIL, drops(EldritchRealmsBlocks.MARRED_SOIL));
                addDrop(EldritchRealmsBlocks.MYTHRAL_GRASS, mythralGrassDrops(EldritchRealmsBlocks.MYTHRAL_GRASS));
                addDrop(EldritchRealmsBlocks.TALL_MYTHRAL_GRASS, tallMythralGrassDrops(EldritchRealmsBlocks.TALL_MYTHRAL_GRASS, EldritchRealmsBlocks.TALL_MYTHRAL_GRASS));

                addDrop(EldritchRealmsBlocks.SABLEBELL);
                addDrop(EldritchRealmsBlocks.PHONTUM_PETALS, flowerbedDrops(EldritchRealmsBlocks.PHONTUM_PETALS));

                BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(EldritchRealmsBlocks.ALK_WHEAT).properties(StatePredicate.Builder.create()
                        .exactMatch(AlkWheatCropBlock.AGE, 7));
                addDrop(EldritchRealmsBlocks.ALK_WHEAT, cropDrops(EldritchRealmsBlocks.ALK_WHEAT, EldritchRealmsItems.ALK_WHEAT, EldritchRealmsItems.ALK_WHEAT_SEEDS, builder));


                addDrop(EldritchRealmsBlocks.VEILSTONE_SHADOWSTEEL_ORE, oneToTwoDrops(EldritchRealmsBlocks.VEILSTONE_SHADOWSTEEL_ORE, EldritchRealmsItems.SHADOWSTEEL_DUST));
                addDrop(EldritchRealmsBlocks.SHADOWSLATE_SHADOWSTEEL_ORE, oneToTwoDrops(EldritchRealmsBlocks.SHADOWSLATE_SHADOWSTEEL_ORE, EldritchRealmsItems.SHADOWSTEEL_DUST));
                addDrop(EldritchRealmsBlocks.SHADOWSTEEL_BLOCK);


    }

    public LootTable.Builder silkTouchDrop(Block drop, Block block) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder) this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(block)
                                .apply(SetCountLootFunction
                                        .builder(ConstantLootNumberProvider
                                                .create(1.0f))))));
    }

    public LootTable.Builder oneToTwoDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder) this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(1.0f, 2.0f))))));
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

    public LootTable.Builder mythralGrassDrops(Block dropWithShears) {
        return dropsWithShears(
                dropWithShears,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        dropWithShears,
                        ItemEntry.builder(EldritchRealmsItems.ALK_WHEAT_SEEDS)
                                .conditionally(RandomChanceLootCondition.builder(0.125F))
                                .apply(ApplyBonusLootFunction.uniformBonusCount(Enchantments.FORTUNE, 2))
                )
        );
    }
    public LootTable.Builder tallMythralGrassDrops(Block tallGrass, Block grass) {
        LootPoolEntry.Builder<?> builder = ItemEntry.builder(grass)
                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0F)))
                .conditionally(WITH_SHEARS)
                .alternatively(
                        ((LeafEntry.Builder)this.addSurvivesExplosionCondition(tallGrass, ItemEntry.builder(EldritchRealmsItems.ALK_WHEAT_SEEDS)))
                                .conditionally(RandomChanceLootCondition.builder(0.125F))
                );
        return LootTable.builder()
                .pool(
                        LootPool.builder()
                                .with(builder)
                                .conditionally(
                                        BlockStatePropertyLootCondition.builder(tallGrass).properties(StatePredicate.Builder.create().exactMatch(TallPlantBlock.HALF, DoubleBlockHalf.LOWER))
                                )
                                .conditionally(
                                        LocationCheckLootCondition.builder(
                                                LocationPredicate.Builder.create()
                                                        .block(
                                                                BlockPredicate.Builder.create()
                                                                        .blocks(tallGrass)
                                                                        .state(StatePredicate.Builder.create().exactMatch(TallPlantBlock.HALF, DoubleBlockHalf.UPPER).build())
                                                                        .build()
                                                        ),
                                                new BlockPos(0, 1, 0)
                                        )
                                )
                )
                .pool(
                        LootPool.builder()
                                .with(builder)
                                .conditionally(
                                        BlockStatePropertyLootCondition.builder(tallGrass).properties(StatePredicate.Builder.create().exactMatch(TallPlantBlock.HALF, DoubleBlockHalf.UPPER))
                                )
                                .conditionally(
                                        LocationCheckLootCondition.builder(
                                                LocationPredicate.Builder.create()
                                                        .block(
                                                                BlockPredicate.Builder.create()
                                                                        .blocks(tallGrass)
                                                                        .state(StatePredicate.Builder.create().exactMatch(TallPlantBlock.HALF, DoubleBlockHalf.LOWER).build())
                                                                        .build()
                                                        ),
                                                new BlockPos(0, -1, 0)
                                        )
                                )
                );
    }

    public LootTable.Builder eldritchCropDrops(Block crop, Item product, Item seeds, LootCondition.Builder condition) {
        return this.applyExplosionDecay(
                crop,
                LootTable.builder()
                        .pool(LootPool.builder().with(ItemEntry.builder(product).conditionally(condition).alternatively(ItemEntry.builder(seeds))))
                        .pool(
                                LootPool.builder()
                                        .conditionally(condition)
                                        .with(ItemEntry.builder(seeds).apply(ApplyBonusLootFunction.binomialWithBonusCount(Enchantments.FORTUNE, 0.5714286F, 3)))
                        )
        );
    }


}
