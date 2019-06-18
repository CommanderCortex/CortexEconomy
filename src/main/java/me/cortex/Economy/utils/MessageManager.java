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

    public static void Red(String message){
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + message);
    }

    public static void Gold(String message){
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + message);
    }

    public static void DarkRed(String message){
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED + message);
    }

    public static void Bold(String message){
        Bukkit.getConsoleSender().sendMessage(ChatColor.BOLD + message);
    }

}
