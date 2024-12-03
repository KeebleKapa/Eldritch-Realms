package net.keeblekapa.eldritchrealms.world.biome.surface;

import net.keeblekapa.eldritchrealms.block.EldritchRealmsBlocks;
import net.minecraft.block.Block;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class EldritchRealmsMaterialRules {

    private static final MaterialRules.MaterialRule STONE = makeStateRule(EldritchRealmsBlocks.VEILSTONE);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(EldritchRealmsBlocks.MYTHRAL_GRASS_BLOCK);
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(EldritchRealmsBlocks.MARRED_SOIL);



    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
