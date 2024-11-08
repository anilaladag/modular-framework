package com.anil.mmabstractions.commands;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface ICommandHandler<T extends ICommand> {
    CompletableFuture<Void> handleAsync(T command, ExecutorService executor);
}
