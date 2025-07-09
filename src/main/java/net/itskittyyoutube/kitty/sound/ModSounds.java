package net.itskittyyoutube.kitty.sound;

import net.itskittyyoutube.kitty.KittysMod;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent THE_BYE_JUSTIN_HI_JUSTIN_RAP = registerSoundEvent("bye_justin_hi_justin");
    public static final RegistryKey<JukeboxSong> THE_BYE_JUSTIN_HI_JUSTIN_RAP_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(KittysMod.MOD_ID, "bye_justin_hi_justin"));
    public static final SoundEvent THE_TALE_OF_TOOTHLESS = registerSoundEvent("the_tale_of_toothless");
    public static final RegistryKey<JukeboxSong> THE_TALE_OF_TOOTHLESS_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(KittysMod.MOD_ID, "the_tale_of_toothless"));
    public static final SoundEvent STEVE_LAVA_CHICKEN = registerSoundEvent("steve_lava_chicken");
    public static final RegistryKey<JukeboxSong> STEVE_LAVA_CHICKEN_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(KittysMod.MOD_ID, "steve_lava_chicken"));
    public static final SoundEvent LAVA_TEARSSTEP = registerSoundEvent("lava_tearsstep");
    public static final RegistryKey<JukeboxSong> LAVA_TEARSSTEP_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(KittysMod.MOD_ID, "lava_tearsstep"));
    public static final SoundEvent TERRIFYING_TEARS = registerSoundEvent("terrifying_tears");
    public static final RegistryKey<JukeboxSong> TERRIFYING_TEARS_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(KittysMod.MOD_ID, "terrifying_tears"));


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(KittysMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        KittysMod.LOGGER.info("Registering Mod Sounds for " + KittysMod.MOD_ID);
    }
}
