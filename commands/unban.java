package me.catlikecake934.staffresources.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static org.bukkit.Bukkit.getServer;

public class unban implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        getServer().dispatchCommand(getServer().getConsoleSender(), "pardon " + args[0]);
        return true;
    }
}
