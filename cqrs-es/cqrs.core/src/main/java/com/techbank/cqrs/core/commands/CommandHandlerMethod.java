package com.techbank.cqrs.core.commands;

/**
 * Colleague class
 * @param <T>
 */
@FunctionalInterface
public interface CommandHandlerMethod <T extends BaseCommand>{
    void handle(T command);
}
