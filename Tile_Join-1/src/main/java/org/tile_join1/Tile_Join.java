package org.tile_join1;

import org.bukkit.plugin.java.JavaPlugin;

public final class Tile_Join extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JoinListener(), this);
    }
}
