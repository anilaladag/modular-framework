package com.anil.mmabstractions.kernel;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface IDomainEventHandler<T extends IDomainEvent> {
    CompletableFuture<Void> handleAsync(T event, ExecutorService executor);
}
