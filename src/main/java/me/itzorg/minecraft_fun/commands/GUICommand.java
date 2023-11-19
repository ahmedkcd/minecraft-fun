package me.itzorg.minecraft_fun.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.*;

public class GUICommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player)
        {
            Player player = (Player) sender;

            Inventory gui = Bukkit.createInventory(player, InventoryType.CHEST, (ChatColor.RED + "GUI"));



            ItemStack suicide = new ItemStack(Material.SKELETON_SKULL);
            ItemStack border = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta suicide_meta = suicide.getItemMeta();
            suicide_meta.setDisplayName(ChatColor.of(new Color(250, 231, 110)) + "SUICIDE");
            suicide.setItemMeta(suicide_meta);

            gui.setItem(13, suicide);
            gui.setItem(0, border);
            gui.setItem(1, border);
            gui.setItem(2, border);
            gui.setItem(3, border);
            gui.setItem(4, border);
            gui.setItem(5, border);
            gui.setItem(6, border);
            gui.setItem(7, border);
            gui.setItem(8, border);
            gui.setItem(9, border);
            gui.setItem(10, border);
            gui.setItem(11, border);
            gui.setItem(12, border);
            gui.setItem(14, border);
            gui.setItem(15, border);
            gui.setItem(16, border);
            gui.setItem(17, border);
            gui.setItem(18, border);
            gui.setItem(19, border);
            gui.setItem(20, border);
            gui.setItem(21, border);
            gui.setItem(22, border);
            gui.setItem(23, border);
            gui.setItem(24, border);
            gui.setItem(25, border);
            gui.setItem(26, border);


            player.openInventory(gui);
        }



        return true;
    }
}
