package de.tiostitch.entity.api;

import jdk.jfr.internal.MetadataDescriptor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.metadata.MetadataValue;

import java.util.ArrayList;
import java.util.List;

public class EntityDamageAPI implements Listener {

    public void onPlayerMove(PlayerMoveEvent e) {
        e.getPlayer().sendMessage("§aAção A!");
    }


    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event) {
        if (event.getEntity() instanceof Player && event.getDamager() instanceof LivingEntity) {
            Player player = (Player) event.getEntity();
            LivingEntity damager = (LivingEntity) event.getDamager();

            // Enviar mensagem ao jogador
            List<MetadataValue> values = damager.getMetadata("damage");
            if (values != null) {
                player.damage(values.get(1).asDouble());
            }
        }
    }
}
