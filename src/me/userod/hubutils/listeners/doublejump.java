package me.userod.hubutils.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.util.Vector;

import me.userod.hubutils.utils.Check;
import me.userod.hubutils.utils.playCons;

public class doublejump implements Listener {
	
	@EventHandler
	public void onFly(PlayerToggleFlightEvent e) {
		if(		!e.getPlayer().isOp() && 
				Check.DoubleJump() == true && 
				e.getPlayer().getWorld() == Check.lobby()) {
			e.setCancelled(true);
			e.getPlayer().setVelocity(new Vector(e.getPlayer().getLocation().getDirection().getX(), 2, e.getPlayer().getLocation().getDirection().getZ()));
			new playCons(e.getPlayer());
		}
	}

}
