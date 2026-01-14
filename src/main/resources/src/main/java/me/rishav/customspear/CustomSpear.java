package me.rishav.customspear;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomSpear extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("CustomSpear Plugin Enabled!");
        Bukkit.getPluginManager().registerEvents(new SpearListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("CustomSpear Plugin Disabled!");
    }
}
