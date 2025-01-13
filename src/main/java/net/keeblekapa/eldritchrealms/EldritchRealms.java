package net.keeblekapa.eldritchrealms;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.keeblekapa.eldritchrealms.block.entity.EldritchrealmsBlockEntities;
import net.keeblekapa.eldritchrealms.item.EldritchRealmsItemGroups;
import net.keeblekapa.eldritchrealms.item.EldritchRealmsItems;
import net.keeblekapa.eldritchrealms.sound.EldritchRealmsSounds;
import net.keeblekapa.eldritchrealms.world.gen.EldritchRealmsWorldGeneration;
import net.keeblekapa.eldritchrealms.world.tree.EldritchRealmsTrunkPlacerTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EldritchRealms implements ModInitializer {
	public static final String MOD_ID = "eldritchrealms";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		EldritchRealmsSounds.registerSounds();

		EldritchRealmsBlocks.registerBlocks();
		EldritchrealmsBlockEntities.registerBlockEntities();
		EldritchRealmsItems.registerItems();

		EldritchRealmsItemGroups.registerItemGroups();

		StrippableBlockRegistry.register(EldritchRealmsBlocks.UMBRAM_OAK_LOG, EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_LOG);
		StrippableBlockRegistry.register(EldritchRealmsBlocks.UMBRAM_OAK_WOOD, EldritchRealmsBlocks.STRIPPED_UMBRAM_OAK_WOOD);

		StrippableBlockRegistry.register(EldritchRealmsBlocks.PHONTUM_LOG, EldritchRealmsBlocks.STRIPPED_PHONTUM_LOG);
		StrippableBlockRegistry.register(EldritchRealmsBlocks.PHONTUM_WOOD, EldritchRealmsBlocks.STRIPPED_PHONTUM_WOOD);

		StrippableBlockRegistry.register(EldritchRealmsBlocks.ELDEM_LOG, EldritchRealmsBlocks.STRIPPED_ELDEM_LOG);
		StrippableBlockRegistry.register(EldritchRealmsBlocks.ELDEM_WOOD, EldritchRealmsBlocks.STRIPPED_ELDEM_WOOD);

		EldritchRealmsWorldGeneration.generateEldritchRealmsWorldGen();
		EldritchRealmsTrunkPlacerTypes.register();
	}
}