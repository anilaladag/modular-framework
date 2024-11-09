package com.anil.mmabstractions.commands;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface CommandDispatcher<T extends Command> {
    CompletableFuture<Void> publishAsync(T command, ExecutorService executor);

}
