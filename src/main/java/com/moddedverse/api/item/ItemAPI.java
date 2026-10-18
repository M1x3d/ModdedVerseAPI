package com.moddedverse.api.item;

import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public interface ItemAPI {

    ItemStack create(CustomItem customItem);

    ItemStack create(CustomItem customItem, int amount);

    boolean isCustomItem(ItemStack itemStack);

    CustomItem getCustomItem(ItemStack itemStack);

    boolean checkIfMatch(ItemStack itemStack, CustomItem customItem);

    Collection<CustomItem> getRegisteredItems();
}