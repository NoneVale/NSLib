package com.nighthawksurvival.lib.interfaces;

import com.nighthawksurvival.lib.enums.RaceType;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;

/**
 * NoneVale
 * 8/22/2015
 * NSLib
 */
public interface Race extends Default{

    RaceType getRaceType();

    double getDefaultHealth();

    String getRaceName();

    double getRaceSpecificHealth();

    default TextComponent getTag() {
        TextComponent tag = new TextComponent("[");
        tag.setColor(ChatColor.DARK_GRAY);
        TextComponent name = new TextComponent(getRaceName());
        name.setColor(getRaceColor());
        tag.addExtra(name);
        tag.addExtra("]");
        tag.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText(getRaceColor() + getRaceName())));
        tag.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/races info " + getRaceName()));
        return tag;
    }

    default ChatColor getRaceColor() {
        return getRaceType().getRaceColor();
    }

    default String getStringTag() {
        return TextComponent.toLegacyText(getTag());
    }

    default void setHealth(Player player) {
        player.setHealthScaled(true);
        player.setHealthScale(getDefaultHealth() + getRaceSpecificHealth());
        player.setMaxHealth(getDefaultHealth() + getRaceSpecificHealth());

        if (player.getMaxHealth() > getDefaultHealth() + getRaceSpecificHealth()) {
            player.setMaxHealth(getDefaultHealth() + getRaceSpecificHealth());
        }
        else {
            player.setHealth(player.getMaxHealth());
        }
    }

    void passiveBoost(Player player);
}
