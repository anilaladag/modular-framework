package com.anil.mmabstractions.queries;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public interface QueryHandler<T extends Queryable<R>, R> {
    CompletableFuture<R> handleAsync(T query, ExecutorService executor);
}

