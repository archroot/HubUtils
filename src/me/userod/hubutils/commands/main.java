package me.userod.hubutils.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class main implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		arg0.sendMessage(ChatColor.GREEN + "HubUtils Plugin Made By: UseRod");
		arg0.sendMessage(ChatColor.GREEN + "Hope You Enjoy My Creations!");
		return false;
	}
	

}
