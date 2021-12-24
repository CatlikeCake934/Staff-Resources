package me.catlikecake934.staffresources.commands;

import me.catlikecake934.staffresources.config;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class adminChat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            Player p = (Player) sender;
            if (p.hasPermission("sr.adminchat")) {
                if (args.length >= 1) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < args.length; i++) {
                        sb.append(args[i] + " ");
                    }
                    Bukkit.broadcast(config.get().getString("Admin Chat Prefix") + p.getName() + ": " + ChatColor.WHITE + sb.toString().stripTrailing(), "sr.chat");
                }
            }else{
                p.sendMessage(ChatColor.RED + "You cannot execute this command!");
            }
        }
        return true;
    }
}
