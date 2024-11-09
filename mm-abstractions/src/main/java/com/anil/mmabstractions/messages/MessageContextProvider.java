package com.anil.mmabstractions.messages;

public interface MessageContextProvider {
    MessageContext get(Message message);
}
