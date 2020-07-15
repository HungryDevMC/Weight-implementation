package be.jflanders.weight_impl._2Business.modules.player.gui;

import be.jflanders.weight_impl._2Business.frameworks.gui.objects.Gui;
import be.jflanders.weight_impl._2Business.frameworks.gui.objects.GuiItem;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class ItemInfoGui extends Gui {

    private ItemStack itemStack;

    public ItemInfoGui(ItemStack item) {
        super(InventoryType.HOPPER, "Item info");
        this.itemStack = item;
        addItem(itemObject(), 2);
    }

    public GuiItem itemObject() {
        return GuiItem.create()
                .material(itemStack.getType())
                .amount(1)
                .displayName("Item -> " + itemStack.getItemMeta().getDisplayName())
                .lore(Arrays.asList(
                        "Item density -> 0.0"
                ))
                .leftClickAction((item, event) -> {
                    event.getWhoClicked().sendMessage("You clicked this item");
                    event.getWhoClicked().closeInventory();
                })
                .build();
    }

}
