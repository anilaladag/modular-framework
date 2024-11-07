package com.anil.mmabstractions.events;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface IEventDispatcher {
    <T extends IEvent> CompletableFuture<Void> publishAsync(T event, ExecutorService executor);
}
