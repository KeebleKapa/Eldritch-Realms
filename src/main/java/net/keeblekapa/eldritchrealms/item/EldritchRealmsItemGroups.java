package net.keeblekapa.eldritchrealms.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.keeblekapa.eldritchrealms.EldritchRealms;
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


                        // Blocks



                    }).build());

    public static void registerItemGroups() {
        EldritchRealms.LOGGER.info("Registering Item Groups for " + EldritchRealms.MOD_ID);
    }

}
