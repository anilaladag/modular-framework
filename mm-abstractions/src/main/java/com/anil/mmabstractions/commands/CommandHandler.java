package com.anil.mmabstractions.commands;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface CommandHandler<T extends Command> {
    CompletableFuture<Void> handleAsync(T command, ExecutorService executor);
}
