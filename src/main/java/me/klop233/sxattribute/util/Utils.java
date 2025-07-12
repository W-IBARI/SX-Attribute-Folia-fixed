package me.klop233.sxattribute.util;

import io.papermc.paper.threadedregions.scheduler.ScheduledTask;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import java.util.function.Consumer;

public class Utils {
    public static void hackRunDelayed(Plugin plugin, Consumer<ScheduledTask> task, long delay) {
        if (delay == 0) {
            Bukkit.getGlobalRegionScheduler().run(plugin, task);
        } else {
            Bukkit.getGlobalRegionScheduler().runDelayed(plugin, task, delay);
        }
    }
}
