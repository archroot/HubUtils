package me.userod.hubutils.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import me.userod.hubutils.utils.Check;

public class nofoodloss implements Listener {
	
	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		if(Check.foodLoss() == true &&
				e.getPlayer().getWorld() == Check.lobby()) {
			e.getPlayer().setFoodLevel(20);
		}
	}

}
