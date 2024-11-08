package com.anil.mmabstractions.events;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface IEventHandler<T extends IEvent> {
    CompletableFuture<Void> handleAsync(T event, ExecutorService executor);
}
