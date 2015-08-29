package com.nighthawksurvival.lib.settings;

import com.nighthawksurvival.lib.Lib;
import org.bukkit.configuration.file.FileConfiguration;

/**
 * NoneVale
 * 8/20/2015
 * NSLib
 */
public class GameSettings {

    public static String defaultChatColor;
    public static String staffChatColor;
    public static int defaultClaimRadius;
    public static String defaultGuildColor;
    public static int defaultGuildPlayerAmount;

    public static void loadSettings() {
        if (!isSetUp()) {
            setUp();
        }
        defaultChatColor = getConfig().getString("defaultChatColor");
        staffChatColor = getConfig().getString("staffChatColor");
        defaultGuildColor = getConfig().getString("guilds.default-color");
        defaultClaimRadius = getConfig().getInt("guilds.default-claimradius");
        defaultGuildPlayerAmount = getConfig().getInt("guilds.default-maxplayer");
    }

    private static FileConfiguration getConfig() {
        return Lib.getConfigg();
    }

    private static void saveConfig() {
        Lib.saveConfigg();
    }

    private static void setUp() {
        getConfig().set("set-up", true);
        getConfig().set("defaultChatColor", "WHITE");
        getConfig().set("staffChatColor", "YELLOW");
        getConfig().set("guilds.default-color", "DARK_GRAY");
        getConfig().set("guilds.default-claimradius", 3);
        getConfig().set("guilds.default-maxplayer", 10);
        saveConfig();
    }

    private static boolean isSetUp() {
        return getConfig().isSet("set-up");
    }
}
