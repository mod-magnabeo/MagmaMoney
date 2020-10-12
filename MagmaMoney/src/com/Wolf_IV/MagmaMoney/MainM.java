package com.Wolf_IV.MagmaMoney;

import org.bukkit.plugin.java.JavaPlugin;

import com.Wolf_IV.MagmaMoney.Commands.CMgive;
import com.Wolf_IV.MagmaMoney.Commands.CShop;

public class MainM extends JavaPlugin {
	@Override
	public void onEnable() {
		getCommand("mgive").setExecutor(new CMgive());
		getCommand("shop").setExecutor(new CShop());
		getServer().getPluginManager().registerEvents(new MListeners(this), this);
	}

}
