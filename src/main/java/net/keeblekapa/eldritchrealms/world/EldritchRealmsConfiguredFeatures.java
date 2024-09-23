package net.keeblekapa.eldritchrealms.world;

import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.keeblekapa.eldritchrealms.world.tree.custom.UmbramOakTrunkPlacer;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class EldritchRealmsConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> DREADQUARTZ_ORE_KEY = registryKey("dreadquartz_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PHONTUM_KEY = registryKey("phontum");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ELDEM_KEY = registryKey("eldem");
    public static final RegistryKey<ConfiguredFeature<?, ?>> UMBRAM_OAK_KEY = registryKey("umbram_oak");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceable = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplaceable = new BlockMatchRuleTest(Blocks.END_STONE);
        RuleTest veilstoneReplaceable = new BlockMatchRuleTest(EldritchRealmsBlocks.VEILSTONE);
        RuleTest shadowslateReplaceable = new BlockMatchRuleTest(EldritchRealmsBlocks.SHADOWSLATE);

        List<OreFeatureConfig.Target> eldritchRealmDreadquartzOres =
                List.of(OreFeatureConfig.createTarget(veilstoneReplaceable, EldritchRealmsBlocks.DREADQUARTZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(shadowslateReplaceable, EldritchRealmsBlocks.SHADOWSLATE_DREADQUARTZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplaceable, EldritchRealmsBlocks.DREADQUARTZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceable, EldritchRealmsBlocks.SHADOWSLATE_DREADQUARTZ_ORE.getDefaultState()));

        // Dreadquartz Ore Feature //
        register(context, DREADQUARTZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(eldritchRealmDreadquartzOres, 12));


        // Phontum Tree Feature //
        register(context, PHONTUM_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(EldritchRealmsBlocks.PHONTUM_LOG),
                        new UmbramOakTrunkPlacer(3, 2, 4),

                        BlockStateProvider.of(EldritchRealmsBlocks.PHONTUM_LEAVES),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 4),
                        new TwoLayersFeatureSize(2, 3, 2)).build());


        // Eldem Tree Feature //
        register(context, ELDEM_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(EldritchRealmsBlocks.ELDEM_LOG),
                        new UmbramOakTrunkPlacer(3, 2, 4),

                        BlockStateProvider.of(EldritchRealmsBlocks.ELDEM_LEAVES),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 4),
                        new TwoLayersFeatureSize(2, 3, 2)).build());


        // Umbram Oak Tree Feature //
        register(context, UMBRAM_OAK_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(EldritchRealmsBlocks.UMBRAM_OAK_LOG),
                        new UmbramOakTrunkPlacer(1, 2, 3),

                        BlockStateProvider.of(EldritchRealmsBlocks.UMBRAM_OAK_LEAVES),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 3),
                        new TwoLayersFeatureSize(4, 3, 2)).build());


    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(EldritchRealms.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
