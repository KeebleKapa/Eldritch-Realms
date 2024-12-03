package net.keeblekapa.eldritchrealms.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class EldritchRealmsItemGroups {

    public static final ItemGroup ELDRITCH_REALMS_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EldritchRealms.MOD_ID, "eldritch_realms_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eldritch_realms_blocks"))
                    .icon(() -> new ItemStack(EldritchRealmsBlocks.COBBLED_VEILSTONE)).entries((displayContext, entries) -> {
                        // Blocks
                        entries.add(EldritchRealmsBlocks.VEILSTONE);
                        entries.add(EldritchRealmsBlocks.VEILSTONE_STAIRS);
                        entries.add(EldritchRealmsBlocks.VEILSTONE_SLAB);
                        entries.add(EldritchRealmsBlocks.VEILSTONE_WALL);
                        entries.add(EldritchRealmsBlocks.COBBLED_VEILSTONE);
                        entries.add(EldritchRealmsBlocks.COBBLED_VEILSTONE_STAIRS);
                        entries.add(EldritchRealmsBlocks.COBBLED_VEILSTONE_SLAB);
                        entries.add(EldritchRealmsBlocks.COBBLED_VEILSTONE_WALL);
                        entries.add(EldritchRealmsBlocks.VEILSTONE_BRICKS);
                        entries.add(EldritchRealmsBlocks.VEILSTONE_BRICK_STAIRS);
                        entries.add(EldritchRealmsBlocks.VEILSTONE_BRICK_SLAB);
                        entries.add(EldritchRealmsBlocks.VEILSTONE_BRICK_WALL);
                        entries.add(EldritchRealmsBlocks.SMOOTH_VEILSTONE);
                        entries.add(EldritchRealmsBlocks.SMOOTH_VEILSTONE_STAIRS);
                        entries.add(EldritchRealmsBlocks.SMOOTH_VEILSTONE_SLAB);
                        entries.add(EldritchRealmsBlocks.SMOOTH_VEILSTONE_WALL);
                        entries.add(EldritchRealmsBlocks.ABYSSAL_GRANITE);
                        entries.add(EldritchRealmsBlocks.ABYSSAL_GRANITE_STAIRS);
                        entries.add(EldritchRealmsBlocks.ABYSSAL_GRANITE_SLAB);
                        entries.add(EldritchRealmsBlocks.ABYSSAL_GRANITE_WALL);
                        entries.add(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE);
                        entries.add(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_STAIRS);
                        entries.add(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_SLAB);
                        entries.add(EldritchRealmsBlocks.POLISHED_ABYSSAL_GRANITE_WALL);
                        entries.add(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICKS);
                        entries.add(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_STAIRS);
                        entries.add(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_SLAB);
                        entries.add(EldritchRealmsBlocks.ABYSSAL_GRANITE_BRICK_WALL);
                        entries.add(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICKS);
                        entries.add(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_STAIRS);
                        entries.add(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_SLAB);
                        entries.add(EldritchRealmsBlocks.CRACKED_ABYSSAL_GRANITE_BRICK_WALL);
                        entries.add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE);
                        entries.add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_STAIRS);
                        entries.add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_SLAB);
                        entries.add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_WALL);
                        entries.add(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE);
                        entries.add(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_STAIRS);
                        entries.add(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_SLAB);
                        entries.add(EldritchRealmsBlocks.MOSSY_POLISHED_ABYSSAL_GRANITE_WALL);
                        entries.add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICKS);
                        entries.add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS);
                        entries.add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_SLAB);
                        entries.add(EldritchRealmsBlocks.MOSSY_ABYSSAL_GRANITE_BRICK_WALL);
                        entries.add(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICKS);
                        entries.add(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_STAIRS);
                        entries.add(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_SLAB);
                        entries.add(EldritchRealmsBlocks.CRACKED_MOSSY_ABYSSAL_GRANITE_BRICK_WALL);

                        entries.add(EldritchRealmsBlocks.SHADOWSLATE);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_STAIRS);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_SLAB);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_WALL);
                        entries.add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE);
                        entries.add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_STAIRS);
                        entries.add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_SLAB);
                        entries.add(EldritchRealmsBlocks.POLISHED_SHADOWSLATE_WALL);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_BRICKS);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_BRICK_STAIRS);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_BRICK_SLAB);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_BRICK_WALL);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_TILES);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_TILE_STAIRS);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_TILE_SLAB);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_TILE_WALL);
                        entries.add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICKS);
                        entries.add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_STAIRS);
                        entries.add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_SLAB);
                        entries.add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_BRICK_WALL);
                        entries.add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILES);
                        entries.add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_STAIRS);
                        entries.add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_SLAB);
                        entries.add(EldritchRealmsBlocks.CRACKED_SHADOWSLATE_TILE_WALL);

                        entries.add(EldritchRealmsBlocks.CRIMSON_COBBLE);
                        entries.add(EldritchRealmsBlocks.CRIMSON_COBBLE_STAIRS);
                        entries.add(EldritchRealmsBlocks.CRIMSON_COBBLE_SLAB);
                        entries.add(EldritchRealmsBlocks.CRIMSON_COBBLE_WALL);

                        entries.add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE);
                        entries.add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_STAIRS);
                        entries.add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_SLAB);
                        entries.add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_WALL);
                        entries.add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_PILLAR);
                        entries.add(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE);
                        entries.add(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_STAIRS);
                        entries.add(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_SLAB);
                        entries.add(EldritchRealmsBlocks.POLISHED_ELDRITCH_LIMESTONE_WALL);
                        entries.add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICKS);
                        entries.add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_STAIRS);
                        entries.add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_SLAB);
                        entries.add(EldritchRealmsBlocks.ELDRITCH_LIMESTONE_BRICK_WALL);


                        entries.add(EldritchRealmsBlocks.GLOOMARBLE);



                        entries.add(EldritchRealmsBlocks.DREADQUARTZ_ORE);
                        entries.add(EldritchRealmsBlocks.SHADOWSLATE_DREADQUARTZ_ORE);
                        entries.add(EldritchRealmsBlocks.DREADQUARTZ_BLOCK);
                        entries.add(EldritchRealmsBlocks.DREADQUARTZ_STAIRS);
                        entries.add(EldritchRealmsBlocks.DREADQUARTZ_SLAB);
                        entries.add(EldritchRealmsBlocks.DREADQUARTZ_WALL);
                        entries.add(EldritchRealmsBlocks.DREADQUARTZ_BRICKS);
                        entries.add(EldritchRealmsBlocks.DREADQUARTZ_BRICK_STAIRS);
                        entries.add(EldritchRealmsBlocks.DREADQUARTZ_BRICK_SLAB);
                        entries.add(EldritchRealmsBlocks.DREADQUARTZ_BRICK_WALL);
                        entries.add(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ);
                        entries.add(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ_STAIRS);
                        entries.add(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ_SLAB);
                        entries.add(EldritchRealmsBlocks.SMOOTH_DREADQUARTZ_WALL);
                        entries.add(EldritchRealmsBlocks.DREADQUARTZ_PILLAR);
                        entries.add(EldritchRealmsBlocks.CHISELED_DREADQUARTZ);

                        entries.add(EldritchRealmsBlocks.EERIE_GRAVEL);
                        entries.add(EldritchRealmsBlocks.ASTRAL_SAND);
                        entries.add(EldritchRealmsBlocks.ASTRAL_SANDSTONE);
                        entries.add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_STAIRS);
                        entries.add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_SLAB);
                        entries.add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_WALL);
                        entries.add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICKS);
                        entries.add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICK_STAIRS);
                        entries.add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICK_SLAB);
                        entries.add(EldritchRealmsBlocks.ASTRAL_SANDSTONE_BRICK_WALL);
                        entries.add(EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE);
                        entries.add(EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE_STAIRS);
                        entries.add(EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE_SLAB);
                        entries.add(EldritchRealmsBlocks.SMOOTH_ASTRAL_SANDSTONE_WALL);


                        entries.add(EldritchRealmsBlocks.UMBRAM_OAK_LOG);
                        entries.add(EldritchRealmsBlocks.UMBRAM_OAK_WOOD);
                        entries.add(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_LOG);
                        entries.add(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_WOOD);
                        entries.add(EldritchRealmsBlocks.UMBRAM_OAK_PLANKS);
                        entries.add(EldritchRealmsBlocks.UMBRAM_OAK_STAIRS);
                        entries.add(EldritchRealmsBlocks.UMBRAM_OAK_SLAB);
                        entries.add(EldritchRealmsBlocks.UMBRAM_OAK_FENCE);
                        entries.add(EldritchRealmsBlocks.UMBRAM_OAK_FENCE_GATE);
                        entries.add(EldritchRealmsBlocks.UMBRAM_OAK_DOOR);
                        entries.add(EldritchRealmsBlocks.UMBRAM_OAK_TRAPDOOR);
                        entries.add(EldritchRealmsBlocks.UMBRAM_OAK_PRESSURE_PLATE);
                        entries.add(EldritchRealmsBlocks.UMBRAM_OAK_BUTTON);

                        entries.add(EldritchRealmsBlocks.PHONTUM_LOG);
                        entries.add(EldritchRealmsBlocks.PHONTUM_WOOD);
                        entries.add(EldritchRealmsBlocks.STRIPPED_PHONTUM_LOG);
                        entries.add(EldritchRealmsBlocks.STRIPPED_PHONTUM_WOOD);
                        entries.add(EldritchRealmsBlocks.PHONTUM_PLANKS);
                        entries.add(EldritchRealmsBlocks.PHONTUM_STAIRS);
                        entries.add(EldritchRealmsBlocks.PHONTUM_SLAB);
                        entries.add(EldritchRealmsBlocks.PHONTUM_FENCE);
                        entries.add(EldritchRealmsBlocks.PHONTUM_FENCE_GATE);
                        entries.add(EldritchRealmsBlocks.PHONTUM_DOOR);
                        entries.add(EldritchRealmsBlocks.PHONTUM_TRAPDOOR);
                        entries.add(EldritchRealmsBlocks.PHONTUM_PRESSURE_PLATE);
                        entries.add(EldritchRealmsBlocks.PHONTUM_BUTTON);


                        entries.add(EldritchRealmsBlocks.ELDEM_LOG);
                        entries.add(EldritchRealmsBlocks.ELDEM_WOOD);
                        entries.add(EldritchRealmsBlocks.STRIPPED_ELDEM_LOG);
                        entries.add(EldritchRealmsBlocks.STRIPPED_ELDEM_WOOD);
                        entries.add(EldritchRealmsBlocks.ELDEM_PLANKS);
                        entries.add(EldritchRealmsBlocks.ELDEM_STAIRS);
                        entries.add(EldritchRealmsBlocks.ELDEM_SLAB);
                        entries.add(EldritchRealmsBlocks.ELDEM_FENCE);
                        entries.add(EldritchRealmsBlocks.ELDEM_FENCE_GATE);
                        entries.add(EldritchRealmsBlocks.ELDEM_DOOR);
                        entries.add(EldritchRealmsBlocks.ELDEM_TRAPDOOR);
                        entries.add(EldritchRealmsBlocks.ELDEM_PRESSURE_PLATE);
                        entries.add(EldritchRealmsBlocks.ELDEM_BUTTON);







                    }).build());

    public static final ItemGroup ELDRITCH_REALMS_TOOLS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EldritchRealms.MOD_ID, "eldritch_realms_tools"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eldritch_realms_tools"))
                    .icon(() -> new ItemStack(EldritchRealmsItems.DREADQUARTZ)).entries((displayContext, entries) -> {


                    }).build());

    public static final ItemGroup ELDRITCH_REALMS_ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EldritchRealms.MOD_ID, "eldritch_realms_items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eldritch_realms_items"))
                    .icon(() -> new ItemStack(EldritchRealmsItems.DREADQUARTZ)).entries((displayContext, entries) -> {
                        entries.add(EldritchRealmsItems.GLOOMARBLE_DUST);
                        entries.add(EldritchRealmsItems.DREADQUARTZ);

                    }).build());

    public static final ItemGroup ELDRITCH_REALMS_NATURE_STUFF = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EldritchRealms.MOD_ID, "eldritch_realms_nature_stuff"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eldritch_realms_nature_stuff"))
                    .icon(() -> new ItemStack(EldritchRealmsBlocks.MYTHRAL_GRASS_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(EldritchRealmsBlocks.MYTHRAL_GRASS_BLOCK);
                        entries.add(EldritchRealmsBlocks.MARRED_SOIL);
                        entries.add(EldritchRealmsBlocks.TILLED_MARRED_SOIL);
                        entries.add(EldritchRealmsBlocks.MYTHRAL_GRASS);
                        entries.add(EldritchRealmsBlocks.TALL_MYTHRAL_GRASS);
                        entries.add(EldritchRealmsItems.ALK_WHEAT_SEEDS);
                        entries.add(EldritchRealmsItems.ALK_WHEAT);
                        entries.add(EldritchRealmsBlocks.UMBRAM_OAK_LEAVES);
                        entries.add(EldritchRealmsBlocks.PHONTUM_LEAVES);
                        entries.add(EldritchRealmsBlocks.FLOWERING_PHONTUM_LEAVES);
                        entries.add(EldritchRealmsBlocks.PHONTUM_PETALS);
                        entries.add(EldritchRealmsBlocks.ELDEM_LEAVES);
                        entries.add(EldritchRealmsBlocks.UMBRAM_OAK_SAPLING);
                        entries.add(EldritchRealmsBlocks.PHONTUM_SAPLING);
                        entries.add(EldritchRealmsBlocks.ELDEM_SAPLING);

                    }).build());

    public static void registerItemGroups() {
        EldritchRealms.LOGGER.info("Registering Item Groups for " + EldritchRealms.MOD_ID);
    }

}
