package net.keeblekapa.eldritchrealms;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.keeblekapa.eldritchrealms.datagen.*;
import net.keeblekapa.eldritchrealms.world.EldritchRealmsConfiguredFeatures;
import net.keeblekapa.eldritchrealms.world.EldritchRealmsPlacedFeatures;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class EldritchRealmsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(EldritchRealmsBlockTagProvider::new);
		pack.addProvider(EldritchRealmsItemTagProvider::new);
		pack.addProvider(EldritchRealmsLootTableProvider::new);
		pack.addProvider(EldritchRealmsModelProvider::new);
		pack.addProvider(EldritchRealmsRecipeProvider::new);
		pack.addProvider(EldritchRealmsWorldGenerator::new);

	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, EldritchRealmsConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, EldritchRealmsPlacedFeatures::bootstrap);
	}
}
