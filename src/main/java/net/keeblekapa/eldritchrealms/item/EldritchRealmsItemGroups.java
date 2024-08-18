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
                        // Items
                        entries.add(EldritchRealmsItems.DREADQUARTZ);
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


                        // Blocks



                    }).build());

    public static void registerItemGroups() {
        EldritchRealms.LOGGER.info("Registering Item Groups for " + EldritchRealms.MOD_ID);
    }

}
