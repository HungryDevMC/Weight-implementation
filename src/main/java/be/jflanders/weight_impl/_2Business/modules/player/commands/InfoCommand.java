package be.jflanders.weight_impl._2Business.modules.player.commands;

import be.jflanders.weight_impl._2Business.frameworks.registry.AbstractCommand;
import be.jflanders.weight_impl._2Business.modules.player.gui.ItemInfoGui;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.PreCommand;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

@CommandAlias("weight|wght")
public class InfoCommand extends AbstractCommand {

    @PreCommand
    public boolean preCommand(CommandSender sender, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        return true;
    }

    @Default
    public void onInfo(Player sender) {
        ItemStack inHand = sender.getInventory().getItemInMainHand();
        sender.sendMessage("You're holding -> " + inHand.toString());
        ItemInfoGui itemInfoGui = new ItemInfoGui(inHand);
        sender.openInventory(itemInfoGui.getInventory());
    }

    @Subcommand("all")
    public void all(Player sender, int number, EnumTest enumTest) {
        sender.sendMessage("all");
    }

}
