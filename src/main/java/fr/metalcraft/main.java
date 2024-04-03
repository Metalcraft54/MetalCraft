package fr.metalcraft;


import fr.metalcraft.command.Broadcast;
import org.bukkit.plugin.java.JavaPlugin;


public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
getCommand("Broadcast").setExecutor(new Broadcast());
    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
