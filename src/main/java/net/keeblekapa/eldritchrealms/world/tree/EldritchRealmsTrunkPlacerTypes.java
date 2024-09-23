package net.keeblekapa.eldritchrealms.world.tree;

import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.keeblekapa.eldritchrealms.mixin.TrunkPlacerTypeInvoker;
import net.keeblekapa.eldritchrealms.world.tree.custom.UmbramOakTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class EldritchRealmsTrunkPlacerTypes {

    public static final TrunkPlacerType<?> PHONTUM_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("phontum_trunk_placer", UmbramOakTrunkPlacer.CODEC);
    public static final TrunkPlacerType<?> ELDEM_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("eldem_trunk_placer", UmbramOakTrunkPlacer.CODEC);
    public static final TrunkPlacerType<?> UMBRAM_OAK_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("umbram_oak_trunk_placer", UmbramOakTrunkPlacer.CODEC);

    public static void register() {
        EldritchRealms.LOGGER.info("Registering Trunk Placer Types for " + EldritchRealms.MOD_ID);
    }

}
