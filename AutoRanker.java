package com.ressamp.autoranker;
import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class AutoRanker extends JavaPlugin {
	public void onEnable(){
		getLogger().info(Color.RED + "AutoRanker Enabled!");
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		String cmd = command.getName();
		if (cmd.equalsIgnoreCase("ar")) {
			if (args.length !=1) return false;
			// this wont work for commands longer than 1 argument
			if (args[0].equalsIgnoreCase("about")) {
				sender.sendMessage("AutoRanker plugin created by Macmo920 and ressamp");
				return true;
			}
			if (args[0].equalsIgnoreCase("version")) {
				sender.sendMessage("Version 0.1 beta");
				return true;
			}
		}
	
	return false;
	}
}
