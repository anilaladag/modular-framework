package com.anil.mmabstractions.kernel;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface IDomainEventDispatcher {

    CompletableFuture<Void> dispatchAsync(IDomainEvent event, ExecutorService executor);

    CompletableFuture<Void> dispatchAsync(IDomainEvent[] events, ExecutorService executor);
}


    
