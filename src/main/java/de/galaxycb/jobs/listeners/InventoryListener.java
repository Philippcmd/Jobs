package de.galaxycb.jobs.listeners;

import de.galaxycb.jobs.Main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.permissions.PermissionAttachment;

import java.util.HashMap;
import java.util.UUID;

public class InventoryListener implements Listener {

    private static Main plugin;

    public InventoryListener() {
        this.plugin = plugin;
    }

    private void givePermission(Player player, String permission) {
        PermissionAttachment attachment = player.addAttachment(plugin);
        attachment.setPermission(permission, true);
        plugin.getPlayerPermissions().put(player.getUniqueId(), attachment);
    }

    private void removePermission(Player player, String permission) {
        UUID uuid = player.getUniqueId();
        HashMap<UUID, PermissionAttachment> playerPermissions = plugin.getPlayerPermissions();
        if (playerPermissions.containsKey(uuid)) {
            PermissionAttachment attachment = playerPermissions.get(uuid);
            attachment.unsetPermission(permission);
            playerPermissions.remove(uuid);
            attachment.remove();
        }
    }
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if(event.getCurrentItem() ==null) return;
        if (event.getView().getTitle() == "Jobs") {
            Player player = (Player) event.getWhoClicked();

            event.setCancelled(true);

            if (event.getCurrentItem().getItemMeta().hasLocalizedName()) {
                switch (event.getCurrentItem().getItemMeta().getLocalizedName()) {
                    case "miner":
                        player.sendMessage("Dein Job wurde zu Miner gesetzt");
                        player.closeInventory();
                        givePermission(player, "job.miner");
                        removePermission(player, "job.digger");
                        removePermission(player, "job.farmer");
                        removePermission(player, "job.lumberjack");
                        break;

                    case "digger":
                        player.sendMessage("Dein Job wurde zu Graeber gesetzt");
                        player.closeInventory();
                        givePermission(player, "job.digger");
                        removePermission(player, "job.miner");
                        removePermission(player, "job.farmer");
                        removePermission(player, "job.lumberjack");
                        break;

                    case "farmer":
                        player.sendMessage("Dein Job wurde zu Farmer gesetzt");
                        player.closeInventory();
                        givePermission(player, "job.farmer");
                        removePermission(player, "job.digger");
                        removePermission(player, "job.miner");
                        removePermission(player, "job.lumberjack");
                        break;

                    case "lumberjack":
                        player.sendMessage("Dein Job wurde zu Holzfaeller gesetzt");
                        player.closeInventory();
                        givePermission(player, "job.lumberjack");
                        removePermission(player, "job.digger");
                        removePermission(player, "job.farmer");
                        removePermission(player, "job.miner");
                        break;

                }
            }
        }
    }
}
