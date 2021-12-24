package me.catlikecake934.stafffunctions;

import me.catlikecake934.stafffunctions.commands.report;
import me.catlikecake934.stafffunctions.commands.staffChat;
import org.bukkit.plugin.java.JavaPlugin;

public final class StaffFunctions extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("report").setExecutor(new report());
        getCommand("sc").setExecutor(new staffChat());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
