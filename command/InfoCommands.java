package com.ressamp.autoranker.command;

import org.bukkit.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class InfoCommands {
	
	public static void Info(Player player, String[] args) {
		
		CommandSender sender = player;
		
		// need to build a check to see if player exists, but we haven't even started to figure out how to parse players into organized YML files yet
		
		if (args[0].equalsIgnoreCase("info") && args.length == 1) {
			
			sender.sendMessage(ChatColor.YELLOW + "Plugin Information Here");
			
		} else if (args[1].equalsIgnoreCase("someplayer")) {
			
			sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "About " + ChatColor.GOLD + "someplayer" + ChatColor.GOLD + " - ");
			
		} else {
			
			sender.sendMessage(ChatColor.RED + "Player Not Found.");
		}
	}
	
	public static void Help(Player player) {
		CommandSender sender =  player;
		sender .sendMessage(ChatColor.YELLOW + "Help command worked through second class!");
	}
	
	public static void Ranks(Player player, String[] args) {
		
		CommandSender sender =  player;
		
		// need to build parser for rank files and parser to find out how many pages there are, so this is just to check functionality of the if / else tree
		// ranks for reference
		// Novice
		// Apprentice
		// Builder
		// Designer
		// Architect
		// Master
		
		if (args[0].equalsIgnoreCase("ranks") && args.length == 1) {
			
			sender.sendMessage(ChatColor.RED + "No arguments entered");
			
		} else if (args[1].equalsIgnoreCase("novice")) {
			
			// event tree for novice III - I
			
			if (args.length == 2) {
				
				sender.sendMessage(ChatColor.RED + "No subrank entered.");
				
			} else if (args[2].equalsIgnoreCase("III")) {
				
				if (args.length == 3) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Novice III " + ChatColor.GOLD + "(1/?)" + ChatColor.GOLD + " - ");
					
					SampleList(player); // again, just a sample list
					
				} else if (args.length == 4) {
					
					// need to implement search to see if page exists but here's how it would be done assuming the player would never enter a page that doesen't exist
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Novice III " + ChatColor.GOLD + "(" + args[3] + "/?)" + ChatColor.GOLD + " - "); // args[3] is basically the page number

					String page = args[3]; // the page number is the 3rd argument entered (ie, in this case, maybe /ar ranks novice III 2. where the page number is 2
					
					// code that basically says "pull this page and print it"
					
					SampleList(player); // grabs the sample list (just for visual effect when testing)
					
				} else {
					
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
					
				}
				
			} else if (args[2].equalsIgnoreCase("II")) {
				
				if (args.length == 3) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Novice II " + ChatColor.GOLD + "(1/?)" + ChatColor.GOLD + " - ");
					
					SampleList(player);
					
				} else if (args.length == 4) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Novice II " + ChatColor.GOLD + "(" + args[3] + "/?)" + ChatColor.GOLD + " - ");

					String page = args[3];
					
					SampleList(player);
					
				} else {
					
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
					
				}
				
			} else if (args[2].equalsIgnoreCase("I")) {
				
				if (args.length == 3) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Novice I " + ChatColor.GOLD + "(1/?)" + ChatColor.GOLD + " - ");
					
					SampleList(player);
					
				} else if (args.length == 4) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Novice I " + ChatColor.GOLD + "(" + args[3] + "/?)" + ChatColor.GOLD + " - ");

					String page = args[3];
					
					SampleList(player);
					
				} else {
					
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
					
				}
				
			} else {
				
				sender.sendMessage(ChatColor.RED + "Subrank not found.");
				
			}

		} else if (args[1].equalsIgnoreCase("apprentice")) {
			
			// event tree for apprentice III - I
			// this is repeat code of the above so I removed comments to clean up clutter
			
			if (args.length == 2) {
				
				sender.sendMessage(ChatColor.RED + "No subrank entered.");
				
			} else if (args[2].equalsIgnoreCase("III")) {
				
				if (args.length == 3) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Apprentice III " + ChatColor.GOLD + "(1/?)" + ChatColor.GOLD + " - ");
					
					SampleList(player);
					
				} else if (args.length == 4) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Apprentice III " + ChatColor.GOLD + "(" + args[3] + "/?)" + ChatColor.GOLD + " - ");

					String page = args[3];
					
					SampleList(player);
					
				} else {
					
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
					
				}
				
			} else if (args[2].equalsIgnoreCase("II")) {
				
				if (args.length == 3) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Apprentice II " + ChatColor.GOLD + "(1/?)" + ChatColor.GOLD + " - ");
					
					SampleList(player);
					
				} else if (args.length == 4) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Apprentice II " + ChatColor.GOLD + "(" + args[3] + "/?)" + ChatColor.GOLD + " - ");

					String page = args[3];
					
					SampleList(player);
					
				} else {
					
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
					
				}
				
			} else if (args[2].equalsIgnoreCase("I")) {
				
				if (args.length == 3) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Apprentice I " + ChatColor.GOLD + "(1/?)" + ChatColor.GOLD + " - ");
					
					SampleList(player);
					
				} else if (args.length == 4) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Apprentice I " + ChatColor.GOLD + "(" + args[3] + "/?)" + ChatColor.GOLD + " - ");

					String page = args[3];
					
					SampleList(player);
					
				} else {
					
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
					
				}
				
			} else {
				
				sender.sendMessage(ChatColor.RED + "Subrank not found.");
				
			}
			
		} else if (args[1].equalsIgnoreCase("builder")) {
			
			// event tree for builder III - I
			if (args.length == 2) {
				
				sender.sendMessage(ChatColor.RED + "No subrank entered.");
				
			} else if (args[2].equalsIgnoreCase("III")) {
				
				if (args.length == 3) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Builder III " + ChatColor.GOLD + "(1/?)" + ChatColor.GOLD + " - ");
					
					SampleList(player);
					
				} else if (args.length == 4) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Builder III " + ChatColor.GOLD + "(" + args[3] + "/?)" + ChatColor.GOLD + " - ");

					String page = args[3];
					
					SampleList(player);
					
				} else {
					
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
					
				}
				
			} else if (args[2].equalsIgnoreCase("II")) {
				
				if (args.length == 3) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Builder II " + ChatColor.GOLD + "(1/?)" + ChatColor.GOLD + " - ");
					
					SampleList(player);
					
				} else if (args.length == 4) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Builder II " + ChatColor.GOLD + "(" + args[3] + "/?)" + ChatColor.GOLD + " - ");

					String page = args[3];
					
					SampleList(player);
					
				} else {
					
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
					
				}
				
			} else if (args[2].equalsIgnoreCase("I")) {
				
				if (args.length == 3) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Builder I " + ChatColor.GOLD + "(1/?)" + ChatColor.GOLD + " - ");
					
					SampleList(player);
					
				} else if (args.length == 4) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Builder I " + ChatColor.GOLD + "(" + args[3] + "/?)" + ChatColor.GOLD + " - ");

					String page = args[3];
					
					SampleList(player);
					
				} else {
					
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
					
				}
				
			} else {
				
				sender.sendMessage(ChatColor.RED + "Subrank not found.");
				
			}
			
		} else if (args[1].equalsIgnoreCase("designer")) {
			
			// event tree for designer III - I
			if (args.length == 2) {
				
				sender.sendMessage(ChatColor.RED + "No subrank entered.");
				
			} else if (args[2].equalsIgnoreCase("III")) {
				
				if (args.length == 3) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Designer III " + ChatColor.GOLD + "(1/?)" + ChatColor.GOLD + " - ");
					
					SampleList(player);
					
				} else if (args.length == 4) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Designer III " + ChatColor.GOLD + "(" + args[3] + "/?)" + ChatColor.GOLD + " - ");

					String page = args[3];
					
					SampleList(player);
					
				} else {
					
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
					
				}
				
			} else if (args[2].equalsIgnoreCase("II")) {
				
				if (args.length == 3) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Designer II " + ChatColor.GOLD + "(1/?)" + ChatColor.GOLD + " - ");
					
					SampleList(player);
					
				} else if (args.length == 4) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Designer II " + ChatColor.GOLD + "(" + args[3] + "/?)" + ChatColor.GOLD + " - ");

					String page = args[3];
					
					SampleList(player);
					
				} else {
					
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
					
				}
				
			} else if (args[2].equalsIgnoreCase("I")) {
				
				if (args.length == 3) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Designer I " + ChatColor.GOLD + "(1/?)" + ChatColor.GOLD + " - ");
					
					SampleList(player);
					
				} else if (args.length == 4) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Designer I " + ChatColor.GOLD + "(" + args[3] + "/?)" + ChatColor.GOLD + " - ");

					String page = args[3];
					
					SampleList(player);
					
				} else {
					
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
					
				}
				
			} else {
				
				sender.sendMessage(ChatColor.RED + "Subrank not found.");
				
			}
			
		} else if (args[1].equalsIgnoreCase("architect")) {
			
			// event tree for architect III - I
			if (args.length == 2) {
				
				sender.sendMessage(ChatColor.RED + "No subrank entered.");
				
			} else if (args[2].equalsIgnoreCase("III")) {
				
				if (args.length == 3) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Architect III " + ChatColor.GOLD + "(1/?)" + ChatColor.GOLD + " - ");
					
					SampleList(player);
					
				} else if (args.length == 4) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Architect III " + ChatColor.GOLD + "(" + args[3] + "/?)" + ChatColor.GOLD + " - ");

					String page = args[3];
					
					SampleList(player);
					
				} else {
					
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
					
				}
				
			} else if (args[2].equalsIgnoreCase("II")) {
				
				if (args.length == 3) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Architect II " + ChatColor.GOLD + "(1/?)" + ChatColor.GOLD + " - ");
					
					SampleList(player);
					
				} else if (args.length == 4) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Architect II " + ChatColor.GOLD + "(" + args[3] + "/?)" + ChatColor.GOLD + " - ");

					String page = args[3];
					
					SampleList(player);
					
				} else {
					
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
					
				}
				
			} else if (args[2].equalsIgnoreCase("I")) {
				
				if (args.length == 3) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Architect I " + ChatColor.GOLD + "(1/?)" + ChatColor.GOLD + " - ");
					
					SampleList(player);
					
				} else if (args.length == 4) {
					
					sender.sendMessage(ChatColor.GOLD + " - " + ChatColor.WHITE + "Architect I " + ChatColor.GOLD + "(" + args[3] + "/?)" + ChatColor.GOLD + " - ");

					String page = args[3];
					
					SampleList(player);
					
				} else {
					
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
					
				}
				
			} else {
				
				sender.sendMessage(ChatColor.RED + "Subrank not found.");
				
			}
			
		} else if (args[1].equalsIgnoreCase("master")) {
			InfoCommands.Top(player);
		} else {
			sender.sendMessage(ChatColor.RED + "Rank not found.");
		}
	}
	
	public static void MyRank(Player player) {
		CommandSender sender =  player;
		sender.sendMessage(ChatColor.YELLOW + "MyRank command worked through second class!");
	}
	
	public static void Top(Player player) {
		CommandSender sender =  player;
		sender.sendMessage(ChatColor.YELLOW + "Top command worked through second class!");
	}
	
	public static void TopBuilds(Player player) {
		CommandSender sender =  player;
		sender.sendMessage(ChatColor.YELLOW + "TopBuilds command worked through second class!");
	}
	
	public static void SampleList(Player player) {
		
		
		// just sample pages to make it look good, this would actually pull a file and parse that instead
		CommandSender sender = player;
		sender.sendMessage("1 - macmo920");
		sender.sendMessage("2 - ressamp");
		sender.sendMessage("3 - masterpleb");
		sender.sendMessage("4 - donairsgivemebonairs");
		sender.sendMessage("5 - swagdaddy420");
		sender.sendMessage("6 - JZXRYO");
		sender.sendMessage("7 - yourmom");
	}	
}
