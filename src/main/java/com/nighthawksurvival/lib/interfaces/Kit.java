package com.nighthawksurvival.lib.interfaces;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by NoneVale on 8/28/2015.
 */
public interface Kit extends Default {


    String getName();

    Material getDisplayItem();

    ItemStack[] getItems();

    String permission();

}
