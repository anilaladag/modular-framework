package com.anil.mmabstractions.storage;

import java.time.Duration;

public interface IRequestStorage {

    <T> void set(String key, T value, Duration duration);

    <T> T get(String key);
}
