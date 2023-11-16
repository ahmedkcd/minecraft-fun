package me.itzorg.minecraft_fun;

import me.itzorg.minecraft_fun.commands.GUICommand;
import me.itzorg.minecraft_fun.commands.NickCommand;
import me.itzorg.minecraft_fun.listeners.PlayerHitListener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Made by Ahmed Kaced
 *
 *
 */
public final class MinecraftFun extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("nick").setExecutor(new NickCommand());
        getCommand("gui").setExecutor(new GUICommand());
        getCommand("zeus").setExecutor(new ZeusCommand());

        getServer().getPluginManager().registerEvents(new PlayerHitListener(), this );

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
