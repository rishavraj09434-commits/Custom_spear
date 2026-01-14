package me.rishav.customspear;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.entity.Player;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;

public class SpearListener implements Listener {

    @EventHandler
    public void onPlayerHit(EntityDamageByEntityEvent event) {
        if (!(event.getDamager() instanceof Player)) return;
        Player player = (Player) event.getDamager();
        ItemStack item = player.getInventory().getItemInMainHand();

        if (item == null) return;

        switch (item.getType()) {
            case DIAMOND_HOE: // example for Blast Spear
                event.getEntity().getWorld().createExplosion(event.getEntity().getLocation(), 2f);
                break;
            case IRON_HOE: // example for Lightning Spear
                event.getEntity().getWorld().strikeLightning(event.getEntity().getLocation());
                break;
            // Add more spear cases here
            default:
                break;
        }
    }
}
