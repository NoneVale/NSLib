package com.nighthawksurvival.lib.util;

import com.google.common.collect.Lists;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;


/**
 * NoneVale
 * 8/22/2015
 * NSLib
 */
public class Item {

    private static ArrayList<Material> swords = Lists.newArrayList(Material.DIAMOND_SWORD, Material.WOOD_SWORD, Material.STONE_SWORD, Material.GOLD_SWORD, Material.IRON_SWORD);
    private static ArrayList<Material> axes = Lists.newArrayList(Material.WOOD_AXE, Material.STONE_AXE, Material.DIAMOND_AXE, Material.IRON_AXE, Material.GOLD_AXE);
    private static ArrayList<Material> hoes = Lists.newArrayList(Material.WOOD_HOE, Material.STONE_HOE, Material.IRON_HOE, Material.GOLD_HOE, Material.DIAMOND_HOE);
    private static ArrayList<Material> shovels = Lists.newArrayList(Material.STONE_SPADE, Material.IRON_SPADE, Material.GOLD_SPADE, Material.DIAMOND_SPADE, Material.WOOD_SPADE);
    private static ArrayList<Material> pickaxe = Lists.newArrayList(Material.STONE_PICKAXE, Material.WOOD_PICKAXE, Material.IRON_PICKAXE, Material.GOLD_PICKAXE, Material.DIAMOND_PICKAXE);
    private static ArrayList<Material> food = Lists.newArrayList(Material.APPLE, Material.MUSHROOM_SOUP, Material.BREAD, Material.PORK, Material.GRILLED_PORK, Material.GOLDEN_APPLE, Material.RAW_FISH, Material.COOKED_FISH, Material.CAKE, Material.COOKIE, Material.MELON, Material.COOKED_BEEF, Material.RAW_BEEF, Material.COOKED_CHICKEN, Material.RAW_CHICKEN, Material.ROTTEN_FLESH, Material.SPIDER_EYE, Material.CARROT_ITEM, Material.POTATO_ITEM, Material.BAKED_POTATO, Material.POISONOUS_POTATO, Material.PUMPKIN_PIE, Material.COOKED_RABBIT, Material.RABBIT, Material.RABBIT_STEW, Material.MUTTON, Material.COOKED_MUTTON);
    private static ArrayList<Material> soup = Lists.newArrayList(Material.MUSHROOM_SOUP, Material.RABBIT_STEW);
    private static ArrayList<Material> fruit = Lists.newArrayList(Material.APPLE, Material.GOLDEN_APPLE, Material.MELON);
    private static ArrayList<Material> vegetable = Lists.newArrayList(Material.CARROT_ITEM, Material.POTATO_ITEM, Material.BAKED_POTATO, Material.POISONOUS_POTATO);
    private static ArrayList<Material> uncookedmeat = Lists.newArrayList(Material.PORK, Material.RAW_BEEF, Material.RAW_CHICKEN, Material.RAW_FISH, Material.MUTTON, Material.RABBIT);
    private static ArrayList<Material> cookedmeat = Lists.newArrayList(Material.GRILLED_PORK, Material.COOKED_BEEF, Material.COOKED_FISH, Material.COOKED_CHICKEN, Material.COOKED_RABBIT, Material.COOKED_MUTTON);
    private static ArrayList<Material> diamondarmor = Lists.newArrayList(Material.DIAMOND_HELMET, Material.DIAMOND_CHESTPLATE, Material.DIAMOND_LEGGINGS, Material.DIAMOND_BOOTS);
    private static ArrayList<Material> goldarmor = Lists.newArrayList(Material.GOLD_HELMET, Material.GOLD_CHESTPLATE, Material.GOLD_LEGGINGS, Material.GOLD_BOOTS);
    private static ArrayList<Material> chainarmor = Lists.newArrayList(Material.CHAINMAIL_HELMET, Material.CHAINMAIL_CHESTPLATE, Material.CHAINMAIL_LEGGINGS, Material.CHAINMAIL_BOOTS);
    private static ArrayList<Material> ironarmor = Lists.newArrayList(Material.IRON_HELMET, Material.IRON_CHESTPLATE, Material.IRON_LEGGINGS, Material.IRON_BOOTS);
    private static ArrayList<Material> leatherarmor = Lists.newArrayList(Material.LEATHER_HELMET, Material.LEATHER_CHESTPLATE, Material.LEATHER_LEGGINGS, Material.LEATHER_BOOTS);
    private static ArrayList<Material> diamondtool = Lists.newArrayList(Material.DIAMOND_SWORD, Material.DIAMOND_AXE, Material.DIAMOND_HOE, Material.DIAMOND_SPADE, Material.DIAMOND_PICKAXE);
    private static ArrayList<Material> goldtool = Lists.newArrayList(Material.GOLD_SWORD, Material.GOLD_AXE, Material.GOLD_HOE, Material.GOLD_SPADE, Material.GOLD_PICKAXE);
    private static ArrayList<Material> irontool = Lists.newArrayList(Material.IRON_SWORD, Material.IRON_AXE, Material.IRON_HOE, Material.IRON_SPADE, Material.IRON_PICKAXE);
    private static ArrayList<Material> stonetool = Lists.newArrayList(Material.STONE_SWORD, Material.STONE_AXE, Material.STONE_HOE, Material.STONE_PICKAXE, Material.STONE_SPADE);
    private static ArrayList<Material> woodtool = Lists.newArrayList(Material.WOOD_SWORD, Material.WOOD_AXE, Material.WOOD_HOE, Material.WOOD_SPADE, Material.WOOD_PICKAXE);
    private static ArrayList<Material> tool = Lists.newArrayList(Material.WOOD_SWORD, Material.WOOD_AXE, Material.WOOD_HOE, Material.WOOD_SPADE, Material.WOOD_PICKAXE, Material.STONE_SWORD, Material.STONE_AXE, Material.STONE_HOE, Material.STONE_PICKAXE, Material.STONE_SPADE, Material.IRON_SWORD, Material.IRON_AXE, Material.IRON_HOE, Material.IRON_SPADE, Material.IRON_PICKAXE, Material.GOLD_SWORD, Material.GOLD_AXE, Material.GOLD_HOE, Material.GOLD_SPADE, Material.GOLD_PICKAXE, Material.DIAMOND_SWORD, Material.DIAMOND_AXE, Material.DIAMOND_HOE, Material.DIAMOND_SPADE, Material.DIAMOND_PICKAXE);

