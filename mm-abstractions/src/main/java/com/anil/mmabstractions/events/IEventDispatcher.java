package com.anil.mmabstractions.events;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public interface IEventDispatcher {
    <T extends IEvent> CompletableFuture<Void> publishAsync(T event, AtomicBoolean cancel);
}
