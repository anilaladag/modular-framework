package com.anil.mmabstractions.contexts;

import java.util.UUID;

public interface IContext {

    UUID getRequestId();

    UUID getCorrelationId();

    String getTraceId();

    String getIpAddress();

    String getUserAgent();

    IIdentityContext getIdentity();
}
