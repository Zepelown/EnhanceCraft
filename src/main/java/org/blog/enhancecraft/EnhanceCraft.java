package org.blog.enhancecraft;

import org.bukkit.plugin.java.JavaPlugin;

public final class EnhanceCraft extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("플러그인 시작 테스트");
        //
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("플러그인 종료 테스트");
    }
}
