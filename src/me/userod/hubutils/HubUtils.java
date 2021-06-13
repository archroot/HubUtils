package me.userod.hubutils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.userod.hubutils.commands.main;
import me.userod.hubutils.listeners.damage;
import me.userod.hubutils.listeners.doublejump;
import me.userod.hubutils.listeners.hideplayers;
import me.userod.hubutils.listeners.launchpad;
import me.userod.hubutils.listeners.nodamage;
import me.userod.hubutils.listeners.worldprotection;


public class HubUtils extends JavaPlugin{
	
	Plugin instance = this;
	FileConfiguration config = instance.getConfig();
	Logger logger = instance.getLogger();
	PluginManager PluginManager = Bukkit.getPluginManager();
	List<Listener> Listeners = new ArrayList<Listener>();
	HashMap<String, CommandExecutor> Commands = new HashMap<String, CommandExecutor>();
	
	public void onEnable() {
		for(Player online : Bukkit.getOnlinePlayers()) {
			online.setAllowFlight(true);
		}
		log("Plugin is Loading...");
		for(Listener Listener : Listeners()) {
			PluginManager.registerEvents(Listener, instance);
		}
		for(String CommandName : Commands().keySet()) {
			getCommand(CommandName).setExecutor(Commands().get(CommandName));
		}
		if(instance.isEnabled()) {
			log("Plugin Has Been Loaded Successfully!");
		}else log("Plugin Has Been Disabled Due To Some Issues Acquired It While Loading!");
		createConfig();
	}
	
	public void log(String Message) {
		logger.info(Message);
	}
	
	public List<Listener> Listeners() {
		
		addListener(new doublejump());
		addListener(new hideplayers());
		addListener(new launchpad());
		addListener(new nodamage());
		addListener(new worldprotection());
		addListener(new damage());

		return Listeners;
	}
	
	public void addListener(Listener listenerClass) {
		Listeners.add(listenerClass);
	}
	
	public HashMap<String, CommandExecutor> Commands() {
		
		registerCommand("HubUtils", new main());
		
		return Commands;
	}
	
	public void registerCommand(String commandName, CommandExecutor Executor) {
		if(!Commands.containsKey(commandName)) {
			Commands.put(commandName, Executor);
		}
	}
	private void createConfig() {
        try {
            if (!getDataFolder().exists()) {
                getDataFolder().mkdirs();
            }
            File file = new File(getDataFolder(), "config.yml");
            if (!file.exists()) {
                saveDefaultConfig();
    		}
        } catch (Exception e) {
            log("PROBLEM:");
            e.printStackTrace();

        }

    }


}
