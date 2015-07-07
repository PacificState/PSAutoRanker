package com.ressamp.autoranker;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import com.ressamp.autoranker.commands.Commands;

public class AutoRanker extends JavaPlugin {

	public void onEnable(){
		getLogger().info(Color.RED + "AutoRanker Enabled!");
	}
	
	/* public boolean onCommand2(CommandSender sender, Command command, String label, String[] args) {
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
	} */
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        PlayerEntry player = m_playerManager.getPlayer((sender instanceof Player) ? (Player) sender : null);

        if (!command.getName().equalsIgnoreCase(Commands.COMMAND_MAIN)) {
            return false;
        }

        String name = (args != null && args.length > 0) ? args[0] : "";

        if (name.equalsIgnoreCase(Commands.COMMAND_RELOAD)) {
            doReloadConfig(player, args != null && args.length > 1 ? args[1] : "");
            return true;
        } else if (name.equalsIgnoreCase(Commands.COMMAND_HELP)) {
            String arg = args != null && args.length > 1 ? args[1] : null;
            return Help.ShowHelp(player, arg);
        }
        /*
        
        } else if (name.equalsIgnoreCase(Commands.COMMAND_PURGE)) {
            doPurge(player, args);
            return true;
        } else if (name.equalsIgnoreCase(Commands.COMMAND_JOBS)) {
            doJobs(player, args);
            return true;
        } else if (name.equalsIgnoreCase(Commands.COMMAND_CANCEL)) {
            doCancel(player, args);
            return true;
        } else if (name.equalsIgnoreCase(Commands.COMMAND_TOGGLE)) {
            doToggle(player, args);
            return true;
        } */

        return Help.ShowHelp(player, null);
    }
}
