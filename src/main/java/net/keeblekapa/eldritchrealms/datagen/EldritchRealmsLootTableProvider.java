package net.keeblekapa.eldritchrealms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
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


                addDrop(EldritchRealmsBlocks.VEILSTONE, EldritchRealmsBlocks.COBBLED_VEILSTONE);
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



    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder) this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
