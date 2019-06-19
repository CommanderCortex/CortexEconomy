package me.cortex.Economy.commands.manager;

import org.bukkit.entity.Player;

public class SubCommand {


    public SubCommand() {
    }

    public abstract void onCommand(Player player, String[] args);

    public abstract String name();

    public abstract String info();

    public abstract String[] aliases();
}
