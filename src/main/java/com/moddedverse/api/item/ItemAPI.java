package com.moddedverse.api.item;

import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public interface ItemAPI {

    ItemStack create(CustomItem item);

    ItemStack create(CustomItem item, int amount);

    boolean isCustomItem(ItemStack item);

    CustomItem getCustomItem(ItemStack item);

    Collection<CustomItem> getRegisteredItems();
}