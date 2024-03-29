package me.cortex.Economy.commands.manager;

import me.cortex.Economy.CEconomy;
import me.cortex.Economy.commands.CreatePlayerAccountCommand;
import me.cortex.Economy.utils.MessageManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;

public class CommandManager implements CommandExecutor {

    private ArrayList<SubCommand> commands = new ArrayList<SubCommand>();
    private CEconomy plugin = CEconomy.getPlugin();

    //Sub Commands
    private String main = "CEonomy";

    public void setup() {
        plugin.getCommand(main).setExecutor(this);
        this.commands.add(new CreatePlayerAccountCommand());
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase(main)) {
                if (args.length == 0) {
                    MessageManager.PlayerInfo(player, "Please Make sure you have Arguments. If unsure please type /" + main + " help");
                    return true;
                }

                SubCommand target = this.get(args[0]);
                if (target == null) {
                    MessageManager.PlayerBad(player, "/" + main + " " + args[0] + " is not a valid subcommand!");
                    return true;
                }

                ArrayList<String> a = new ArrayList<String>();
                a.addAll(Arrays.asList(args));
                a.remove(0);
                args = a.toArray(new String[a.size()]);

                try {
                    target.onCommand(player, args);
                } catch (Exception var9) {
                    MessageManager.PlayerBad(player, "An error has occured: " + var9.getCause());
                    var9.printStackTrace();
                }
            }

        }
        return true;

    }

    private SubCommand get(String name) {

        for (SubCommand cmd : this.commands) {
            if (cmd.name().equalsIgnoreCase(name)) {
                return cmd;
            }

            String[] var1;
            int var6 = (var1 = cmd.aliases()).length;

            for (int var5 = 0; var5 < var6; ++var5) {
                String alias = var1[var5];
                if (name.equalsIgnoreCase(alias)) {
                    return cmd;
                }
            }
        }

        return null;
    }
}
