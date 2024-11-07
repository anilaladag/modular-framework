package com.anil.mmabstractions.messages;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface IMessageBroker {
    CompletableFuture<Void> publishAsync(IMessage message, ExecutorService executor);

    CompletableFuture<Void> publishAsync(IMessage[] message, ExecutorService executor);
}
