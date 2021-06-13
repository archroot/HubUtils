package me.userod.hubutils.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import me.userod.hubutils.utils.Check;

public class worldprotection implements Listener {
	@EventHandler
	public void onPlace(BlockPlaceEvent e) {
		if(		!e.getPlayer().isOp() &&
				Check.ProtectWorld() == true &&
				e.getPlayer().getWorld() == Check.lobby()) {
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		if(		!e.getPlayer().isOp() &&
				Check.ProtectWorld() == true &&
				e.getPlayer().getWorld() == Check.lobby()) {
			e.setCancelled(true);
		}
	}
}
