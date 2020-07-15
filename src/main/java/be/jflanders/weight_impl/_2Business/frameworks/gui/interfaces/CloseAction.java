package be.jflanders.weight_impl._2Business.frameworks.gui.interfaces;

import org.bukkit.event.inventory.InventoryCloseEvent;

@FunctionalInterface
public interface CloseAction extends ClickAction {
    void executeOnClose(InventoryCloseEvent inventoryCloseEvent);
}
