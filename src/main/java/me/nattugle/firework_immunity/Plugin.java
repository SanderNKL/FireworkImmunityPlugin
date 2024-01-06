package me.nattugle.firework_immunity;

import org.bukkit.plugin.java.JavaPlugin;

import me.nattugle.firework_immunity.listeners.*;

public class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Fireworks have now been NERFED! O :)");
        getServer().getPluginManager().registerEvents(new FireworkImmunity(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("FireworkImmunity disabled");
    }
}
