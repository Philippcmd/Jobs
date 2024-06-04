package de.galaxycb.jobs.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BlockBreakEvent implements Listener {
    @EventHandler
    public void onBlockBreak(org.bukkit.event.block.BlockBreakEvent event) {

        Player player = event.getPlayer();
        Block minedBlock = event.getBlock();

        if (player.hasPermission("job.miner")) {

            if (minedBlock.getType() == Material.COAL_ORE) {
                player.giveExp(2);
            }

            if (minedBlock.getType() == Material.DEEPSLATE_COAL_ORE) {
                player.giveExp(2);
            }

            if (minedBlock.getType() == Material.COPPER_ORE) {
                player.giveExp(3);
            }

            if (minedBlock.getType() == Material.DEEPSLATE_COPPER_ORE) {
                player.giveExp(3);
            }

            if (minedBlock.getType() == Material.REDSTONE_ORE) {
                player.giveExp(5);
            }

            if (minedBlock.getType() == Material.DEEPSLATE_REDSTONE_ORE) {
                player.giveExp(5);
            }

            if (minedBlock.getType() == Material.IRON_ORE) {
                player.giveExp(8);
            }

            if (minedBlock.getType() == Material.DEEPSLATE_IRON_ORE) {
                player.giveExp(8);
            }

            if (minedBlock.getType() == Material.GOLD_ORE) {
                player.giveExp(10);
            }

            if (minedBlock.getType() == Material.DEEPSLATE_GOLD_ORE) {
                player.giveExp(10);
            }

            if (minedBlock.getType() == Material.DIAMOND_ORE) {
                player.giveExp(15);
            }

            if (minedBlock.getType() == Material.DEEPSLATE_DIAMOND_ORE) {
                player.giveExp(15);
            }

            if (minedBlock.getType() == Material.LAPIS_ORE) {
                player.giveExp(20);
            }

            if (minedBlock.getType() == Material.DEEPSLATE_LAPIS_ORE) {
                player.giveExp(20);
            }

            if (minedBlock.getType() == Material.EMERALD_ORE) {
                player.giveExp(25);
            }

            if (minedBlock.getType() == Material.DEEPSLATE_EMERALD_ORE) {
                player.giveExp(25);
            }

        }

        if (player.hasPermission("job.digger")) {

            if (minedBlock.getType() == Material.DIRT) {
                player.giveExp(2);
            }

            if (minedBlock.getType() == Material.COARSE_DIRT) {
                player.giveExp(2);
            }

            if (minedBlock.getType() == Material.ROOTED_DIRT) {
                player.giveExp(2);
            }

            if (minedBlock.getType() == Material.SAND) {
                player.giveExp(2);
            }

            if (minedBlock.getType() == Material.GRAVEL) {
                player.giveExp(2);
            }

            if (minedBlock.getType() == Material.CLAY) {
                player.giveExp(2);
            }
        }

        if (player.hasPermission("job.farmer")) {

            if (minedBlock.getType() == Material.WHEAT) {
                player.giveExp(1);
            }

            if (minedBlock.getType() == Material.POTATOES) {
                player.giveExp(1);
            }

            if (minedBlock.getType() == Material.CARROTS) {
                player.giveExp(1);
            }

            if (minedBlock.getType() == Material.BEETROOTS) {
                player.giveExp(1);
            }

            if (minedBlock.getType() == Material.PUMPKIN) {
                player.giveExp(1);
            }

            if (minedBlock.getType() == Material.MELON) {
                player.giveExp(1);
            }

        }

        if (player.hasPermission("job.lumberjack")) {

            if (minedBlock.getType() == Material.OAK_LOG) {
                player.giveExp(2);
            }

            if (minedBlock.getType() == Material.SPRUCE_LOG) {
                player.giveExp(2);
            }

            if (minedBlock.getType() == Material.BIRCH_LOG) {
                player.giveExp(2);
            }

            if (minedBlock.getType() == Material.DARK_OAK_LOG) {
                player.giveExp(2);
            }

            if (minedBlock.getType() == Material.ACACIA_LOG) {
                player.giveExp(2);
            }

            if (minedBlock.getType() == Material.JUNGLE_LOG) {
                player.giveExp(2);
            }

            if (minedBlock.getType() == Material.MANGROVE_LOG) {
                player.giveExp(2);
            }
        }
    }
}
