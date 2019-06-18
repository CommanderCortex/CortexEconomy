package me.cortex.Economy.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class MessageManager {

    public static void ConsoleGood(String message){
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + message);
    }

    public static void ConsoleBad(String message){
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + message);
    }

    public static void ConsoleInfo(String message){
        Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + message);
    }

    public static void Blue(String message){
        Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE + message);
    }

}
