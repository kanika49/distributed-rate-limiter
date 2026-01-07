# Distributed Rate Limiter & API Gateway

## Overview
A Java-based rate limiting system implementing the Token Bucket algorithm
to control API traffic and prevent request bursts.

## Tech Stack
- Java
- ConcurrentHashMap
- Token Bucket Algorithm

## Design
- Each user is assigned a token bucket
- Requests consume tokens
- Excess requests are blocked
- Thread-safe for concurrent access

## Features
- Token bucket rate limiting
- Thread-safe request handling
- Simulates API gateway behavior

## How to Run
1. Compile all Java files
2. Run MainApplication.java


