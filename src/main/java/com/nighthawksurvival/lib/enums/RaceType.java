package com.nighthawksurvival.lib.enums;

import net.md_5.bungee.api.ChatColor;

/**
 * Created by NoneVale on 8/26/2015.
 */
public enum RaceType {

    HUMAN,
    VAMPIRE,
    WEREWOLF,
    ELF,
    ANGEL,
    DEMON,
    DWARF,
    ORC;

    private RaceType raceType;

    public RaceType getRaceType() {
        return raceType;
    }

    public double getDefaultHealth() {
        double health;

        switch (getRaceType()) {
            case HUMAN:
                health = 28.00;
                break;
            case VAMPIRE:
                health = 22.00;
                break;
            case WEREWOLF:
                health = 22.00;
                break;
            case ELF:
                health = 25.00;
                break;
            case ANGEL:
                health = 24.00;
                break;
            case DEMON:
                health = 24.00;
                break;
            case ORC:
                health = 25.00;
                break;
            case DWARF:
                health = 26.00;
                break;
            default:
                health = 20.00;
        }
        return health;
    }

    public ChatColor getRaceColor() {
        ChatColor color;

        switch (getRaceType()) {
            case HUMAN:
                color = ChatColor.GRAY;
                break;
            case VAMPIRE:
                color = ChatColor.LIGHT_PURPLE;
                break;
            case WEREWOLF:
                color = ChatColor.DARK_PURPLE;
                break;
            case ELF:
                color = ChatColor.GREEN;
                break;
            case ANGEL:
                color = ChatColor.BLUE;
                break;
            case DEMON:
                color = ChatColor.RED;
                break;
            case ORC:
                color = ChatColor.DARK_GREEN;
                break;
            case DWARF:
                color = ChatColor.YELLOW;
                break;
            default:
                color = ChatColor.GRAY;
        }
        return color;
    }
}
