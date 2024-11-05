package com.anil.mmabstractions.messages;

import com.anil.mmabstractions.contexts.IContext;
import lombok.Getter;

import java.util.UUID;

public interface IMessageContext {
    UUID getMessageId();
    IContext getContext();

}
