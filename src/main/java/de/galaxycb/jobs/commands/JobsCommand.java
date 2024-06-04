package de.galaxycb.jobs.commands;

import de.galaxycb.jobs.util.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class JobsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
         sender.sendMessage("Du musst ein Spieler sein, um diesen Command auszuführen");
        }

        Player player = (Player) sender;
        Inventory inventory = Bukkit.createInventory(null, 3*9, "Jobs");

        inventory.setItem(10, new ItemBuilder(Material.IRON_PICKAXE).setDisplayname("Miner").setLocalizedName("miner").build());

        inventory.setItem(12, new ItemBuilder(Material.IRON_SHOVEL).setDisplayname("Graeber").setLocalizedName("digger").build());

        inventory.setItem(14, new ItemBuilder(Material.IRON_HOE).setDisplayname("Farmer").setLocalizedName("farmer").build());

        inventory.setItem(16, new ItemBuilder(Material.IRON_AXE).setDisplayname("Holzfaeller").setLocalizedName("lumberjack").build());


        player.openInventory(inventory);

        return false;
    }
}
