package com.anil.mmabstractions.messages;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface MessageBroker {
    CompletableFuture<Void> publishAsync(Message message, ExecutorService executor);

    CompletableFuture<Void> publishAsync(Message[] message, ExecutorService executor);
}
