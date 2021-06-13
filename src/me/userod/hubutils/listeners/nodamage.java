package me.userod.hubutils.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import me.userod.hubutils.utils.Check;

public class nodamage implements Listener {
	
	@EventHandler
	public void onDamage(EntityDamageByEntityEvent e) {
		if(Check.NoDamage() == true && e.getEntity().getWorld() == Check.lobby()) {
			e.setCancelled(true);
		}
	}
}
