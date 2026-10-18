package com.moddedverse.api.mob;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public interface MobAPI {

    Entity spawn(CustomMob customMob, Location location);

    boolean isCustomMob(Entity entity);

    CustomMob getCustomMob(Entity entity);

    ItemStack getSpawnEgg(CustomMob customMob);

    Collection<CustomMob> getRegisteredMobs();
}
