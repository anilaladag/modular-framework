package com.anil.mmabstractions.contracts;


import java.util.Set;

public interface Contract {
    Class<?> getType();

    Set<String> getRequired();
}

