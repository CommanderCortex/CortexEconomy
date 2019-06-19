package me.cortex.Economy.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

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

   public static void PlayerGood(Player p, String message){
        p.sendMessage(ChatColor.GREEN + message);
   }
   public static void PlayerBad(Player p, String message){
        p.sendMessage(ChatColor.RED + message);
    }
    public static void PlayerInfo(Player p, String message){
        p.sendMessage(ChatColor.YELLOW + message);
    }

}
