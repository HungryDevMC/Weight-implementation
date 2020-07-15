package be.jflanders.weight_impl;

import be.jflanders.weight_impl._2Business.frameworks.registry.AbstractModule;
import be.jflanders.weight_impl._2Business.frameworks.registry.AbstractPlugin;
import be.jflanders.weight_impl._2Business.modules.player.PlayerModule;

import java.util.Arrays;
import java.util.List;

public class WeightPlugin extends AbstractPlugin {

    @Override
    protected List<Class<? extends AbstractModule>> getModules() {
        return Arrays.asList(
                PlayerModule.class
        );
    }

    @Override
    protected String getPrefix() {
        return "[WEIGHT-IMPL]";
    }
}
