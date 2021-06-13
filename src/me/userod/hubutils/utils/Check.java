package me.userod.hubutils.utils;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;

import me.userod.hubutils.HubUtils;

public class Check {
	
	static FileConfiguration config = HubUtils.getPlugin(HubUtils.class).getConfig();
	
	public static World lobby() {
		return Bukkit.getWorld(config.getString("lobby-world"));
	}
	
	public static boolean DoubleJump() {
		if(config.getBoolean("double-jump") == false) {
			return false;
		} else return true;
	}
	
	public static boolean LaunchPad() {
		if(config.getBoolean("launch-pad") == false) {
			return false;
		} else return true;
	}
	
	public static boolean NoDamage() {
		if(config.getBoolean("no-PvP") == false) {
			return false;
		} else return true;
	}
	
	public static boolean HidePlayers() {
		if(config.getBoolean("hide-players") == false) {
			return false;
		} else return true;
	}

	public static boolean ProtectWorld() {
		if(config.getBoolean("protect-world") == false) {
			return false;
		} else return true;
	}
	
	public static boolean Damage() {
		if(config.getBoolean("disable-Environmental-Damage") == false) {
			return false;
		} else return true;
	}

	public static boolean foodLoss() {
		if(config.getBoolean("disable-food-loss") == false) {
			return false;
		} else return true;
	}
	
}
