package com.nighthawksurvival.lib.libraries;

import com.google.common.collect.Lists;
import com.nighthawksurvival.lib.Lib;
import com.nighthawksurvival.lib.id.IDType;
import com.nighthawksurvival.lib.id.NSID;
import com.nighthawksurvival.lib.settings.GameSettings;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.util.ArrayList;

/**
 * NoneVale
 * 8/17/2015
 * NSLib
 */
public class Guild {

    private String name;
    private String color;
    private String desc;
    private String id;
    private int points;
    private int slots;
    private ArrayList<OfflinePlayer> offlineMembers = Lists.newArrayList();
    private ArrayList<Player> onlineMembers = Lists.newArrayList();
    private ArrayList<String> memberNames = Lists.newArrayList();
    private ArrayList<String> invited = Lists.newArrayList();
    private ArrayList<String> allies = Lists.newArrayList();
    private ArrayList<String> enemies = Lists.newArrayList();

    public Guild() {
    }

    public Guild(String id) {
        this.id = id;
        this.name = getGuildsConfig().getString(id + ".name");
        this.color = getGuildsConfig().getString(id + ".color");
        this.desc = getGuildsConfig().getString(id + ".desc");
        this.points = getGuildsConfig().getInt(id + ".points");
        this.slots = getGuildsConfig().getInt(id + ".slots");
        this.offlineMembers = (ArrayList<OfflinePlayer>) getGuildsConfig().getList(id + ".offline-members");
        this.onlineMembers = (ArrayList<Player>) getGuildsConfig().getList(id + ".online-members");
        this.memberNames = (ArrayList<String>) getGuildsConfig().getList(id + ".member-names");
        this.invited = (ArrayList<String>) getGuildsConfig().getList(id + ".invited-players");
        this.allies = (ArrayList<String>) getGuildsConfig().getList(id + ".allies");
        this.enemies = (ArrayList<String>) getGuildsConfig().getList(id + ".enemies");
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public String getColor() {
        return color;
    }

    public int getPoints() {
        return points;
    }

    public void create(String name) {
        NSID nsid = new NSID(IDType.GUILD);
        nsid.creation();
        this.id = nsid.getID();
        getIDFile().set("guilds." + name, nsid.getID());
        setName(name);
        setDesc("");
        setColor("DARK_GRAY");
        setPoints(3);
        setDefaultSlots();
        saveGuildsFile();
        saveIDFile();
    }

    public boolean exists(String name) {
        return getIDFile().isSet(name);
    }

    public Guild getGuild(String name) {
        this.id = getIDFile().getString("guilds." + name);
        return new Guild(id);
    }

    public void setName(String name) {
        getGuildsConfig().set(id + ".name", name);
        saveGuildsFile();
    }

    public void setDesc(String desc) {
        getGuildsConfig().set(id + ".desc", desc);
        saveGuildsFile();
    }

    public void setColor(String color) {
        getGuildsConfig().set(id + ".color", color.toUpperCase());
        saveGuildsFile();
    }

    public void setPoints(int points) {
        getGuildsConfig().set(id + ".points", points);
        saveGuildsFile();
    }

    public int getSlots() {
        return slots;
    }

    public void setDefaultSlots() {
        getGuildsConfig().set(id + ".slots", GameSettings.defaultGuildPlayerAmount);
        saveGuildsFile();
    }

    public void setSlots(int slots) {
        getGuildsConfig().set(id + ".slots", GameSettings.defaultGuildPlayerAmount + slots);
        saveGuildsFile();
    }

    public boolean hasEnoughSlots() {
        return getMemberNames().size() < getSlots();
    }

    //MEMBERS
    public ArrayList<OfflinePlayer> getOfflineMembers() {
        return offlineMembers;
    }

    public ArrayList<Player> getOnlineMembers() {
        return onlineMembers;
    }

    public ArrayList<String> getMemberNames() {
        return memberNames;
    }

    public ArrayList<String> getInvited() {
        return invited;
    }

    public void addOfflineMember(OfflinePlayer player) {
        offlineMembers.add(player);
        getGuildsConfig().set(id + ".offline-members", offlineMembers.toArray());
        saveGuildsFile();
    }

    public void removeOfflineMember(OfflinePlayer player) {
        offlineMembers.remove(player);
        getGuildsConfig().set(id + ".offline-members", offlineMembers.toArray());
        saveGuildsFile();
    }

    public void removeAllOfflineMembers() {
        offlineMembers.clear();
        getGuildsConfig().set(id + ".offline-members", offlineMembers.toArray());
        saveGuildsFile();
    }

    public void addOnlineMember(Player player) {
        onlineMembers.add(player);
        getGuildsConfig().set(id + ".online-members", onlineMembers.toArray());
        saveGuildsFile();
    }

    public void removeOnlineMember(Player player) {
        onlineMembers.remove(player);
        getGuildsConfig().set(id + ".online-members", onlineMembers.toArray());
        saveGuildsFile();
    }

    public void removeAllOnlineMembers() {
        onlineMembers.clear();
        getGuildsConfig().set(id + ".online-members", onlineMembers.toArray());
        saveGuildsFile();
    }

    public void addMemberName(String name) {
        memberNames.add(name);
        getGuildsConfig().set(id + ".member-names", memberNames.toArray());
        saveGuildsFile();
    }

    public void removeMemberName(String name) {
        memberNames.remove(name);
        getGuildsConfig().set(id + ".member-names", memberNames.toArray());
        saveGuildsFile();
    }

    public void removeAllMemberNames() {
        memberNames.clear();
        getGuildsConfig().set(id + ".member-names", memberNames.toArray());
        saveGuildsFile();
    }

    public void addInvited(String player) {
        invited.add(player);
        getGuildsConfig().set(id + ".invited-players", invited.toArray());
        saveGuildsFile();
    }

    public void removeInvited(String player) {
        invited.remove(player);
        getGuildsConfig().set(id + ".invited-players", invited.toArray());
        saveGuildsFile();
    }

    public void removeAllInvited(String player) {
        invited.clear();
        getGuildsConfig().set(id + ".invited-players", invited.toArray());
        saveGuildsFile();
    }

    //RELATIONS
    public ArrayList<String> getAllies() {
        return allies;
    }

    public ArrayList<String> getEnemies() {
        return enemies;
    }

    public void addAlly(String name) {
        allies.add(name);
        getGuildsConfig().set(id + ".allies", allies.toArray());
        saveGuildsFile();
    }

    public void removeAlly(String name) {
        allies.remove(name);
        getGuildsConfig().set(id + ".allies", allies.toArray());
        saveGuildsFile();
    }

    public void clearAllies() {
        allies.clear();
        getGuildsConfig().set(id + ".allies", allies.toArray());
        saveGuildsFile();
    }

    public void addEnemy(String name) {
        enemies.add(name);
        getGuildsConfig().set(id + ".allies", enemies.toArray());
        saveGuildsFile();
    }

    public void removeEnemy(String name) {
        enemies.remove(name);
        getGuildsConfig().set(id + ".allies", enemies.toArray());
        saveGuildsFile();
    }

    public void clearEnemies() {
        enemies.clear();
        getGuildsConfig().set(id + ".allies", enemies.toArray());
        saveGuildsFile();
    }

    public boolean isEnemy(String name) {
        return enemies.contains(name);
    }

    public boolean isAlly(String name) {
        return allies.contains(name);
    }

    //CONFIG
    private FileConfiguration getGuildsConfig() {
        return Lib.getGuildConfig();
    }

    private void saveGuildsFile() {
        Lib.saveGuildConfig();
    }

    private FileConfiguration getConfig() {
        return Lib.getConfigg();
    }

    private FileConfiguration getIDFile() {
        return Lib.getIDFile();
    }

    private void saveIDFile() {
        Lib.saveIDFile();
    }
}
