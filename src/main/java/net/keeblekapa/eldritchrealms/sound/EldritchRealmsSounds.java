package net.keeblekapa.eldritchrealms.sound;

import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class EldritchRealmsSounds {
    public static final SoundEvent TUFF_BRICKS_PLACE = registerSoundEvent("tuff_bricks_place");
    public static final SoundEvent TUFF_BRICKS_STEP = registerSoundEvent("tuff_bricks_step");

    public static final BlockSoundGroup TUFF_BRICK_SOUNDS = new BlockSoundGroup(1f, 1f,
            SoundEvents.BLOCK_TUFF_BREAK, EldritchRealmsSounds.TUFF_BRICKS_STEP, EldritchRealmsSounds.TUFF_BRICKS_PLACE,
            SoundEvents.BLOCK_TUFF_HIT, SoundEvents.BLOCK_TUFF_FALL);


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(EldritchRealms.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        EldritchRealms.LOGGER.info("Registering Sounds for " + EldritchRealms.MOD_ID);
    }
}
