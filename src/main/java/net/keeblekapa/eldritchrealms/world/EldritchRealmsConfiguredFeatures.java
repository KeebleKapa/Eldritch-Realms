package net.keeblekapa.eldritchrealms.world;

import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.keeblekapa.eldritchrealms.util.EldritchRealmsTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.trunk.*;

import java.util.List;
import java.util.OptionalInt;

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



    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(EldritchRealms.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
