package de.galaxycb.jobs;

import de.galaxycb.jobs.commands.JobsCommand;
import de.galaxycb.jobs.listeners.BlockBreakEvent;
import de.galaxycb.jobs.listeners.InventoryListener;
import org.bukkit.Bukkit;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public final class Main extends JavaPlugin {


    private HashMap<UUID, PermissionAttachment> playerPermissions = new HashMap<>();
    public HashMap<UUID, PermissionAttachment> getPlayerPermissions() {
        return playerPermissions;
    }


    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("jobs").setExecutor(new JobsCommand());
        Bukkit.getPluginManager().registerEvents(new InventoryListener(this), this);
        Bukkit.getPluginManager().registerEvents(new BlockBreakEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

