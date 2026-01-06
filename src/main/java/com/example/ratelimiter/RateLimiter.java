package com.example.ratelimiter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RateLimiter {

    private final Map<String, TokenBucket> userBuckets = new ConcurrentHashMap<>();

    public boolean isRequestAllowed(String userId) {
        userBuckets.putIfAbsent(userId, new TokenBucket(5));
        return userBuckets.get(userId).allowRequest();
    }
}

