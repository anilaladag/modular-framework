package com.anil.mmabstractions.messages;

import com.anil.mmabstractions.contexts.Context;

import java.util.UUID;

public interface MessageContext {
    UUID getMessageId();
    Context getContext();

}
