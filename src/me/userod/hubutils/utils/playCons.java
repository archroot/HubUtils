package me.userod.hubutils.utils;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class playCons {
	
	public playCons(Player player) {
		Location loc = player.getLocation();
		player.getWorld().playSound(loc, Sound.FIREWORK_LAUNCH, 1, (float) 0.1);
		player.getWorld().playEffect(loc, Effect.VILLAGER_THUNDERCLOUD, 1);
	}

}
