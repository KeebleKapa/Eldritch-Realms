package net.keeblekapa.eldritchrealms.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EldritchRealmsItems {

    /**
     * -----------------------------
     *            Food
     * -----------------------------
     **/
    public static final Item ALK_WHEAT_SEEDS = registerItem("alk_wheat_seeds", new AliasedBlockItem(EldritchRealmsBlocks.ALK_WHEAT, new FabricItemSettings()));
    public static final Item ALK_WHEAT = registerItem("alk_wheat", new Item(new FabricItemSettings()));



    /**
     * ---------------------------
     *           Materials
     * -----------------------------
     **/
    public static final Item DREADQUARTZ = registerItem("dreadquartz", new Item(new FabricItemSettings()));

    public static final Item GLOOMARBLE_DUST = registerItem("gloomarble_dust", new Item(new FabricItemSettings()));

    // Extrotium



    /**
     * ---------------------------
     *            Tools
     * -----------------------------
     **/





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EldritchRealms.MOD_ID, name), item);
    }

    public static void registerItems() {
        EldritchRealms.LOGGER.info("Registering items for " + EldritchRealms.MOD_ID);
    }

}
