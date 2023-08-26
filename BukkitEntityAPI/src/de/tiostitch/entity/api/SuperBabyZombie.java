package de.tiostitch.entity.api;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;

public class SuperBabyZombie extends EntityCreator {

    public SuperBabyZombie(Location loc) {
        super("§cBaby Jocky Zombie",
                120.0,
                150.0,
                true,
                true,
                loc,
                EntityType.ZOMBIE);
    }
}
