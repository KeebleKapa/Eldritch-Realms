package net.keeblekapa.eldritchrealms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.keeblekapa.eldritchrealms.block.custom.AlkWheatCropBlock;
import net.keeblekapa.eldritchrealms.item.EldritchRealmsItems;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;

public class EldritchRealmsModelProvider extends FabricModelProvider {
    public EldritchRealmsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool agbPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS);
        agbPool.stairs(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_STAIRS);
        agbPool.slab(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_SLAB);
        agbPool.wall(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool agPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.ABYSSAL_GRANITE);
        agPool.stairs(EldritchRealmsBlocks.ABYSSAL_GRANITE_STAIRS);
        agPool.slab(EldritchRealmsBlocks.ABYSSAL_GRANITE_SLAB);
        agPool.wall(EldritchRealmsBlocks.ABYSSAL_GRANITE_WALL);

        BlockStateModelGenerator.BlockTexturePool cagbPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS);
        cagbPool.stairs(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_STAIRS);
        cagbPool.slab(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB);
        cagbPool.wall(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool pagPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE);
        pagPool.stairs(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_STAIRS);
        pagPool.slab(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_SLAB);
        pagPool.wall(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_WALL);

        BlockStateModelGenerator.BlockTexturePool magbPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS);
        magbPool.stairs(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS);
        magbPool.slab(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB);
        magbPool.wall(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool magPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE);
        magPool.stairs(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_STAIRS);
        magPool.slab(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_SLAB);
        magPool.wall(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_WALL);

        BlockStateModelGenerator.BlockTexturePool cmagbPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS);
        cmagbPool.stairs(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS);
        cmagbPool.slab(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB);
        cmagbPool.wall(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool mpagPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE);
        mpagPool.stairs(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_STAIRS);
        mpagPool.slab(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB);
        mpagPool.wall(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_WALL);




        BlockStateModelGenerator.BlockTexturePool vPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.VEILSTONE);
        vPool.stairs(EldritchRealmsBlocks.VEILSTONE_STAIRS);
        vPool.slab(EldritchRealmsBlocks.VEILSTONE_SLAB);
        vPool.wall(EldritchRealmsBlocks.VEILSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool cvPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.COBBLED_VEILSTONE);
        cvPool.stairs(EldritchRealmsBlocks.COBBLED_VEILSTONE_STAIRS);
        cvPool.slab(EldritchRealmsBlocks.COBBLED_VEILSTONE_SLAB);
        cvPool.wall(EldritchRealmsBlocks.COBBLED_VEILSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool vbPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.VEILSTONE_BRICKS);
        vbPool.stairs(EldritchRealmsBlocks.VEILSTONE_BRICK_STAIRS);
        vbPool.slab(EldritchRealmsBlocks.VEILSTONE_BRICK_SLAB);
        vbPool.wall(EldritchRealmsBlocks.VEILSTONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool svPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.SMOOTH_VEILSTONE);
        svPool.stairs(EldritchRealmsBlocks.SMOOTH_VEILSTONE_STAIRS);
        svPool.wall(EldritchRealmsBlocks.SMOOTH_VEILSTONE_WALL);




        BlockStateModelGenerator.BlockTexturePool psPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.POLISHED_SHADOWSLATE);
        psPool.stairs(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_STAIRS);
        psPool.slab(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_SLAB);
        psPool.wall(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_WALL);

        BlockStateModelGenerator.BlockTexturePool sbPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.SHADOWSLATE_BRICKS);
        sbPool.stairs(EldritchRealmsBlocks.SHADOWSLATE_BRICK_STAIRS);
        sbPool.slab(EldritchRealmsBlocks.SHADOWSLATE_BRICK_SLAB);
        sbPool.wall(EldritchRealmsBlocks.SHADOWSLATE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool stPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.SHADOWSLATE_TILES);
        stPool.stairs(EldritchRealmsBlocks.SHADOWSLATE_TILE_STAIRS);
        stPool.slab(EldritchRealmsBlocks.SHADOWSLATE_TILE_SLAB);
        stPool.wall(EldritchRealmsBlocks.SHADOWSLATE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool csbPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICKS);
        csbPool.stairs(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_STAIRS);
        csbPool.slab(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_SLAB);
        csbPool.wall(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool cstPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILES);
        cstPool.stairs(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_STAIRS);
        cstPool.slab(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_SLAB);
        cstPool.wall(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_WALL);




        BlockStateModelGenerator.BlockTexturePool ccPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.CRIMSON_COBBLE);
        ccPool.stairs(EldritchRealmsBlocks.CRIMSON_COBBLE_STAIRS);
        ccPool.slab(EldritchRealmsBlocks.CRIMSON_COBBLE_SLAB);
        ccPool.wall(EldritchRealmsBlocks.CRIMSON_COBBLE_WALL);




        BlockStateModelGenerator.BlockTexturePool elPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.ELDRITCH_LIMESTONE);
        elPool.stairs(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_STAIRS);
        elPool.slab(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_SLAB);
        elPool.wall(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool pelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE);
        pelPool.stairs(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_STAIRS);
        pelPool.slab(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_SLAB);
        pelPool.wall(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool elbPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS);
        elbPool.stairs(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_STAIRS);
        elbPool.slab(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_SLAB);
        elbPool.wall(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_WALL);


        blockStateModelGenerator.registerLog(EldritchRealmsBlocks.UMBRAM_OAK_LOG).log(EldritchRealmsBlocks.UMBRAM_OAK_LOG).wood(EldritchRealmsBlocks.UMBRAM_OAK_WOOD);
        blockStateModelGenerator.registerLog(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_LOG).log(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_LOG).wood(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_WOOD);
        BlockStateModelGenerator.BlockTexturePool uoPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.UMBRAM_OAK_PLANKS);
        uoPool.stairs(EldritchRealmsBlocks.UMBRAM_OAK_STAIRS);
        uoPool.slab(EldritchRealmsBlocks.UMBRAM_OAK_SLAB);
        uoPool.fence(EldritchRealmsBlocks.UMBRAM_OAK_FENCE);
        uoPool.fenceGate(EldritchRealmsBlocks.UMBRAM_OAK_FENCE_GATE);
        uoPool.pressurePlate(EldritchRealmsBlocks.UMBRAM_OAK_PRESSURE_PLATE);
        uoPool.button(EldritchRealmsBlocks.UMBRAM_OAK_BUTTON);
        blockStateModelGenerator.registerDoor(EldritchRealmsBlocks.UMBRAM_OAK_DOOR);
        blockStateModelGenerator.registerSimpleCubeAll(EldritchRealmsBlocks.UMBRAM_OAK_LEAVES);
        blockStateModelGenerator.registerTintableCross(EldritchRealmsBlocks.UMBRAM_OAK_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);


        blockStateModelGenerator.registerLog(EldritchRealmsBlocks.ELDEM_LOG).log(EldritchRealmsBlocks.ELDEM_LOG).wood(EldritchRealmsBlocks.ELDEM_WOOD);
        blockStateModelGenerator.registerLog(EldritchRealmsBlocks.STRIPPED_ELDEM_LOG).log(EldritchRealmsBlocks.STRIPPED_ELDEM_LOG).wood(EldritchRealmsBlocks.STRIPPED_ELDEM_WOOD);
        BlockStateModelGenerator.BlockTexturePool ePool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.ELDEM_PLANKS);
        ePool.stairs(EldritchRealmsBlocks.ELDEM_STAIRS);
        ePool.slab(EldritchRealmsBlocks.ELDEM_SLAB);
        ePool.fence(EldritchRealmsBlocks.ELDEM_FENCE);
        ePool.fenceGate(EldritchRealmsBlocks.ELDEM_FENCE_GATE);
        ePool.pressurePlate(EldritchRealmsBlocks.ELDEM_PRESSURE_PLATE);
        ePool.button(EldritchRealmsBlocks.ELDEM_BUTTON);
        blockStateModelGenerator.registerSimpleCubeAll(EldritchRealmsBlocks.ELDEM_LEAVES);
        blockStateModelGenerator.registerTintableCross(EldritchRealmsBlocks.ELDEM_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);


        blockStateModelGenerator.registerLog(EldritchRealmsBlocks.PHONTUM_LOG).log(EldritchRealmsBlocks.PHONTUM_LOG).wood(EldritchRealmsBlocks.PHONTUM_WOOD);
        blockStateModelGenerator.registerLog(EldritchRealmsBlocks.STRIPPED_PHONTUM_LOG).log(EldritchRealmsBlocks.STRIPPED_PHONTUM_LOG).wood(EldritchRealmsBlocks.STRIPPED_PHONTUM_WOOD);
        BlockStateModelGenerator.BlockTexturePool pPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.PHONTUM_PLANKS);
        pPool.stairs(EldritchRealmsBlocks.PHONTUM_STAIRS);
        pPool.slab(EldritchRealmsBlocks.PHONTUM_SLAB);
        pPool.fence(EldritchRealmsBlocks.PHONTUM_FENCE);
        pPool.fenceGate(EldritchRealmsBlocks.PHONTUM_FENCE_GATE);
        pPool.pressurePlate(EldritchRealmsBlocks.PHONTUM_PRESSURE_PLATE);
        pPool.button(EldritchRealmsBlocks.PHONTUM_BUTTON);
        blockStateModelGenerator.registerDoor(EldritchRealmsBlocks.PHONTUM_DOOR);
        blockStateModelGenerator.registerSimpleCubeAll(EldritchRealmsBlocks.PHONTUM_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(EldritchRealmsBlocks.FLOWERING_PHONTUM_LEAVES);
        blockStateModelGenerator.registerTintableCross(EldritchRealmsBlocks.PHONTUM_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);


        blockStateModelGenerator.registerSimpleCubeAll(EldritchRealmsBlocks.GLOOMARBLE);


        BlockStateModelGenerator.BlockTexturePool sdPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ);
        sdPool.stairs(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ_STAIRS);
        sdPool.slab(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ_SLAB);
        sdPool.wall(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ_WALL);

        BlockStateModelGenerator.BlockTexturePool dbPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EldritchRealmsBlocks.DREADQUARTZ_BRICKS);
        dbPool.stairs(EldritchRealmsBlocks.DREADQUARTZ_BRICK_STAIRS);
        dbPool.slab(EldritchRealmsBlocks.DREADQUARTZ_BRICK_SLAB);
        dbPool.wall(EldritchRealmsBlocks.DREADQUARTZ_BRICK_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(EldritchRealmsBlocks.VEILSTONE_DREADQUARTZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EldritchRealmsBlocks.SHADOWSLATE_DREADQUARTZ_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(EldritchRealmsBlocks.MARRED_SOIL);


        blockStateModelGenerator.registerSimpleCubeAll(EldritchRealmsBlocks.EBON_OBSIDIAN);
        blockStateModelGenerator.registerSimpleCubeAll(EldritchRealmsBlocks.GLISTENING_EBON_OBSIDIAN);

        blockStateModelGenerator.registerCrop(EldritchRealmsBlocks.ALK_WHEAT, AlkWheatCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);



        blockStateModelGenerator.registerSimpleCubeAll(EldritchRealmsBlocks.SHADOWSTEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(EldritchRealmsBlocks.VEILSTONE_SHADOWSTEEL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EldritchRealmsBlocks.SHADOWSLATE_SHADOWSTEEL_ORE);


    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(EldritchRealmsItems.DREADQUARTZ, Models.GENERATED);
        itemModelGenerator.register(EldritchRealmsItems.GLOOMARBLE_DUST, Models.GENERATED);
        itemModelGenerator.register(EldritchRealmsItems.NEBULA_LAPIS, Models.GENERATED);


        itemModelGenerator.register(EldritchRealmsItems.REINFORCED_IRON_ROD, Models.GENERATED);


        itemModelGenerator.register(EldritchRealmsItems.SHADOWSTEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(EldritchRealmsItems.SHADOWSTEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(EldritchRealmsItems.SHADOWSTEEL_CLUMP, Models.GENERATED);
        itemModelGenerator.register(EldritchRealmsItems.SHADOWSTEEL_DUST, Models.GENERATED);
        itemModelGenerator.register(EldritchRealmsItems.SHADOWSTEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(EldritchRealmsItems.SHADOWSTEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(EldritchRealmsItems.SHADOWSTEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(EldritchRealmsItems.SHADOWSTEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(EldritchRealmsItems.SHADOWSTEEL_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(((ArmorItem) EldritchRealmsItems.SHADOWSTEEL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) EldritchRealmsItems.SHADOWSTEEL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) EldritchRealmsItems.SHADOWSTEEL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) EldritchRealmsItems.SHADOWSTEEL_BOOTS));
    }
}
