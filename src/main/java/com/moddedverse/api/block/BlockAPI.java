package com.moddedverse.api.block;

import org.bukkit.Location;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.type.NoteBlock;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public interface BlockAPI {

    ItemStack create(CustomBlock customBlock);

    ItemStack create(CustomBlock customBlock, int amount);

    void place(CustomBlock customBlock, Location location, boolean sound);
    void place(CustomBlock customBlock, Location location, BlockFace placedFromFace, boolean sound);

    boolean isCustomBlock(ItemStack itemStack);
    boolean isCustomBlock(NoteBlock noteBlock);

    CustomBlock getCustomBlock(ItemStack itemStack);
    CustomBlock getCustomBlock(NoteBlock noteBlock);

    boolean checkIfMatch(ItemStack itemStack, CustomBlock customBlock);
    boolean checkIfMatch(NoteBlock noteBlock, CustomBlock customBlock);

    ItemStack getItemDrop(ItemStack tool, CustomBlock customBlock);

    void playPlaceSound(CustomBlock block, Location location);
    void playMiningSound(CustomBlock block, Location location);
    void playBreakSound(CustomBlock block, Location location);

    Collection<CustomBlock> getRegisteredBlocks();
}