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

            Inventory gui = Bukkit.createInventory(player, InventoryType.CHEST, ChatColor.of(new Color(250, 231, 110)) + "GUI");



            ItemStack suicide = new ItemStack(Material.SKELETON_SKULL);
            ItemStack border = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta suicide_meta = suicide.getItemMeta();
            suicide_meta.setDisplayName(ChatColor.of(new Color(250, 231, 110)) + "SUICIDE");
            suicide.setItemMeta(suicide_meta);

            gui.setItem(4, suicide);


            player.openInventory(gui);
        }



        return true;
    }
}
