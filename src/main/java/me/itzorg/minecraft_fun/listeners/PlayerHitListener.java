package me.itzorg.minecraft_fun.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class PlayerHitListener implements Listener {
    @EventHandler
    public void onPlayerHit(EntityDamageByEntityEvent e)
    {
        if(e.getEntity() instanceof Player && e.getDamager() instanceof Player)
        {
            Player p = (Player) e.getEntity();
            Player p2 = (Player) e.getDamager();
            p.setArrowsInBody(1000);
            p.setArrowCooldown(300);

        }

    }
}
