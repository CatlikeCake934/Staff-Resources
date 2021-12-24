package me.catlikecake934.staffresources.commands;

import me.catlikecake934.staffresources.config;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class reloadConfig implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        Player p = (Player) sender;
        config.reload();
        p.sendMessage("Staff Resources reloaded");
        System.out.println("Staff Resources reloaded");

        return true;
    }
}
