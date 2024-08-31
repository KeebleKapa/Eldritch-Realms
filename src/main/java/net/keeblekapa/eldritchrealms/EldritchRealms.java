package net.keeblekapa.eldritchrealms;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.keeblekapa.eldritchrealms.item.EldritchRealmsItemGroups;
import net.keeblekapa.eldritchrealms.item.EldritchRealmsItems;
import net.keeblekapa.eldritchrealms.sound.EldritchRealmsSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EldritchRealms implements ModInitializer {
	public static final String MOD_ID = "eldritchrealms";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		EldritchRealmsSounds.registerSounds();

		EldritchRealmsBlocks.registerBlocks();
		EldritchRealmsItems.registerItems();

		EldritchRealmsItemGroups.registerItemGroups();

		StrippableBlockRegistry.register(EldritchRealmsBlocks.UMBRAM_OAK_LOG, EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_LOG);
		StrippableBlockRegistry.register(EldritchRealmsBlocks.UMBRAM_OAK_WOOD, EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(EldritchRealmsBlocks.UMBRAM_OAK_LOG, 2, 4);
		FlammableBlockRegistry.getDefaultInstance().add(EldritchRealmsBlocks.UMBRAM_OAK_WOOD, 2, 4);
		FlammableBlockRegistry.getDefaultInstance().add(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_LOG, 2, 4);
		FlammableBlockRegistry.getDefaultInstance().add(EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_WOOD, 2, 4);
		FlammableBlockRegistry.getDefaultInstance().add(EldritchRealmsBlocks.UMBRAM_OAK_PLANKS, 4, 8);
		FlammableBlockRegistry.getDefaultInstance().add(EldritchRealmsBlocks.UMBRAM_OAK_STAIRS, 4, 8);
		FlammableBlockRegistry.getDefaultInstance().add(EldritchRealmsBlocks.UMBRAM_OAK_SLAB, 4, 8);
		FlammableBlockRegistry.getDefaultInstance().add(EldritchRealmsBlocks.UMBRAM_OAK_FENCE, 4, 8);
		FlammableBlockRegistry.getDefaultInstance().add(EldritchRealmsBlocks.UMBRAM_OAK_FENCE_GATE, 4, 8);
		FlammableBlockRegistry.getDefaultInstance().add(EldritchRealmsBlocks.UMBRAM_OAK_PRESSURE_PLATE, 15, 8);
		FlammableBlockRegistry.getDefaultInstance().add(EldritchRealmsBlocks.UMBRAM_OAK_DOOR, 4, 8);
		FlammableBlockRegistry.getDefaultInstance().add(EldritchRealmsBlocks.UMBRAM_OAK_TRAPDOOR, 4, 8);
		FlammableBlockRegistry.getDefaultInstance().add(EldritchRealmsBlocks.UMBRAM_OAK_BUTTON, 20, 8);


	}
}