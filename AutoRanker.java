package com.ressamp.autoranker;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class AutoRanker extends JavaPlugin {

	public void onEnable(){
		getLogger().info("AutoRanker Enabled!");
	}

	
	public boolean onCommand (CommandSender sender, Command cmd, String label, String[] args){
        if (cmd.getName().equalsIgnoreCase("ar")){
                Player player = (Player) sender;
                if (player.isOp()){
                        if (args[0].equalsIgnoreCase("help")){
                        		sender.sendMessage(ChatColor.DARK_RED + "Help command worked!");
                        } else if (args[0].equalsIgnoreCase("info")){
                        		sender.sendMessage(ChatColor.DARK_RED + "Info command worked!");
                        } else if (args[0].equalsIgnoreCase("version")){
                        		sender.sendMessage(ChatColor.DARK_RED + "Version command worked!");
                        } else if (args[0].equalsIgnoreCase("dicks")){
                        		sender.sendMessage(ChatColor.DARK_RED + "Dick command worked! Andy likes dicks!");
                        } else if (args[0].equals("")){
                        sender.sendMessage(ChatColor.DARK_RED + "No additional arguments entered. Please try again.");
                        }
                }
        }
        return false;
	}
}
