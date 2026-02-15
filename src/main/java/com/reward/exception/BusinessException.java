// src/main/java/com/reward/exception/BusinessException.java
package com.reward.exception;

public class BusinessException extends RuntimeException {
    
    public BusinessException(String message) {
        super(message);
    }
}