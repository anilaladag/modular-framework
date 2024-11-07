package com.anil.mmabstractions.modules;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface IModuleClient {

    CompletableFuture<Void> sendAsync(String path, Object request, ExecutorService executor);

    <T> CompletableFuture<T> sendAsync(String path, Object request, Class<T> resultType, ExecutorService executor);

    CompletableFuture<Void> publishAsync(Object message, ExecutorService executor);
}
