package com.anil.mmabstractions.contexts;

import java.util.Map;
import java.util.UUID;

public interface IdentityContext {

    boolean isAuthenticated();

    UUID getId();

    String getRole();

    Map<String, Iterable<String>> getClaims();
}
