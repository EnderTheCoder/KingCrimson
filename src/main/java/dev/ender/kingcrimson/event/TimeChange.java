package dev.ender.kingcrimson.event;

import dev.ender.kingcrimson.task.SetGameTime;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class TimeChange implements Listener {
    @EventHandler
    public static void onTimeCommand(PlayerCommandPreprocessEvent event) {
        if (event.getMessage().contains("/time set")) {
            String timeKey = event.getMessage().replace("/time set ", "");
            for (int i = 0; i < timeKey.length(); i++) {
                if (!Character.isDigit(timeKey.charAt(i))) {
                    event.getPlayer().sendMessage(ChatColor.RED + "[KingCrimson]你输入的时间值不是一个数字，这种用法在使用了该插件后失效");
                    return;
                }
            }
            SetGameTime.currentTime = Long.parseLong(timeKey);
        }
    }
}
