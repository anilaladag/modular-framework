package com.anil.mmabstractions.events;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface EventDispatcher {
    <T extends Event> CompletableFuture<Void> publishAsync(T event, ExecutorService executor);
}
