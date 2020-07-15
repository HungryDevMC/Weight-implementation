package be.jflanders.weight_impl._2Business.frameworks.registry.interfaces;

import be.jflanders.weight_impl._2Business.frameworks.registry.enums.LogType;

public interface Loggable {
    void log(LogType logType, String message);
}
