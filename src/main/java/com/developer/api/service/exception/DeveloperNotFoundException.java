package com.developer.api.service.exception;

public class DeveloperNotFoundException extends RuntimeException {
    public DeveloperNotFoundException(String msg) {
        super(msg);
    }
}
