package net.keeblekapa.eldritchrealms.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class EldritchRealmsRegion extends Region {
    public EldritchRealmsRegion(Identifier name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }
}
