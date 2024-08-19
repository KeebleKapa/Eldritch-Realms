package net.keeblekapa.eldritchrealms;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.keeblekapa.eldritchrealms.datagen.*;

public class EldritchRealmsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(EldritchRealmsBlockTagProvider::new);
		pack.addProvider(EldritchRealmsItemTagProvider::new);
		pack.addProvider(EldritchRealmsLootTableProvider::new);
		pack.addProvider(EldritchRealmsModelProvider::new);
		pack.addProvider(EldritchRealmsRecipeProvider::new);

	}
}
