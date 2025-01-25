package net.keeblekapa.eldritchrealms.world.biome;

import net.minecraft.util.Identifier;
import terrablender.api.Region;
import terrablender.api.RegionType;

public class EldritchRealmsRegion extends Region {
    public EldritchRealmsRegion(Identifier name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }
}
