package fr.asyfero.plugin.cmd;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Start implements CommandExecutor {

    World world;

    public int a = 0;

    public void createWorld() {
        WorldCreator c = new WorldCreator("hardcoreWorld");
        c.type(WorldType.NORMAL);
        c.generateStructures(true);
        world = c.createWorld();
        world.setHardcore(true);
        world.getWorldBorder().setSize(50);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            String pL = "§f[§cHS§f] ";

            Bukkit.broadcastMessage(pL + "§9" + player.getDisplayName() + " §6was create §f<§cHardcore Survival§f> §6game§f!");

            Bukkit.broadcastMessage("§6Loading§f...");

            player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 3, 3);

            createWorld();

            int y = world.getHighestBlockYAt(0, 0);

            for(Player p: Bukkit.getOnlinePlayers()) {
                p.teleport(new Location(Bukkit.getWorld("hardcoreWorld"), 0, y, 0));
            }

            player.playSound(player.getLocation(), Sound.ENTITY_ENDER_DRAGON_AMBIENT, 3, 3);

            Bukkit.broadcastMessage(pL + " §6Welcome to the §f<§cHardcore Survival§f> §6Plugin§f, §6you have some achievements to do§f, §6these achievements is here like a timeline of the game§f, §6if you do all of these achievements§f, §6you win§f. §6If you want quit§f, §6do §e/quit§f. §cGood Luck§f. §cIf there is no Tree in the map, please quit and do /start");
        }
        return true;
    }
}
