package be.jflanders.weight_impl._2Business.frameworks.gui.interfaces;

import be.jflanders.weight_impl._2Business.frameworks.gui.objects.GuiItem;
import org.bukkit.event.inventory.InventoryClickEvent;

@FunctionalInterface
public interface RightClickAction extends ClickAction {
    void executeRight(GuiItem item, InventoryClickEvent event);
}
