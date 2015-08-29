package com.nighthawksurvival.lib.interfaces;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

/**
 * Created by NoneVale on 8/28/2015.
 */
public interface Inventories extends Default {

    String getName();

    int getSlots();

    void addItem(ItemStack stack, int slot);

    Inventory getInventory();

    InventoryHolder getHolder();

    void create();
}
