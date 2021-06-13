package me.userod.hubutils.listeners;


import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

import me.userod.hubutils.utils.playCons;

public class launchpad implements Listener {
	
	@EventHandler
	public void onWalkOnBlock(PlayerMoveEvent e) {
		if(e.getPlayer().getLocation().getBlock().getType() == Material.GOLD_PLATE) {
			e.getPlayer().setVelocity(new Vector(e.getPlayer().getLocation().getDirection().getX(), 2, e.getPlayer().getLocation().getDirection().getZ()));
			new playCons(e.getPlayer());
		}
	}

}
