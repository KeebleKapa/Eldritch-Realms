package net.keeblekapa.eldritchrealms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.keeblekapa.eldritchrealms.item.EldritchRealmsItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class EldritchRealmsModelProvider extends FabricModelProvider {
    public EldritchRealmsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool agbPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool agPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.ABYSSAL_GRANITE);
        BlockStateModelGenerator.BlockTexturePool cagbPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool pagPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE);
        BlockStateModelGenerator.BlockTexturePool magbPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool magPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE);
        BlockStateModelGenerator.BlockTexturePool cmagbPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mpagPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE);
        BlockStateModelGenerator.BlockTexturePool vPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.VEILSTONE);
        BlockStateModelGenerator.BlockTexturePool cvPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.COBBLED_VEILSTONE);
        BlockStateModelGenerator.BlockTexturePool vbPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.VEILSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool svPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.SMOOTH_VEILSTONE);

        agbPool.stairs(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_STAIRS);
        agbPool.slab(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_SLAB);
        agbPool.wall(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_WALL);

        agPool.stairs(EldritchRealmsBlocks.ABYSSAL_GRANITE_STAIRS);
        agPool.slab(EldritchRealmsBlocks.ABYSSAL_GRANITE_SLAB);
        agPool.wall(EldritchRealmsBlocks.ABYSSAL_GRANITE_WALL);

        cagbPool.stairs(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_STAIRS);
        cagbPool.slab(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB);
        cagbPool.wall(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_WALL);

        pagPool.stairs(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_STAIRS);
        pagPool.slab(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_SLAB);
        pagPool.wall(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_WALL);

        magbPool.stairs(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS);
        magbPool.slab(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB);
        magbPool.wall(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_WALL);

        magPool.stairs(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_STAIRS);
        magPool.slab(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_SLAB);
        magPool.wall(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_WALL);

        cmagbPool.stairs(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS);
        cmagbPool.slab(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB);
        cmagbPool.wall(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_WALL);

        mpagPool.stairs(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_STAIRS);
        mpagPool.slab(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB);
        mpagPool.wall(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_WALL);

        vPool.stairs(EldritchRealmsBlocks.VEILSTONE_STAIRS);
        vPool.slab(EldritchRealmsBlocks.VEILSTONE_SLAB);
        vPool.wall(EldritchRealmsBlocks.VEILSTONE_WALL);

        cvPool.stairs(EldritchRealmsBlocks.COBBLED_VEILSTONE_STAIRS);
        cvPool.slab(EldritchRealmsBlocks.COBBLED_VEILSTONE_SLAB);
        cvPool.wall(EldritchRealmsBlocks.COBBLED_VEILSTONE_WALL);

        vbPool.stairs(EldritchRealmsBlocks.VEILSTONE_BRICK_STAIRS);
        vbPool.slab(EldritchRealmsBlocks.VEILSTONE_BRICK_SLAB);
        vbPool.wall(EldritchRealmsBlocks.VEILSTONE_BRICK_WALL);

        svPool.stairs(EldritchRealmsBlocks.SMOOTH_VEILSTONE_STAIRS);
        svPool.wall(EldritchRealmsBlocks.SMOOTH_VEILSTONE_WALL);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(EldritchRealmsItems.DREADQUARTZ, Models.GENERATED);
    }
}
