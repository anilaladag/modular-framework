package com.anil.mmabstractions.events;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface EventHandler<T extends Event> {
    CompletableFuture<Void> handleAsync(T event, ExecutorService executor);
}
