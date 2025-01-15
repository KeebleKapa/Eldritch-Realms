package net.keeblekapa.eldritchrealms.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.keeblekapa.eldritchrealms.world.EldritchRealmsPlacedFeatures;
import net.minecraft.world.gen.GenerationStep;

public class EldritchRealmsOreGeneration {

    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, EldritchRealmsPlacedFeatures.DREADQUARTZ_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, EldritchRealmsPlacedFeatures.SHADOWSTEEL_ORE_PLACED_KEY);
    }
}
