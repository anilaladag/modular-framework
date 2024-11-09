package com.anil.mmabstractions.queries;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface QueryDispatcher {
    <T> CompletableFuture<T> queryAsync(Queryable<T> query, ExecutorService executor);
}
