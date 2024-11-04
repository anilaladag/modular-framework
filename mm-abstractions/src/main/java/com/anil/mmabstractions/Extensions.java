package com.anil.mmabstractions;

import com.anil.mmabstractions.exceptions.runtime.InvalidOperationException;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class Extensions {

    public static String removeWhitespace(String value) {
        return (value == null || value.trim().isEmpty()) ? value : value.replaceAll("\\s+", "");
    }

    public static <T> CompletableFuture<T> notNull(CompletableFuture<T> future, Supplier<RuntimeException> exception) {
        if (future == null) {
            throw new InvalidOperationException("Future cannot be null.");
        }

        return future.thenApply(result -> {
            if (result != null) {
                return result;
            }
            if (exception != null) {
                throw exception.get();
            }
            throw new InvalidOperationException("Returned result is null.");
        });
    }
}
