package com.anil.mminfrastructure.storage;

import com.anil.mmabstractions.storage.RequestStorage;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class RequestStorageImpl implements RequestStorage {

    private final Cache<String, CacheItem> cache;

    public RequestStorageImpl(long defaultTtlInSeconds) {
        this.cache = Caffeine.newBuilder()
                .expireAfterWrite(defaultTtlInSeconds, TimeUnit.SECONDS)
                .maximumSize(100)
                .build();
    }

    @Override
    public <T> void set(String key, T value, Duration duration) {
        CacheItem item = new CacheItem(value, duration != null ? duration : Duration.ofSeconds(5));
        cache.put(key, item);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> Optional<T> get(String key) {
        CacheItem item = cache.getIfPresent(key);
        if (item == null || item.isExpired()) {
            cache.invalidate(key);
            return Optional.empty();
        }

        return Optional.ofNullable((T) item.getValue());
    }

    @Override
    public void remove(String key) {
        cache.invalidate(key);
    }

    private static class CacheItem {
        private final Object value;
        private final Instant expiryTime;

        public CacheItem(Object value, Duration duration) {
            this.value = value;
            this.expiryTime = Instant.now().plus(duration);
        }

        public Object getValue() {
            return value;
        }

        public boolean isExpired() {
            return Instant.now().isAfter(expiryTime);
        }
    }
}
