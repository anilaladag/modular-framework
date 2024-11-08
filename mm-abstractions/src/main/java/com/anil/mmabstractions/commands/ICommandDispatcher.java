package com.anil.mmabstractions.commands;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface ICommandDispatcher<T extends ICommand> {
    CompletableFuture<Void> publishAsync(T command, ExecutorService executor);

}
