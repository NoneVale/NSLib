package com.nighthawksurvival.lib.player;

import com.nighthawksurvival.lib.Lib;
import com.nighthawksurvival.lib.id.IDType;
import com.nighthawksurvival.lib.id.NSID;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.lang.String;import java.util.UUID;

/**
 * Created by NoneVale on 8/27/2015.
 */
public class NSPlayer {

    private String name;
    private OfflinePlayer offlinePlayer;
    private UUID uuid;
    private String id;
    private boolean beta;
    private boolean staff;
    private boolean trusted;
    private boolean head;
    private int balance;
    private int tokens;
    private boolean banned;
    private String displayName;
    private String banReason;
    private String guild;

    private void buildNSPlayer(String name) {
        this.offlinePlayer = Bukkit.getOfflinePlayer(name);
        this.name = offlinePlayer.getName();
        this.uuid = offlinePlayer.getUniqueId();
        this.id = getIDFile().getString(getUUIDasString());
        this.beta = getPlayers().getBoolean(getID() + ".beta");
        this.staff = getPlayers().getBoolean(getID() + ".staff");
        this.trusted = getPlayers().getBoolean(getID() + ".trusted");
        this.head = getPlayers().getBoolean(getID() + ".head");
        this.banned = getPlayers().getBoolean(getID() + ".ban.banned");
        this.balance = getPlayers().getInt(getID() + ".balance");
        this.tokens = getPlayers().getInt(getID() + ".tokens");
        this.displayName = getPlayers().getString(getID() + ".displayName");
        this.banReason = getPlayers().getString(getID() + ".ban.reason");
        this.guild = getPlayers().getString(getID() + ".guilds.guild");
    }

    private void buildNSPlayer(UUID uuid) {
        this.offlinePlayer = Bukkit.getOfflinePlayer(name);
        this.name = offlinePlayer.getName();
        this.uuid = offlinePlayer.getUniqueId();
        this.id = getIDFile().getString(getUUIDasString());
        this.beta = getPlayers().getBoolean(getID() + ".beta");
        this.staff = getPlayers().getBoolean(getID() + ".staff");
        this.trusted = getPlayers().getBoolean(getID() + ".trusted");
        this.head = getPlayers().getBoolean(getID() + ".head");
        this.banned = getPlayers().getBoolean(getID() + ".ban.banned");
        this.balance = getPlayers().getInt(getID() + ".balance");
        this.tokens = getPlayers().getInt(getID() + ".tokens");
        this.displayName = getPlayers().getString(getID() + ".displayName");
        this.banReason = getPlayers().getString(getID() + ".ban.reason");
        this.guild = getPlayers().getString(getID() + ".guilds.guild");
    }

    private void buildNSPlayer(Player player) {
        this.offlinePlayer = Bukkit.getOfflinePlayer(player.getUniqueId());
        this.name = offlinePlayer.getName();
        this.uuid = offlinePlayer.getUniqueId();
        this.id = getIDFile().getString(getUUIDasString());
        this.beta = getPlayers().getBoolean(getID() + ".beta");
        this.staff = getPlayers().getBoolean(getID() + ".staff");
        this.trusted = getPlayers().getBoolean(getID() + ".trusted");
        this.head = getPlayers().getBoolean(getID() + ".head");
        this.banned = getPlayers().getBoolean(getID() + ".ban.banned");
        this.balance = getPlayers().getInt(getID() + ".balance");
        this.tokens = getPlayers().getInt(getID() + ".tokens");
        this.displayName = getPlayers().getString(getID() + ".displayName");
        this.banReason = getPlayers().getString(getID() + ".ban.reason");
        this.guild = getPlayers().getString(getID() + ".guilds.guild");
    }

    public NSPlayer(Player player) {
        buildNSPlayer(player);
    }

    public NSPlayer(UUID uuid) {
        buildNSPlayer(uuid);
    }

    public NSPlayer(String name) {
        buildNSPlayer(name);
    }


    //GETTERS
    public String getName() {
        return name;
    }

    public OfflinePlayer getOfflinePlayer() {
        return offlinePlayer;
    }

    public UUID getUUID() {
        return uuid;
    }

    public String getUUIDasString() {
        return getUUID().toString();
    }

    public String getID() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public int getTokens() {
        return tokens;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean isBeta() {
        return beta;
    }

    public boolean isStaff() {
        return staff;
    }

    public boolean isTrusted(){
        return trusted;
    }

    public boolean isHead() {
        return head;
    }

    public boolean isBanned() {
        return banned;
    }

    public boolean hasDisplayName() {
        return getPlayers().isSet(getID() + ".displayName");
    }

    public boolean existsInDatabase() {
        return getIDFile().isSet(getUUIDasString());
    }

    public String getBanReason() {
        return banReason;
    }

    public boolean hasGuild() {
        return getPlayers().isSet(getID() + ".guilds.guild");
    }


    //METHODS
    public void assignID() {
        NSID nsid = new NSID(IDType.PLAYER);
        nsid.creation();
        this.id = nsid.getID();
        getIDFile().set(getUUIDasString(), this.id);
        setName();
        setTokens(20);
        setBalance(100);
        saveIDFile();
        savePlayers();
    }

    public void setName() {
        getPlayers().set(getID() + ".name", offlinePlayer.getName());
        savePlayers();
    }

    public void setBeta(boolean beta) {
        getPlayers().set(getID() + ".beta", beta);
        savePlayers();
    }

    public void setStaff(boolean staff) {
        getPlayers().set(getID() + ".staff", staff);
        savePlayers();
    }

    public void setTrusted(boolean trusted) {
        getPlayers().set(getID() + ".trusted", trusted);
        savePlayers();
    }

    public void setHead(boolean head) {
        getPlayers().set(getID() + ".head", head);
        savePlayers();
    }

    public void setBanned(boolean banned, String reason, String bannedby) {
        getPlayers().set(getID() + ".ban.banned", banned);
        getPlayers().set(getID() + ".ban.reason", reason);
        getPlayers().set(getID() + ".ban.by", bannedby);
        savePlayers();
    }

    public void setTokens(int tokens) {
        getPlayers().set(getID() + ".tokens", tokens);
        savePlayers();
    }

    public void setBalance(int balance) {
        getPlayers().set(getID() + ".balance", balance);
        savePlayers();
    }

    public void setDisplayName(String displayName) {
        getPlayers().set(getID() + ".displayName", displayName);
        savePlayers();
    }

    public String getGuild() {
        return guild;
    }

    //CONFIGS
    private FileConfiguration getPlayers() {
        return Lib.getPlayersConfig();
    }

    private FileConfiguration getIDFile() {
        return Lib.getIDFile();
    }

    private void saveIDFile() {
        Lib.saveIDFile();
    }

    private void savePlayers() {
        Lib.savePlayersConfig();
    }
}
