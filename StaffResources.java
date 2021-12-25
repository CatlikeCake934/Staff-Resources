package me.catlikecake934.staffresources;

import me.catlikecake934.staffresources.commands.*;
import me.catlikecake934.staffresources.events.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class StaffResources extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new joinEvent(), this);
        getCommand("report").setExecutor(new report());
        getCommand("sc").setExecutor(new staffChat());
        getCommand("ac").setExecutor(new adminChat());
        getCommand("srreload").setExecutor(new reloadConfig());
        getCommand("vanish").setExecutor(new vanish());
        getCommand("unvanish").setExecutor(new unvanish());
        getCommand("srban").setExecutor(new banScreen());
        getCommand("srunban").setExecutor(new unban());



        config.setup();
        config.get().addDefault("Staff Chat Prefix", "§c§l[Staff Chat] ");
        config.get().addDefault("Admin Chat Prefix", "§4§l[Staff Chat] ");
        config.get().addDefault("Ban Message Line 1", "You have been §4§oBANNED");
        config.get().addDefault("Ban Message Line 2", "Contact the Owner to be unbanned");
        config.get().addDefault("Ban Message Line 3", "Unbans at: www.example.com");
        config.get().options().copyDefaults(true);
        config.save();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
