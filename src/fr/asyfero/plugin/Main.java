/**
 * This plugin was made by Asyfero
 */

package fr.asyfero.plugin;

import fr.asyfero.plugin.cmd.Quit;
import fr.asyfero.plugin.cmd.Start;
import fr.asyfero.plugin.events.Achievements;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("The plugin is on!");

        this.getCommand("start").setExecutor(new Start());
        this.getCommand("quit").setExecutor(new Quit());

        getServer().getPluginManager().registerEvents(new Achievements(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("The plugin is off!");
    }
}
