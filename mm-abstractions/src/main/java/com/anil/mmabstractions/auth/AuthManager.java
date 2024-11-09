package com.anil.mmabstractions.auth;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface AuthManager {

    JsonWebToken createToken(UUID userId, String role, String audience, Map<String, List<String>> claims);

    default JsonWebToken createToken(UUID userId) {
        return createToken(userId, null, null, null);
    }

    default JsonWebToken createToken(UUID userId, String role) {
        return createToken(userId, role, null, null);
    }

    default JsonWebToken createToken(UUID userId, String role, String audience) {
        return createToken(userId, role, audience, null);
    }
}