    public static boolean isTool(Material material) {
        return tool.contains(material);
    }

    public static boolean isSword(Material material) {
        return swords.contains(material);
    }

    public static boolean isAxe(Material material) {
        return axes.contains(material);
    }

    public static boolean isHoe(Material material) {
        return hoes.contains(material);
    }

    public static boolean isShovel(Material material) {
        return shovels.contains(material);
    }

    public static boolean isPickaxe(Material material) {
        return pickaxe.contains(material);
    }

    public static boolean isFood(Material material) {
        return food.contains(material);
    }

    public static boolean isSoup(Material material) {
        return soup.contains(material);
    }

    public static boolean isFruit(Material material) {
        return fruit.contains(material);
    }

    public static boolean isVegetable(Material material) {
        return vegetable.contains(material);
    }

    public static boolean isUnCookedMeat(Material material) {
        return uncookedmeat.contains(material);
    }

    public static boolean isCookedMeat(Material material) {
        return cookedmeat.contains(material);
    }

    public static boolean isDiamondArmor(Material material) {
        return diamondarmor.contains(material);
    }

    public static boolean isGoldArmor(Material material) {
        return goldarmor.contains(material);
    }

    public static boolean isIronArmor(Material material) {
        return ironarmor.contains(material);
    }

    public static boolean isChainArmor(Material material) {
        return chainarmor.contains(material);
    }

    public static boolean isLeatherArmor(Material material) {
        return leatherarmor.contains(material);
    }

    public static boolean isDiamondTool(Material material) {
        return diamondtool.contains(material);
    }

    public static boolean isIronTool(Material material) {
        return irontool.contains(material);
    }

    public static boolean isGoldTool(Material material) {
        return goldtool.contains(material);
    }

    public static boolean isStoneTool(Material material) {
        return stonetool.contains(material);
    }

    public static boolean isWoodTool(Material material) {
        return woodtool.contains(material);
    }

    public static ItemStack shop(ItemStack itemStack) {
        String type = itemStack.getType().name();
        int amount = itemStack.getAmount();
        return itemStack;
    }

    public static ItemStack createColored(Colorable colorable, Color color, String name, ArrayList<String> lure, int amount) {
        ItemStack itemStack = new ItemStack(colorable.getMaterial(), amount, (short) 0, (byte) color.getCode());
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lure);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public enum Colorable {
        STAINED_GLASS(Material.STAINED_GLASS),
        STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE),
        STAINED_CLAY(Material.STAINED_CLAY),
        WOOL(Material.WOOL),
        CARPET(Material.CARPET),
        BANNER(Material.BANNER);

        private Material material;

        Colorable(Material material) {
            this.material = material;
        }

        public Material getMaterial() {
            return material;
        }
    }

    public enum Color {
        WHITE(0),
        ORANGE(1),
        MAGENTA(2),
        LIGHT_BLUE(3),
        YELLOW(4),
        LIME(5),
        PINK(6),
        GRAY(7),
        LIGHT_GRAY(8),
        CYAN(9),
        PURPLE(10),
        BLUE(11),
        BROWN(12),
        GREEN(13),
        RED(14),
        BLACK(15);

        private int code;

        Color(int code){
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }
}
