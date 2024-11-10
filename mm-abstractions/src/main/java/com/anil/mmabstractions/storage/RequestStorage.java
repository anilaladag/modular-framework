package com.anil.mmabstractions.storage;

import java.time.Duration;
import java.util.Optional;

public interface RequestStorage {

    <T> void set(String key, T value, Duration duration);

    <T> Optional<T> get(String key);

    void remove(String key);
}
