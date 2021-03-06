package com.nighthawksurvival.lib;

import com.nighthawksurvival.lib.libraries.Guild;
import com.nighthawksurvival.lib.player.NSPlayer;
import com.nighthawksurvival.lib.plugins.Plugins;
import com.nighthawksurvival.lib.settings.GameSettings;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.UUID;

/**
 * NoneVale
 * 8/10/2015
 * NSLib
 */
public class Lib extends JavaPlugin {

    private static Plugin PLUGIN;
    private static File p;
    private static FileConfiguration pc;
    private static File c;
    private static FileConfiguration cc;
    private static File i;
    private static FileConfiguration ic;
    private static File g;
    private static FileConfiguration gc;
    private static File l;
    private static FileConfiguration lc;

    public void onEnable() {
        Plugins thisss = Plugins.LIB;
        if (thisss.isBeta()) {
            Bukkit.getLogger().info("[NSLib]This Plugin is still in BETA!");
        }
        PLUGIN = this;
        setConfig();
        setGuildConfig();
        setPlayersConfig();
        setIDFile();
        setLocationsFile();
        GameSettings.loadSettings();
    }

    public static Plugin getPlugin() {
        return PLUGIN;
    }

    public static void setPlayersConfig() {
        try {
            File folder = new File("plugins/NighthawkSurvival");
            folder.mkdirs();
            p = new File(folder.getPath() + "/players.yml");
            if (!p.exists()) {
                p.createNewFile();
            }

            pc = YamlConfiguration.loadConfiguration(p);
        }
        catch (Exception e) {}
    }

    public static void savePlayersConfig() {
        try {
            pc.save(p);
        }
        catch (Exception e) {}
    }

    public static FileConfiguration getPlayersConfig() {
        return pc;
    }

    public static void setConfig() {
        try {
            File folder = new File("plugins/NighthawkSurvival");
            folder.mkdirs();
            c = new File(folder.getPath() + "/config.yml");
            if (!c.exists()) {
                c.createNewFile();
            }

            cc = YamlConfiguration.loadConfiguration(c);
        }
        catch (Exception e) {}
    }

    public static void saveConfigg() {
        try {
            cc.save(c);
        }
        catch (Exception e) {}
    }

    public static FileConfiguration getConfigg() {
        return cc;
    }

    public static void setIDFile() {
        try {
            File folder = new File("plugins/NighthawkSurvival");
            folder.mkdirs();
            i = new File(folder.getPath() + "/ids.yml");
            if (!i.exists()) {
                i.createNewFile();
            }

            ic = YamlConfiguration.loadConfiguration(i);
        }
        catch (Exception e) {}
    }

    public static void saveIDFile() {
        try {
            ic.save(i);
        }
        catch (Exception e) {}
    }

    public static FileConfiguration getIDFile() {
        return ic;
    }

    public static void setGuildConfig() {
        try {
            File folder = new File("plugins/NighthawkSurvival");
            folder.mkdirs();
            g = new File(folder.getPath() + "/guilds.yml");
            if (!g.exists()) {
                g.createNewFile();
            }

            gc = YamlConfiguration.loadConfiguration(g);
        }
        catch (Exception e) {}
    }

    public static void saveGuildConfig() {
        try {
            gc.save(g);
        }
        catch (Exception e) {}
    }

    public static FileConfiguration getGuildConfig() {
        return gc;
    }

    public static NSPlayer getNSPlayer(Player player) {
        return new NSPlayer(player);
    }

    public static NSPlayer getNSPlayer(String name) {
        return new NSPlayer(name);
    }

    public static NSPlayer getNSPLayer(UUID uuid) {
        return new NSPlayer(uuid);
    }

    public static Guild getGuild(NSPlayer player) {
        if (player.hasGuild()) {
            return new Guild(player.getGuild());
        }
        return null;
    }

    public static void setLocationsFile() {
        try {
            File folder = new File("plugins/NighthawkSurvival");
            folder.mkdirs();
            l = new File(folder.getPath() + "/guilds.yml");
            if (!l.exists()) {
                l.createNewFile();
            }

            lc = YamlConfiguration.loadConfiguration(l);
        }
        catch (Exception e) {}
    }

    public static void saveLocationsFile() {
        try {
            lc.save(l);
        }
        catch (Exception e) {}
    }

    public static FileConfiguration getLocationsFile() {
        return lc;
    }

}
