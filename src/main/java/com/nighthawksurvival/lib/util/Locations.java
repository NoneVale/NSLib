package com.nighthawksurvival.lib.util;

import com.nighthawksurvival.lib.Lib;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;

/**
 * Created by NoneVale on 8/29/2015.
 */
public class Locations {

    public static double getCenterOfBlock(int block) {
        double d = block;
        d = d < 0 ? d - .5 : d + .5;
        return d;
    }

    public static Location getSpawn(World world) {
        if (hasSpawn(world)) {
            int x = getLocations().getInt("spawn." + world.getName() + ".x"),
                    y = getLocations().getInt("spawn." + world.getName() + ".y"),
                    z = getLocations().getInt("spawn." + world.getName() + ".z");
            float yaw = getLocations().getInt("spawn." + world.getName() + ".yaw"),
                    pitch = getLocations().getInt("spawn." + world.getName() + ".pitch");
            Location location = new Location(world, getCenterOfBlock(x), getCenterOfBlock(y), getCenterOfBlock(z), yaw, pitch);
            return location;
        }
        return world.getSpawnLocation();
    }

    public static void setSpawn(World world, Location location) {
        getLocations().set("spawn." + world.getName() + ".x", location.getBlockX());
        getLocations().set("spawn." + world.getName() + ".y", location.getBlockY());
        getLocations().set("spawn." + world.getName() + ".z", location.getBlockZ());
        getLocations().set("spawn." + world.getName() + ".yaw", location.getYaw());
        getLocations().set("spawn." + world.getName() + ".pitch", location.getPitch());
        saveLocations();
    }

    public static boolean hasSpawn(World world) {
        return getLocations().isSet("spawn." + world.getName());
    }

    public static void removeSpawn(World world){
        getLocations().set("spawn." + world.getName(), null);
        saveLocations();
    }

    private static FileConfiguration getLocations() {
        return Lib.getLocationsFile();
    }

    private static void saveLocations() {
        Lib.saveLocationsFile();
    }
}
