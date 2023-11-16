package me.itzorg.minecraft_fun.listeners;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.awt.*;

public class MenuHandler implements Listener {


    @EventHandler
    public void onMenuClick(InventoryClickEvent e)
    {
        Player p = (Player) e.getWhoClicked();
        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.of(new Color(250, 231, 110)) + "GUI"))
        {
            if(e.getCurrentItem().equals(Material.SKELETON_SKULL))
            {
                p.setHealth(0.0);
                p.sendMessage(ChatColor.BOLD + "" + ChatColor.of(new Color(220, 70, 10)) + "WISH GRANTED.");
                p.closeInventory();
            }
        }
    }
}
