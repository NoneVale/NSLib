package com.nighthawksurvival.lib.plugins;

import com.nighthawksurvival.lib.Lib;
import org.bukkit.configuration.file.FileConfiguration;

/**
 * NoneVale
 * 8/17/2015
 * NSLib
 */
public enum Plugins {

    LIB("Library", true),
    RACES("Races", true),
    GUILDS("Guilds", true),
    PORTALS("Portals", true),
    REGIONS("Regions", true),
    SKILLS("Skills", true),
    CUSTOMMOBS("Custom-Mobs", true),
    BOSSES("Bosses", true),
    ESSENTIALS("Essentials", true),
    ECONOMY("Economy", true),
    CHAT("Chat", true);

    private Plugins plugin;
    private String name;
    private boolean beta;
    private boolean released;

    Plugins(String name, boolean beta) {
        this.name = name;
        this.beta = beta;
    }

    public Plugins getPlugin() {
        return plugin;
    }

    public String getName() {
        return name;
    }

    public boolean isLoadable() {
        return getConfig().getBoolean("can-be-enabled." + plugin.getName().toLowerCase());
    }

    public boolean isBeta() {
        return beta;
    }

    public boolean allBeta() {
        for (Plugins plugins : values()) {
            return plugins.isBeta();
        }
        return false;
    }

    private FileConfiguration getConfig() {
        return Lib.getConfigg();
    }

    public String getFinalName() {
        return "NS" + getName();
    }
}
