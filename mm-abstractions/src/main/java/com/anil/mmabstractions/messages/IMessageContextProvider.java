package com.anil.mmabstractions.messages;

public interface IMessageContextProvider {
    IMessageContext get(IMessage message);
}
