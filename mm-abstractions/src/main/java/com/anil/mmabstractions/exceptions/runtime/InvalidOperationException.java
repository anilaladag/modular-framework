package com.anil.mmabstractions.exceptions.runtime;

import com.anil.mmabstractions.exceptions.ModularRuntimeException;

public class InvalidOperationException extends ModularRuntimeException {
    public InvalidOperationException(String message) {
        super(message);
    }
}
