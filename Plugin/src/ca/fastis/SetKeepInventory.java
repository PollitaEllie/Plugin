package ca.fastis;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetKeepInventory implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		if(sender instanceof Player) {
			sender.sendMessage("Welcome BROTHERA home");
			PollitaPlugin.doPlayersKeepInv = (PollitaPlugin.doPlayersKeepInv == true) ? false : true;
			return true;
		}
		return false;
	}

}
