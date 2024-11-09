package com.anil.mmabstractions.kernel;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface DomainEventHandler<T extends DomainEvent> {
    CompletableFuture<Void> handleAsync(T event, ExecutorService executor);
}
