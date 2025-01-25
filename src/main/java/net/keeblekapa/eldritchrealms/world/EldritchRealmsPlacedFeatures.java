package net.keeblekapa.eldritchrealms.world;

import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class EldritchRealmsPlacedFeatures {

    public static final RegistryKey<PlacedFeature> DREADQUARTZ_ORE_PLACED_KEY = registryKey("dreadquartz_ore_placed");
    public static final RegistryKey<PlacedFeature> SHADOWSTEEL_ORE_PLACED_KEY = registryKey("shadowsteel_ore_placed");
    public static final RegistryKey<PlacedFeature> NEBULATIC_LAPIS_ORE_PLACED_KEY = registryKey("nebulatic_lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> ECLIPSIUM_ORE_PLACED_KEY = registryKey("eclipsium_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);


        register(context, DREADQUARTZ_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(EldritchRealmsConfiguredFeatures.DREADQUARTZ_ORE_KEY),
                EldritchRealmsOrePlacement.modifiersWithCount(48,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-48), YOffset.fixed(128))));

        register(context, SHADOWSTEEL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(EldritchRealmsConfiguredFeatures.SHADOWSTEEL_ORE_KEY),
                EldritchRealmsOrePlacement.modifiersWithCount(7,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(128))));

        register(context, NEBULATIC_LAPIS_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(EldritchRealmsConfiguredFeatures.NEBULATIC_LAPIS_ORE_KEY),
                EldritchRealmsOrePlacement.modifiersWithCount(32,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-56), YOffset.fixed(128))));

        register(context, ECLIPSIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(EldritchRealmsConfiguredFeatures.ECLIPSIUM_ORE_KEY),
                EldritchRealmsOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-56), YOffset.fixed(128))));
    }

    public static RegistryKey<PlacedFeature> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(EldritchRealms.MOD_ID, name));
    }

    public static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
