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
                	
                	
                	if (args.length == 0 || args == null) {
               				sender.sendMessage(ChatColor.YELLOW + "No arguments entered.");
                				
               		} else if (args[0].equalsIgnoreCase("help")){
        	          		sender.sendMessage(ChatColor.YELLOW + "Help command worked!");
                        		
                        } else if (args[0].equalsIgnoreCase("info")){
                        		sender.sendMessage(ChatColor.YELLOW + "Info command worked!");
                        		
                        } else if (args[0].equalsIgnoreCase("version")){
                        		sender.sendMessage(ChatColor.YELLOW + "Version command worked!");
                        		
                        } else if (args[0].equalsIgnoreCase("dicks")){
                        		sender.sendMessage(ChatColor.YELLOW + "Dick command worked! Andy likes dicks!");
                        		
                        } else {
                        		sender.sendMessage(ChatColor.YELLOW + "Syntax error.");
                        		
                        }
                }
        }
        return false;
	}
}
