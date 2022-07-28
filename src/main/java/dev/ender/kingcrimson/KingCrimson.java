package dev.ender.kingcrimson;

import dev.ender.kingcrimson.event.TimeChange;
import dev.ender.kingcrimson.task.SetGameTime;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.GameRule;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import javax.swing.*;
import java.util.logging.Logger;

public final class KingCrimson extends JavaPlugin {

    public static Logger LOGGER = Bukkit.getLogger();

    @Override
    public void onEnable() {
        saveDefaultConfig();
        Bukkit.getLogger().info(ChatColor.RED + "King Crimson Loaded.");
        Bukkit.getWorlds().get(0).setGameRule(GameRule.RANDOM_TICK_SPEED,1);
        Bukkit.getPluginManager().registerEvents(new TimeChange(), this);

        if (this.getConfig().getInt("slow_down_rate") > 1) {
            new SetGameTime().runTaskTimer(this, 0, this.getConfig().getInt("slow_down_rate"));
        }
    }

    @Override
    public void onDisable() {
    }
}
