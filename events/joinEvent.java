package me.catlikecake934.staffresources.events;

import me.catlikecake934.staffresources.config;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class joinEvent implements Listener {
    @EventHandler
    public void OnLoginEvent(PlayerLoginEvent e) {
        Player p = e.getPlayer();
        if (e.getResult() == PlayerLoginEvent.Result.KICK_BANNED) {
            e.setKickMessage(config.get().getString("Ban Message Line 1") + "\n" + config.get().getString("Ban Message Line 2") + "\n" + config.get().getString("Ban Message Line 3"));
            e.setResult(PlayerLoginEvent.Result.KICK_OTHER);
            return;
        }
    }
}
