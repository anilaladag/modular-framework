package com.anil.mmabstractions.messages;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public interface IMessageBroker {
    CompletableFuture<Void> publishAsync(IMessage message, AtomicBoolean cancel) throws CancellationException;
    CompletableFuture<Void> publishAsync(IMessage[] message, AtomicBoolean cancel) throws CancellationException;
}
