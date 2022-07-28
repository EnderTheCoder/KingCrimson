package dev.ender.kingcrimson.task;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class SetGameTime extends BukkitRunnable {

    public static Long currentTime;

    public SetGameTime() {
        currentTime = Bukkit.getWorlds().get(0).getFullTime();
    }
    @Override
    public void run() {
        Bukkit.getWorlds().get(0).setFullTime(++currentTime);
    }
}
