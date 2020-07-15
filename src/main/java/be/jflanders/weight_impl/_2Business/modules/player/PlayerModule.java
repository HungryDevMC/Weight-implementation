package be.jflanders.weight_impl._2Business.modules.player;

import be.jflanders.weight_impl.WeightPlugin;
import be.jflanders.weight_impl._2Business.frameworks.registry.AbstractModule;
import be.jflanders.weight_impl._2Business.frameworks.registry.enums.LogType;

public class PlayerModule extends AbstractModule {

    @Override
    public void onLoad() {
        WeightPlugin.getInstance().log(LogType.INFO, "Loading player module");
    }
}
