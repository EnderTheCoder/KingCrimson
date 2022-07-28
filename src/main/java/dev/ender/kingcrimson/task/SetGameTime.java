package dev.ender.kingcrimson.task;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class SetGameTime extends BukkitRunnable {

    private Long startTime;

    public SetGameTime() {
        this.startTime = Bukkit.getWorlds().get(0).getFullTime();
    }
    @Override
    public void run() {

        Bukkit.getWorlds().get(0).setFullTime(++this.startTime);
    }
}
