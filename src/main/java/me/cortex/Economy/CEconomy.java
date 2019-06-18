package me.cortex.Economy;

import me.cortex.Economy.utils.MongoConnect;
import org.bukkit.plugin.java.JavaPlugin;

public class CEconomy extends JavaPlugin {

    private static CEconomy plugin;

    public MongoConnect mongoConnect;

    @Override
    public void onEnable(){
        plugin = this;
        instanceClasses();
        mongoConnect.connect();

    }

    private void instanceClasses(){
        mongoConnect = new MongoConnect();

    }

    public static CEconomy getPlugin() {return plugin;}


}
