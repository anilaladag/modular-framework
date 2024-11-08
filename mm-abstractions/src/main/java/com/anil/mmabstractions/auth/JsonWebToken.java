package com.anil.mmabstractions.auth;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
public class JsonWebToken {
    private String accessToken;
    private long expiry;
    private UUID userId;
    private String role;
    private String email;
    private Map<String, List<String>> claims;

    public JsonWebToken() {
        claims = new HashMap<>();
    }

}

