package me.itzorg.minecraft_fun;

import me.itzorg.minecraft_fun.commands.GUICommand;
import me.itzorg.minecraft_fun.commands.NickCommand;
import me.itzorg.minecraft_fun.commands.ZeusCommand;
import me.itzorg.minecraft_fun.listeners.PlayerHitListener;
import me.itzorg.minecraft_fun.listeners.PlayerInteractEventListener;
import me.itzorg.minecraft_fun.listeners.MenuHandler;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashSet;

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
        getServer().getPluginManager().registerEvents(new PlayerInteractEventListener(), this );
        getServer().getPluginManager().registerEvents(new MenuHandler(), this );

        ZeusCommand.lightningGods = new HashSet<>();
        ZeusCommand.lightningGods.add("ItzOrg");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
