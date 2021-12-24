package me.catlikecake934.stafffunctions.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class staffChat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            Player p = (Player) sender;
            if (p.hasPermission("sr.chat")) {
                if (args.length >= 1) {
                    String message;
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < args.length; i++) {
                        sb.append(args[i] + " ");
                    }
                    Bukkit.broadcast(ChatColor.RED + "" + ChatColor.BOLD + "[Staff Chat] " + p.getName() + ": " + ChatColor.WHITE + sb.toString().stripTrailing(), "sr.chat");
                }
            }else{
                p.sendMessage(ChatColor.RED + "You cannot execute this command!");
            }
        }
        return true;
    }
}
