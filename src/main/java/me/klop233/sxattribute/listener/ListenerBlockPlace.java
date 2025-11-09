package me.klop233.sxattribute.listener;

import github.saukiya.sxattribute.SXAttribute;
import io.papermc.paper.datacomponent.DataComponentHolder;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.meta.ItemMeta;

public class ListenerBlockPlace implements Listener {
    @EventHandler
    void onBlockPlaceEvent(BlockPlaceEvent event) {
        ItemMeta meta = event.getItemInHand().getItemMeta();
        if (meta.getAsString().contains("SX-Item:{HashCode:")) {
            event.setCancelled(true);
        }
    }
}
