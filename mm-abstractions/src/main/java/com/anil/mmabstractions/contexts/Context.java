package com.anil.mmabstractions.contexts;

import java.util.UUID;

public interface Context {

    UUID getRequestId();

    UUID getCorrelationId();

    String getTraceId();

    String getIpAddress();

    String getUserAgent();

    IdentityContext getIdentity();
}
