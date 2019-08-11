package ca.fastis;

import org.bukkit.Server;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PollitaPlugin extends JavaPlugin implements Listener { 
	Server server;
	static boolean doPlayersKeepInv = true;
	
	public void onEnable() {
		server = this.getServer();
		server.getConsoleSender().sendMessage("Plugin Enabled");
		this.getCommand("SetKeepInventory").setExecutor(new SetKeepInventory());
	}
	
	@Override
	public void onDisable() {
		server.getConsoleSender().sendMessage("Plugin Disabled");
	}
	
	@EventHandler
	public void onPlayerDeathEvent(PlayerDeathEvent event) {
		event.setKeepInventory(doPlayersKeepInv);
	}
}