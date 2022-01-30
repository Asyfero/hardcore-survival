package fr.asyfero.plugin.cmd;

import fr.asyfero.plugin.utilities.WorldReset;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Quit implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {
        if (sender instanceof Player) {

            int y = Bukkit.getWorld("world").getHighestBlockYAt(0,0);

            for(Player p: Bukkit.getOnlinePlayers()) {
                p.teleport(new Location(Bukkit.getWorld("world"), 0, y, 0));

                WorldReset.deleteWorld("hardcoreWorld");
            }
        }
        return true;
    }
}
