package com.example.ratelimiter;

public class TokenBucket {

    private int tokens;
    private final int capacity;

    public TokenBucket(int capacity) {
        this.capacity = capacity;
        this.tokens = capacity;
    }

    public synchronized boolean allowRequest() {
        if (tokens > 0) {
            tokens--;
            return true;
        }
        return false;
    }

    public synchronized void refill() {
        tokens = capacity;
    }
}
