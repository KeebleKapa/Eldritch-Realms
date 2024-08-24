package net.keeblekapa.eldritchrealms.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class EldritchRealmsItemGroups {

    public static final ItemGroup ELDRITCH_REALMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EldritchRealms.MOD_ID, "eldritch_realms"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eldritch_realms"))
                    .icon(() -> new ItemStack(EldritchRealmsItems.DREADQUARTZ)).entries((displayContext, entries) -> {
                        // Blocks
                        entries.add(EldritchRealmsBlocks.VEILSTONE);
                        entries.add(EldritchRealmsBlocks.VEILSTONE_SLAB);
                        entries.add(EldritchRealmsBlocks.VEILSTONE_STAIRS);
                        entries.add(EldritchRealmsBlocks.VEILSTONE_WALL);
                        entries.add(EldritchRealmsBlocks.COBBLED_VEILSTONE);
                        entries.add(EldritchRealmsBlocks.COBBLED_VEILSTONE_SLAB);
                        entries.add(EldritchRealmsBlocks.COBBLED_VEILSTONE_STAIRS);
                        entries.add(EldritchRealmsBlocks.COBBLED_VEILSTONE_WALL);
                        entries.add(EldritchRealmsBlocks.VEILSTONE_BRICKS);
                        entries.add(EldritchRealmsBlocks.VEILSTONE_BRICK_SLAB);
                        entries.add(EldritchRealmsBlocks.VEILSTONE_BRICK_STAIRS);
                        entries.add(EldritchRealmsBlocks.VEILSTONE_BRICK_WALL);
                        entries.add(EldritchRealmsBlocks.SMOOTH_VEILSTONE);
                        entries.add(EldritchRealmsBlocks.SMOOTH_VEILSTONE_SLAB);
                        entries.add(EldritchRealmsBlocks.SMOOTH_VEILSTONE_STAIRS);
                        entries.add(EldritchRealmsBlocks.SMOOTH_VEILSTONE_WALL);
                        entries.add(EldritchRealmsBlocks.ABYSSAL_GRANITE);
                        entries.add(EldritchRealmsBlocks.ABYSSAL_GRANITE_SLAB);
                        entries.add(EldritchRealmsBlocks.ABYSSAL_GRANITE_STAIRS);
                        entries.add(EldritchRealmsBlocks.ABYSSAL_GRANITE_WALL);
                        entries.add(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE);
                        entries.add(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_SLAB);
                        entries.add(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_STAIRS);
                        entries.add(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_WALL);
                        entries.add(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS);
                        entries.add(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_SLAB);
                        entries.add(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_STAIRS);
                        entries.add(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_WALL);
                        entries.add(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS);
                        entries.add(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB);
                        entries.add(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_STAIRS);
                        entries.add(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_WALL);
                        entries.add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE);
                        entries.add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_SLAB);
                        entries.add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_STAIRS);
                        entries.add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_WALL);
                        entries.add(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE);
                        entries.add(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB);
                        entries.add(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_STAIRS);
                        entries.add(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_WALL);
                        entries.add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS);
                        entries.add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB);
                        entries.add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS);
                        entries.add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_WALL);
                        entries.add(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS);
                        entries.add(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB);
                        entries.add(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS);
                        entries.add(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_WALL);

                        entries.add(EldritchRealmsBlocks.SHADOWSLATE);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_SLAB);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_STAIRS);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_WALL);
                        entries.add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE);
                        entries.add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_SLAB);
                        entries.add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_STAIRS);
                        entries.add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_WALL);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_BRICKS);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_BRICK_SLAB);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_BRICK_STAIRS);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_BRICK_WALL);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_TILES);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_TILE_SLAB);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_TILE_STAIRS);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_TILE_WALL);
                        entries.add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICKS);
                        entries.add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_SLAB);
                        entries.add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_STAIRS);
                        entries.add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_WALL);
                        entries.add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILES);
                        entries.add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_SLAB);
                        entries.add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_STAIRS);
                        entries.add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_WALL);

                        entries.add(EldritchRealmsBlocks.CRIMSON_COBBLE);
                        entries.add(EldritchRealmsBlocks.CRIMSON_COBBLE_SLAB);
                        entries.add(EldritchRealmsBlocks.CRIMSON_COBBLE_STAIRS);
                        entries.add(EldritchRealmsBlocks.CRIMSON_COBBLE_WALL);

                        entries.add(EldritchRealmsBlocks.GLOOMARBLE);
                        entries.add(EldritchRealmsItems.GLOOMARBLE_DUST);

                        // Items
                        entries.add(EldritchRealmsItems.DREADQUARTZ);




                    }).build());

    public static void registerItemGroups() {
        EldritchRealms.LOGGER.info("Registering Item Groups for " + EldritchRealms.MOD_ID);
    }

}
