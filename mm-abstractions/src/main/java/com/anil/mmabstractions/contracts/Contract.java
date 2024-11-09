package com.anil.mmabstractions.contracts;

import java.util.Collection;

public interface Contract {
    Class<?> getType();

    Collection<String> getRequired();
}
