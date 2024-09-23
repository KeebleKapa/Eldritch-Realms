package net.keeblekapa.eldritchrealms.world.tree;

import net.keeblekapa.eldritchrealms.world.EldritchRealmsConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class EldemSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return EldritchRealmsConfiguredFeatures.ELDEM_KEY;
    }
}
