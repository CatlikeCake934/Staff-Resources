package me.catlikecake934.staffresources;

import me.catlikecake934.staffresources.commands.reloadConfig;
import me.catlikecake934.staffresources.commands.report;
import me.catlikecake934.staffresources.commands.staffChat;
import org.bukkit.plugin.java.JavaPlugin;

public final class StaffResources extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("report").setExecutor(new report());
        getCommand("sc").setExecutor(new staffChat());
        getCommand("ac").setExecutor(new adminChat());
        getCommand("srreload").setExecutor(new reloadConfig());
        getCommand("vanish").setExecutor(new vanish());
        getCommand("unvanish").setExecutor(new unvanish());

        config.setup();
        config.get().addDefault("Staff Chat Prefix", "§c§l[Staff Chat] ");
        config.get().options().copyDefaults(true);
        config.save();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
