package net.keeblekapa.eldritchrealms;

import net.fabricmc.api.ModInitializer;

import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.keeblekapa.eldritchrealms.item.EldritchRealmsItemGroups;
import net.keeblekapa.eldritchrealms.item.EldritchRealmsItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EldritchRealms implements ModInitializer {
	public static final String MOD_ID = "eldritchrealms";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		EldritchRealmsBlocks.registerBlocks();
		EldritchRealmsItems.registerItems();
		EldritchRealmsItemGroups.registerItemGroups();
	}
}