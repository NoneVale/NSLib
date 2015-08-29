package com.nighthawksurvival.lib.util;

import com.nighthawksurvival.lib.plugins.Plugins;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * NoneVale
 * 8/16/2015
 * NSLib
 */
public class MSG {

    private String name = "";

    private String inBrackets(String bracketed) {
        return ChatColor.DARK_GRAY + "[" + bracketed + ChatColor.DARK_GRAY + "]";
    }

    public MSG() {}

    public MSG(Plugins plugin) {
        switch (plugin) {
            case ECONOMY:
                    name = inBrackets(ChatColor.YELLOW + "" + ChatColor.BOLD + "ECONOMY");
                break;
            case ESSENTIALS:
                    name = inBrackets(ChatColor.GREEN + "" + ChatColor.BOLD + "ESSENTIALS");
                break;
            case GUILDS:
                    name = inBrackets(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "GUILDS");
                break;
            case SKILLS:
                    name = inBrackets(ChatColor.RED + "" + ChatColor.BOLD + "SKILLS");
                break;
            case CHAT:
                    name = inBrackets(ChatColor.BLUE + "" + ChatColor.BOLD + "CHAT");
                break;
            case REGIONS:
                    name = inBrackets(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "REGIONS");
                break;
            case PORTALS:
                    name = inBrackets(ChatColor.GOLD + "" + ChatColor.BOLD + "PORTALS");
                break;
            case BOSSES:
                    name = inBrackets(ChatColor.DARK_RED + "" + ChatColor.BOLD + "BOSSES");
                break;
            case CUSTOMMOBS:
                    name = inBrackets(ChatColor.AQUA + "" + ChatColor.BOLD + "CUSTOM-MOBS");
                break;
            case RACES:
                name = inBrackets(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "RACES");
                break;
        }
    }

    public String ns() {
        return inBrackets(ChatColor.DARK_BLUE + "" + ChatColor.BOLD + "N" + ChatColor.DARK_RED + ChatColor.BOLD + "S");
    }

    public String getMessage(String message) {
        return ns() + name + message;
    }

    public String getPlugin() {
        return name;
    }

    public String getHeader() {
        String e1 = "-=-", e2 = "=-=", e3 = "|", e4 = "=";
        String p1 = e1 + e3 + e2 + e3 + e1 + e3 + e2 + e3 + e4;
        String p2 = e4 + e3 + e2 + e3 + e1 + e3 + e2 + e3 + e1;
        return ChatColor.GRAY + p1 + getPlugin() + ChatColor.GRAY + p2;
    }

    public String getHeader(String headed) {
        String e1 = "-=-", e2 = "=-=", e3 = "|", e4 = "=";
        String p1 = e1 + e3 + e2 + e3 + e1 + e3 + e2 + e3 + e4;
        String p2 = e4 + e3 + e2 + e3 + e1 + e3 + e2 + e3 + e1;
        return ChatColor.GRAY + p1 + headed + ChatColor.GRAY + p2;
    }

    public String syntaxError() {
        return ns() + ChatColor.RED + "There was an error in syntax!";
    }

    public String noPerms() {
        return ns() + ChatColor.RED + "You do not have enough permissions to execute this!";
    }

    public String playerNotFound() {
        return ns() + ChatColor.RED + "A player by that name was not found!";
    }

    public String warmUp() {
        return ns() + getPlugin() + ChatColor.YELLOW + "Please wait " + ChatColor.GREEN + "6 seconds " + ChatColor.YELLOW + "for this to warm up.";
    }

    public void broadCast(String message) {
        for (Player players : Bukkit.getOnlinePlayers()) {
            players.sendMessage(ns() + getPlugin() + message);
        }
    }
}
