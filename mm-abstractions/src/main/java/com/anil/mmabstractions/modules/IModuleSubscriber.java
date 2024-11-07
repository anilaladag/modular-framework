package com.anil.mmabstractions.modules;

import com.anil.mmabstractions.exceptions.ModularException;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface IModuleSubscriber {
    <T, R> IModuleSubscriber subscribe(String path,
                                                      TriFunction<T, ExecutorService, CompletableFuture<R>> action,
                                                      Class<T> requestType,
                                                      Class<R> responseType);

    @FunctionalInterface
    interface TriFunction<T, U, R> {
        R apply(T t, U u, CompletableFuture<R> future) throws ModularException;
    }
}
