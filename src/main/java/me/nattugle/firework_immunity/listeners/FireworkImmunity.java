package me.nattugle.firework_immunity.listeners;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class FireworkImmunity implements Listener {
    
    @EventHandler
    public void onEntityDamage(EntityDamageByEntityEvent event) {
        if (event.getDamager().getType() == EntityType.FIREWORK) {
            event.setCancelled(true);
        }
    }
}