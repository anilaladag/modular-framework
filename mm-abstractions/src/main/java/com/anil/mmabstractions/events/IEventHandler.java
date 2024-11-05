package com.anil.mmabstractions.events;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public interface IEventHandler<T extends IEvent> {
    CompletableFuture<Void> handleAsync(T event, AtomicBoolean cancel);
}
