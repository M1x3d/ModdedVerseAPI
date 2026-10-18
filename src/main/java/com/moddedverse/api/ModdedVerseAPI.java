package com.moddedverse.api;

import com.moddedverse.api.block.BlockAPI;
import com.moddedverse.api.item.ItemAPI;
import org.bukkit.plugin.java.JavaPlugin;

public final class ModdedVerseAPI extends JavaPlugin {

    private static ItemAPI itemAPI;
    private static BlockAPI blockAPI;

    public static ItemAPI items() {
        if (itemAPI == null) {
            throw new IllegalStateException(
                    "ModdedVerseItems is not loaded or has not registered its ItemAPI.");
        }

        return itemAPI;
    }

    public static BlockAPI blocks() {
        if (blockAPI == null) {
            throw new IllegalStateException(
                    "ModdedVerseItems is not loaded or has not registered its BlockAPI.");
        }

        return blockAPI;
    }

    /**
     * Called ONLY by ModdedVerseItems.
     */
    public static void registerItemAPI(ItemAPI api) {
        if (itemAPI != null) {
            throw new IllegalStateException("ItemAPI has already been registered.");
        }

        itemAPI = api;
    }
    /**
     * Called ONLY by ModdedVerseItems.
     */
    public static void registerBlockAPI(BlockAPI api) {
        if (blockAPI != null) {
            throw new IllegalStateException("BlockAPI has already been registered.");
        }

        blockAPI = api;
    }

    /**
     * Called when ModdedVerseItems disables.
     */
    public static void unregisterItemAPI() {
        blockAPI = null;
    }

    /**
     * Called when ModdedVerseItems disables.
     */
    public static void unregisterBlockAPI() {
        blockAPI = null;
    }
}