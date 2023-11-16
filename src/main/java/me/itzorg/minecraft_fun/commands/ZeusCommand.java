package me.itzorg.minecraft_fun.commands;

import java.util.ArrayList;
import java.util.Iterator;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.awt.*;

public class ZeusCommand implements CommandExecutor {
    public static ArrayList<String> lightningGods = new ArrayList<String>();

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Iterator<String> iterator = lightningGods.iterator();
            while(iterator.hasNext()){
                if(iterator.next() == sender.getName()){
                    iterator.remove();
                }
                lightningGods.add(sender.getName());
            }
        }


        return true;
    }
}
