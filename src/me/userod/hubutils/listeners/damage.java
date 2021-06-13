package me.userod.hubutils.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import me.userod.hubutils.utils.Check;

public class damage implements Listener {
	
	@EventHandler
	public void onDamage(EntityDamageEvent e) {
		if(		Check.Damage() == true && 
				e.getEntity().getWorld() == Check.lobby()) {
			e.setCancelled(true);
		}
	}

}
