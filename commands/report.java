package me.catlikecake934.staffresources.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class report implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player){
            Player p = (Player) sender;
            if (args.length >= 2){
                StringBuilder sb = new StringBuilder();
                for(int i = 1; i < args.length; i++){
                    sb.append(args[i] + " ");
                }
                Bukkit.broadcast(ChatColor.RED + "" + ChatColor.BOLD + "Report by " + p.getName() + ": " + args[0] + " for " + "\"" + sb.toString().stripTrailing() + "\"", "sr.report");
            }
        }
        return true;
    }
}


