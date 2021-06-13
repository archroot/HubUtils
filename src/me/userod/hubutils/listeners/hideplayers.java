package me.userod.hubutils.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.userod.hubutils.utils.Check;

public class hideplayers implements Listener {
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		if(Check.HidePlayers() == true && e.getPlayer().getWorld() == Check.lobby()) {
			for(Player playersToHide : e.getPlayer().getWorld().getPlayers()) {
				e.getPlayer().hidePlayer(playersToHide);
			}
		}
	}
}
