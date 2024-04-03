package fr.metalcraft.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class Broadcast implements CommandExecutor {
    @Override
    public boolean onCommand( CommandSender sender,  Command cmd,  String s,  String[] agrs) {
        sender.sendMessage("test");
        return false;
    }
}
