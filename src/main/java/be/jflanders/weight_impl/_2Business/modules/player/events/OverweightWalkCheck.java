package be.jflanders.weight_impl._2Business.modules.player.events;

import be.jflanders.weight_impl._2Business.frameworks.registry.AbstractListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;

public class OverweightWalkCheck extends AbstractListener {

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        e.getPlayer().sendMessage("Checking weight");
    }

}
