package be.jflanders.weight_impl._2Business.frameworks.gui.interfaces;

import be.jflanders.weight_impl._2Business.frameworks.gui.objects.GuiItem;
import org.bukkit.event.inventory.InventoryClickEvent;

@FunctionalInterface
public interface LeftClickAction extends ClickAction {
    void executeLeft(GuiItem item, InventoryClickEvent event);
}
