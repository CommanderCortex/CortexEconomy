package me.cortex.Economy;


import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.OfflinePlayer;

import java.util.List;

public class EconomyCore implements Economy {


    public boolean isEnabled() {
        return false;
    }

    public String getName() {
        return null;
    }

    public boolean hasBankSupport() {
        return false;
    }

    public int fractionalDigits() {
        return 0;
    }

    public String format(double v) {
        return null;
    }

    public String currencyNamePlural() {
        return null;
    }

    public String currencyNameSingular() {
        return null;
    }

    public boolean hasAccount(String s) {
        return false;
    }

    public boolean hasAccount(OfflinePlayer offlinePlayer) {
        return false;
    }

    public boolean hasAccount(String s, String s1) {
        return false;
    }

    public boolean hasAccount(OfflinePlayer offlinePlayer, String s) {
        return false;
    }

    public double getBalance(String s) {
        return 0;
    }

    public double getBalance(OfflinePlayer offlinePlayer) {
        return 0;
    }

    public double getBalance(String s, String s1) {
        return 0;
    }

    public double getBalance(OfflinePlayer offlinePlayer, String s) {
        return 0;
    }

    public boolean has(String s, double v) {
        return false;
    }

    public boolean has(OfflinePlayer offlinePlayer, double v) {
        return false;
    }

    public boolean has(String s, String s1, double v) {
        return false;
    }

    public boolean has(OfflinePlayer offlinePlayer, String s, double v) {
        return false;
    }

    public EconomyResponse withdrawPlayer(String s, double v) {
        return null;
    }

    public EconomyResponse withdrawPlayer(OfflinePlayer offlinePlayer, double v) {
        return null;
    }

    public EconomyResponse withdrawPlayer(String s, String s1, double v) {
        return null;
    }

    public EconomyResponse withdrawPlayer(OfflinePlayer offlinePlayer, String s, double v) {
        return null;
    }

    public EconomyResponse depositPlayer(String s, double v) {
        return null;
    }

    public EconomyResponse depositPlayer(OfflinePlayer offlinePlayer, double v) {
        return null;
    }

    public EconomyResponse depositPlayer(String s, String s1, double v) {
        return null;
    }

    public EconomyResponse depositPlayer(OfflinePlayer offlinePlayer, String s, double v) {
        return null;
    }

    public EconomyResponse createBank(String s, String s1) {
        return null;
    }

    public EconomyResponse createBank(String s, OfflinePlayer offlinePlayer) {
        return null;
    }

    public EconomyResponse deleteBank(String s) {
        return null;
    }

    public EconomyResponse bankBalance(String s) {
        return null;
    }

    public EconomyResponse bankHas(String s, double v) {
        return null;
    }

    public EconomyResponse bankWithdraw(String s, double v) {
        return null;
    }

    public EconomyResponse bankDeposit(String s, double v) {
        return null;
    }

    public EconomyResponse isBankOwner(String s, String s1) {
        return null;
    }

    public EconomyResponse isBankOwner(String s, OfflinePlayer offlinePlayer) {
        return null;
    }

    public EconomyResponse isBankMember(String s, String s1) {
        return null;
    }

    public EconomyResponse isBankMember(String s, OfflinePlayer offlinePlayer) {
        return null;
    }

    public List<String> getBanks() {
        return null;
    }

    public boolean createPlayerAccount(String s) {
        return false;
    }

    public boolean createPlayerAccount(OfflinePlayer offlinePlayer) {
        return false;
    }

    public boolean createPlayerAccount(String s, String s1) {
        return false;
    }

    public boolean createPlayerAccount(OfflinePlayer offlinePlayer, String s) {
        return false;
    }
}
