package com.anil.mmabstractions.kernel;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface DomainEventDispatcher {

    CompletableFuture<Void> dispatchAsync(DomainEvent event, ExecutorService executor);

    CompletableFuture<Void> dispatchAsync(DomainEvent[] events, ExecutorService executor);
}


    
