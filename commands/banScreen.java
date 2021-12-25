package me.catlikecake934.staffresources.commands;

import me.catlikecake934.staffresources.config;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class banScreen implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        Player p = (Player) sender;
        if(sender.hasPermission("sr.ban")){
                Player target = Bukkit.getServer().getPlayer(args[0]);
                target.kickPlayer(config.get().getString("Ban Message Line 1") + "\n" + config.get().getString("Ban Message Line 2") + "\n" + config.get().getString("Ban Message Line 3"));
                p.getServer().dispatchCommand(p.getServer().getConsoleSender(), "ban " + args[0]);
        }else{
            p.sendMessage(ChatColor.RED + "You cannot execute this command!");
        }
        return true;
    }
}
