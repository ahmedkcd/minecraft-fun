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
        if(!e.getView().getTitle().equals(ChatColor.RED + "GUI")){
            return;
        }
        if(e.getCurrentItem() == null){
            return;
        }

        Player p = (Player) e.getWhoClicked();
        if(e.getCurrentItem().getType() == Material.SKELETON_SKULL)
            {
                p.setHealth(0);
                p.closeInventory();
                p.sendMessage(ChatColor.BOLD + "" + ChatColor.of(new Color(220, 70, 10)) + "WISH GRANTED.");
            }
        else if(e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
            e.setCancelled(true);
        }
    }
}
