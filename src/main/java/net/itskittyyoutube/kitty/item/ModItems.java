package net.itskittyyoutube.kitty.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.itskittyyoutube.kitty.KittysMod;
import net.itskittyyoutube.kitty.sound.ModSounds;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;


import java.util.function.Function;

public class ModItems {
    public static final Item MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP = registerItem("music_disc_bye_justin_hi_justin",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.THE_BYE_JUSTIN_HI_JUSTIN_RAP_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_THE_TALE_OF_TOOTHLESS = registerItem("music_disc_the_tale_of_toothless",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.THE_TALE_OF_TOOTHLESS_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_STEVE_LAVA_CHICKEN = registerItem("music_disc_steve_lava_chicken",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.STEVE_LAVA_CHICKEN_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_LAVA_TEARSSTEP = registerItem("music_disc_lava_tearsstep",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.LAVA_TEARSSTEP_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_TERRIFYING_TEARS = registerItem("music_disc_terrifying_tears",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.TERRIFYING_TEARS_KEY).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(KittysMod.MOD_ID, name), item);
    }

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(KittysMod.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(KittysMod.MOD_ID, name)))));
    }
    public static void registerModItems() {
        KittysMod.LOGGER.info("Registering Mod Items for " + KittysMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP);
            entries.add(MUSIC_DISC_THE_TALE_OF_TOOTHLESS);
            entries.add(MUSIC_DISC_STEVE_LAVA_CHICKEN);
            entries.add(MUSIC_DISC_LAVA_TEARSSTEP);
        });
    }
}