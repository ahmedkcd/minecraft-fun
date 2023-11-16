package me.itzorg.minecraft_fun.listeners;

import me.itzorg.minecraft_fun.commands.*;
import java.util.ArrayList;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LightningStrike;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.weather.LightningStrikeEvent;
import me.itzorg.minecraft_fun.commands.ZeusCommand;

public class PlayerInteractEventListener implements Listener {
    public void onPlayerInteractEvent(PlayerInteractEvent e)
    {

        if(e.getAction() == Action.LEFT_CLICK_AIR)
        {
            e.getPlayer().getWorld().strikeLightning(e.getClickedBlock().getLocation());
        }

    }
}
