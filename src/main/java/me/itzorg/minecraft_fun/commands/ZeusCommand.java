package me.itzorg.minecraft_fun.commands;

import java.util.HashSet;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.awt.*;

public class ZeusCommand implements CommandExecutor {
    public static HashSet<String> lightningGods;

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;
            if (lightningGods.contains(p.getName())) {
                lightningGods.remove(p.getName());
                p.sendMessage(ChatColor.of(new Color(250, 231, 110)) + "Zeus powers disabled for " + p.getName());
            }
            else {
                lightningGods.add(p.getName());
                p.sendMessage(ChatColor.of(new Color(250, 231, 110)) + "Zeus powers enabled for " + p.getName());
            }
        }
        return true;
    }
}
