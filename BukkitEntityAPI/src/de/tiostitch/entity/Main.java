package de.tiostitch.entity;

import de.tiostitch.entity.api.EntityCreator;
import de.tiostitch.entity.api.EntityDamageAPI;
import de.tiostitch.entity.api.SuperBabyZombie;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class Main extends JavaPlugin implements Listener {

    private static Main plugin;

    @Override
    public void onEnable() {
        plugin = this;

        Bukkit.getPluginManager().registerEvents(new EntityDamageAPI(), this);
        Bukkit.getPluginManager().registerEvents(this, this);
    }


    @Override
    public void onDisable() {

    }

    public static Main getPlugin() {
        return plugin;
    }
}
