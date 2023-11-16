package me.itzorg.minecraft_fun.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.awt.*;

public class NickCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;
            if(args.length == 1)
            {
                if(args[0].length() <= 15)
                {
                    p.setDisplayName(args[0]);
                    p.setPlayerListName(args[0]);
                    p.sendMessage(ChatColor.of(new Color(250, 231, 110)) + "Nick changed to: " + args[0]);
                }
            }
            if(args.length == 0)
            {
                p.setDisplayName(p.getName());
                p.setPlayerListName(p.getName());
                p.sendMessage(ChatColor.of(new Color(214, 116, 43)) + "Nick removed.");
            }
        }


        return true;
    }
}
