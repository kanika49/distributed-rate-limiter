package com.example.ratelimiter;

public class MainApplication {

    public static void main(String[] args) throws InterruptedException {

        RateLimiter limiter = new RateLimiter();
        String user = "user-123";

        System.out.println("Sending requests for user: " + user);

        for (int i = 1; i <= 7; i++) {
            boolean allowed = limiter.isRequestAllowed(user);
            System.out.println("Request " + i + " → " +
                    (allowed ? "ALLOWED ✅" : "BLOCKED ❌"));
            Thread.sleep(500);
        }
    }
}

