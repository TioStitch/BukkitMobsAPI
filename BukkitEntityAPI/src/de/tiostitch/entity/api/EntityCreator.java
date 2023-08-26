package de.tiostitch.entity.api;

import de.tiostitch.entity.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.metadata.FixedMetadataValue;

import java.util.Arrays;

public abstract class EntityCreator {

    private final String entityName;
    private final double entityHealth;
    private final double entityDamage;
    private final boolean isNameVisible;
    private Location location;
    private final boolean isBaby;
    private double x;
    private double y;
    private double z;

    public EntityCreator(String entityName, double entityHealth, double entityDamage, boolean visibleName, boolean isBaby, String world, double x, double y, double z, EntityType type) {
        this.entityName = entityName;
        this.entityHealth = entityHealth;
        this.entityDamage = entityDamage;
        this.x = x;
        this.y = y;
        this.z = z;

        this.isNameVisible = visibleName;
        this.isBaby = isBaby;

        buildEntity(world, type);
    }

    public EntityCreator(String _entityName, double _entityHealth, double _entityDamage, boolean _visibleName, boolean _isBaby, Location _location, EntityType _type) {
        this.entityName = _entityName;
        this.entityHealth = _entityHealth;
        this.entityDamage = _entityDamage;

        this.isNameVisible = _visibleName;
        this.location = _location;
        this.isBaby = _isBaby;

        buildEntity(_location, _type);
    }

    public void buildEntity(String world, EntityType type) {
        World customWorld = Bukkit.getWorld(world);
        Location customLoc = new Location(customWorld, x, y, z);
        LivingEntity entity = (LivingEntity) Bukkit.getWorld(world).spawnEntity(customLoc, type);
        entity.setCustomName(entityName());
        entity.setCustomNameVisible(isNameVisible());

        entity.setMetadata(entityName.replace(" ", ""), new FixedMetadataValue(Main.getPlugin(), entityName));
        entity.setMetadata("damage", new FixedMetadataValue(Main.getPlugin(), entityDamage));
        entity.setMetadata("health", new FixedMetadataValue(Main.getPlugin(), entityHealth));

        entity.setMaxHealth(entityHealth());
        entity.resetMaxHealth();
    }

    public double entityDamage() {
        return entityDamage;
    }

    public boolean isBaby() {
        return isBaby;
    }

    public void buildEntity(Location locations, EntityType type) {
        LivingEntity entity = (LivingEntity) Bukkit.getWorld(locations.getWorld().getName()).spawnEntity(locations, type);
        entity.setCustomName(entityName());
        entity.setCustomNameVisible(isNameVisible());

        entity.setMetadata(entityName.replace(" ", ""), new FixedMetadataValue(Main.getPlugin(), entityName));
        entity.setMetadata("damage", new FixedMetadataValue(Main.getPlugin(), entityDamage));
        entity.setMetadata("health", new FixedMetadataValue(Main.getPlugin(), entityHealth));

        entity.setMaxHealth(entityHealth());
        entity.resetMaxHealth();

        location = locations;
    }

    public boolean isNameVisible() {
        return isNameVisible;
    }

    public double entityHealth() {
        return entityHealth;
    }
    public String entityName() {
        return entityName;
    }
}
