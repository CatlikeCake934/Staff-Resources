package me.catlikecake934.staffresources.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class vanish implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(sender instanceof Player){
            Player p = (Player) sender;
            if (p.hasPermission("sr.vanish")) {
                p.setInvisible(true);
                p.setGameMode(GameMode.CREATIVE);
            }
        }
        return true;
    }
}
