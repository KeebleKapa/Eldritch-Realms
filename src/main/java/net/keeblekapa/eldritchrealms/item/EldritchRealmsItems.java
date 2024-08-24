package net.keeblekapa.eldritchrealms.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EldritchRealmsItems {

    // Materials
    public static final Item DREADQUARTZ = registerItem("dreadquartz", new Item(new FabricItemSettings()));

    public static final Item GLOOMARBLE_DUST = registerItem("gloomarble_dust", new Item(new FabricItemSettings()));

    // Tools


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EldritchRealms.MOD_ID, name), item);
    }

    public static void registerItems() {
        EldritchRealms.LOGGER.info("Registering items for " + EldritchRealms.MOD_ID);
    }

}
