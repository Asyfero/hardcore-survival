package fr.asyfero.plugin.events;

import fr.asyfero.plugin.utilities.WorldReset;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;

public class Achievements implements Listener {

    String pL = "§f[§cHS§f] ";

    int wood = 1;
    int rock = 1;
    int coal = 1;
    int iron = 1;
    int gold = 1;
    int diamond = 1;
    int obsidian = 1;

    @EventHandler
    public void achievementsListener(EntityPickupItemEvent e) {

        Material m =  e.getItem().getItemStack().getType();

        if (Bukkit.getWorld("hardcoreWorld").isHardcore()) {
            if (wood == 1) {
                if (m == Material.OAK_LOG) {
                    Bukkit.broadcastMessage(pL + " §aWood §6achievement was done§f! §6Next Achievement§f: §aRock");

                    wood = 0;
                    return;
                } else if (m == Material.BIRCH_LOG) {
                    Bukkit.broadcastMessage(pL + " §aWood §6achievement was done§f! §6Next Achievement§f: §aRock");

                    wood = 0;
                    return;
                } else if (m == Material.SPRUCE_LOG) {
                    Bukkit.broadcastMessage(pL + " §aWood §6achievement was done§f! §6Next Achievement§f: §aRock");

                    wood = 0;
                    return;
                } else if (m == Material.DARK_OAK_LOG) {
                    Bukkit.broadcastMessage(pL + " §aWood §6achievement was done§f! §6Next Achievement§f: §aRock");

                    wood = 0;
                    return;
                } else if (m == Material.JUNGLE_LOG) {
                    Bukkit.broadcastMessage(pL + " §aWood §6achievement was done§f! §6Next Achievement§f: §aRock");

                    wood = 0;
                    return;
                } else if (m == Material.ACACIA_LOG) {
                    Bukkit.broadcastMessage(pL + " §aWood §6achievement was done§f! §6Next Achievement§f: §aRock");

                    wood = 0;
                    return;
                }
            }
            if (rock == 1) {
                if (m == Material.COBBLESTONE) {
                    Bukkit.broadcastMessage(pL + " §aRock §6achievement was done§f! §6Next Achievement§f: §aCoal");

                    rock = 0;
                    return;
                } else if (m == Material.COBBLED_DEEPSLATE) {
                    Bukkit.broadcastMessage(pL + " §aRock §6achievement was done§f! §6Next Achievement§f: §aCoal");

                    rock = 0;
                    return;
                }
            }
            if (coal == 1) {
                if (m == Material.COAL) {
                    Bukkit.broadcastMessage(pL + " §aCoal §6achievement was done§f! §6Next Achievement§f: §eIron");

                    coal = 0;
                    return;
                }
            }
            if (iron == 1) {
                if (m == Material.IRON_INGOT) {
                    Bukkit.broadcastMessage(pL + " §eIron §6achievement was done§f! §6Next Achievement§f: §eGold");

                    iron = 0;
                    return;
                }
            }
            if (gold == 1) {
                if (m == Material.GOLD_INGOT) {
                    Bukkit.broadcastMessage(pL + " §eGold §6achievement was done§f! §6Next Achievement§f: §eDiamond");

                    gold = 0;
                    return;
                }
            }
            if (diamond == 1) {
                if (m == Material.DIAMOND) {
                    Bukkit.broadcastMessage(pL + " §eDiamond §6achievement was done§f! §6Next Achievement§f: §cObsidian");

                    diamond = 0;
                    return;
                }
            }
            if (obsidian == 1) {
                if (m == Material.OBSIDIAN) {
                    Bukkit.broadcastMessage(pL + " §cObsidian §6achievement was done§f! §eYou Win§f!");

                    wood = 1;
                    rock = 1;
                    coal = 1;
                    iron = 1;
                    gold = 1;
                    diamond = 1;
                    obsidian = 1;

                    int y = Bukkit.getWorld("world").getHighestBlockYAt(0,0);

                    for(Player p: Bukkit.getOnlinePlayers()) {
                        p.teleport(new Location(Bukkit.getWorld("world"), 0, y, 0));

                        WorldReset.deleteWorld("hardcoreWorld");
                    }
                }
            }
        } else {

        }
    }
}
