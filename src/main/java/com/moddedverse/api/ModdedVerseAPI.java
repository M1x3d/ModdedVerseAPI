package com.moddedverse.api;

import com.moddedverse.api.item.ItemAPI;
import org.bukkit.plugin.java.JavaPlugin;

public final class ModdedVerseAPI extends JavaPlugin {

    private static ItemAPI itemAPI;

    public static ItemAPI items() {
        if (itemAPI == null) {
            throw new IllegalStateException(
                    "ModdedVerseItems is not loaded or has not registered its API.");
        }

        return itemAPI;
    }

    /**
     * Called ONLY by ModdedVerseItems.
     */
    public static void register(ItemAPI api) {
        if (itemAPI != null) {
            throw new IllegalStateException("ItemAPI has already been registered.");
        }

        itemAPI = api;
    }

    /**
     * Called when ModdedVerseItems disables.
     */
    public static void unregister() {
        itemAPI = null;
    }
}