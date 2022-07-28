package dev.ender.kingcrimson;

import dev.ender.kingcrimson.task.SetGameTime;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import javax.swing.*;

public final class KingCrimson extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("King Crimson Loaded.");
        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "gamerule randomTickSpeed 1");
        new SetGameTime().runTaskTimer(this, 0, 3);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
