package me.cortex.Economy.commands;

import me.cortex.Economy.CEconomy;
import me.cortex.Economy.utils.MessageManager;
import org.bson.Document;
import org.bukkit.entity.Player;

public class CreatePlayerAccountCommand {

    private CEconomy plugin = CEconomy.getPlugin();

    @Override
    public void onCommand(Player player, String[] args) {
        if (plugin.mongoConnect.getPlayerDataDocument().find(new Document("uuid", player.getUniqueId().toString())).first() == null) {
            plugin.playerManagerHashMap.put(player.getUniqueId(), new PlayerManager(player.getUniqueId().toString(), 0, 0));
            MessageManager.PlayerGood(player,"Your account has been created!");
        }else{
            MessageManager.PlayerBad(player,"Your account already exists!");
        }
    }

    @Override
    public String name() {
        return "createaccount";
    }

    @Override
    public String info() {
        return "This command is used to create a player account.";
    }

    @Override
    public String[] aliases() {
        return new String[0];
    }
}
