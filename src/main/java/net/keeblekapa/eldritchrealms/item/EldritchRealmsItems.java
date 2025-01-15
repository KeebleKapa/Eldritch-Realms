package net.keeblekapa.eldritchrealms.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.minecraft.item.*;
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

    public static final Item NEBULA_LAPIS = registerItem("nebula_lapis", new Item(new FabricItemSettings()));

    // Shadowsteel
    public static final Item SHADOWSTEEL_INGOT = registerItem("shadowsteel_ingot", new Item(new FabricItemSettings()));
    public static final Item SHADOWSTEEL_NUGGET = registerItem("shadowsteel_nugget", new Item(new FabricItemSettings()));
    public static final Item SHADOWSTEEL_CLUMP = registerItem("shadowsteel_clump", new Item(new FabricItemSettings()));
    public static final Item SHADOWSTEEL_DUST = registerItem("shadowsteel_dust", new Item(new FabricItemSettings()));

    // Extrotium



    /**
     * ---------------------------
     *            Tools
     * -----------------------------
     **/

    // Shadowsteel
    public static final Item SHADOWSTEEL_SWORD = registerItem("shadowsteel_sword", new SwordItem(EldritchRealmsToolMaterials.SHADOWSTEEL, 3, -2.4f, new FabricItemSettings()));
    public static final Item SHADOWSTEEL_SHOVEL = registerItem("shadowsteel_shovel", new ShovelItem(EldritchRealmsToolMaterials.SHADOWSTEEL, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item SHADOWSTEEL_PICKAXE = registerItem("shadowsteel_pickaxe", new PickaxeItem(EldritchRealmsToolMaterials.SHADOWSTEEL, 1, -2.8f, new FabricItemSettings()));
    public static final Item SHADOWSTEEL_AXE = registerItem("shadowsteel_axe", new AxeItem(EldritchRealmsToolMaterials.SHADOWSTEEL, 5.0f, -3.0f, new FabricItemSettings()));
    public static final Item SHADOWSTEEL_HOE = registerItem("shadowsteel_hoe", new HoeItem(EldritchRealmsToolMaterials.SHADOWSTEEL, -4, 0.0f, new FabricItemSettings()));


    public static final Item REINFORCED_IRON_ROD = registerItem("reinforced_iron_rod", new Item(new FabricItemSettings()));





    /**
     * ---------------------------
     *            Armor
     * -----------------------------
     **/

    // Shadowsteel
    public static final Item SHADOWSTEEL_HELMET = registerItem("shadowsteel_helmet",
            new ArmorItem(EldritchRealmsArmorMaterials.SHADOWSTEEL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SHADOWSTEEL_CHESTPLATE = registerItem("shadowsteel_chestplate",
            new ArmorItem(EldritchRealmsArmorMaterials.SHADOWSTEEL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SHADOWSTEEL_LEGGINGS = registerItem("shadowsteel_leggings",
            new ArmorItem(EldritchRealmsArmorMaterials.SHADOWSTEEL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SHADOWSTEEL_BOOTS = registerItem("shadowsteel_boots",
            new ArmorItem(EldritchRealmsArmorMaterials.SHADOWSTEEL, ArmorItem.Type.BOOTS, new FabricItemSettings()));







    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EldritchRealms.MOD_ID, name), item);
    }

    public static void registerItems() {
        EldritchRealms.LOGGER.info("Registering items for " + EldritchRealms.MOD_ID);
    }

}
