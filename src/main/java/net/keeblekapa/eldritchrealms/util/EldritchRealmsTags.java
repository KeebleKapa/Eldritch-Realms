package net.keeblekapa.eldritchrealms.util;

import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class EldritchRealmsTags {

    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(EldritchRealms.MOD_ID, name));
        }
    }

    public static class Items {



        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(EldritchRealms.MOD_ID, name));
        }
    }

}
