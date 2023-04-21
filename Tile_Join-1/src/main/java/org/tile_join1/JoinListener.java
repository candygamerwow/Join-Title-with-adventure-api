package org.tile_join1;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.HashSet;
import java.util.Set;
public class JoinListener implements Listener{
    private final Set<String> welcomedPlayers = new HashSet<>();

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if (!welcomedPlayers.contains(player.getUniqueId().toString())) {
            welcomedPlayers.add(player.getUniqueId().toString());

            Component mainTitle = Component.text("Hello", NamedTextColor.RED);
            Component subTitle = Component.text("Welcome to the server!", NamedTextColor.GREEN);

            player.showTitle(net.kyori.adventure.title.Title.title(mainTitle, subTitle));
        }
    }
}
