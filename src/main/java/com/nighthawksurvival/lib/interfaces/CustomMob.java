package com.nighthawksurvival.lib.interfaces;

import org.bukkit.entity.Entity;

/**
 * NoneVale
 * 8/17/2015
 * NSLib
 */
public interface CustomMob extends Default {

    int getSpawnRate();

    String getName();

    Entity getMobType(Entity entity);

    double getMaxHealth();

    void setHealth();

    void setMob();

}