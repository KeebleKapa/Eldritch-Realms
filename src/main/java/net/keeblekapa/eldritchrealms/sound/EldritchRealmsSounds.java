package net.keeblekapa.eldritchrealms.sound;

import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class EldritchRealmsSounds {

    public static final SoundEvent SHADOWSLATE_BREAK = registerSoundEvent("shadowslate_break");
    public static final SoundEvent SHADOWSLATE_PLACE = registerSoundEvent("shadowslate_place");
    public static final SoundEvent SHADOWSLATE_STEP = registerSoundEvent("shadowslate_step");

    public static final BlockSoundGroup SHADOWSLATE_SOUNDS = new BlockSoundGroup(1f, 1f,
            EldritchRealmsSounds.SHADOWSLATE_BREAK, EldritchRealmsSounds.SHADOWSLATE_STEP, EldritchRealmsSounds.SHADOWSLATE_PLACE,
            SoundEvents.BLOCK_DEEPSLATE_HIT, SoundEvents.BLOCK_DEEPSLATE_FALL);


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(EldritchRealms.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        EldritchRealms.LOGGER.info("Registering Sounds for " + EldritchRealms.MOD_ID);
    }
}
