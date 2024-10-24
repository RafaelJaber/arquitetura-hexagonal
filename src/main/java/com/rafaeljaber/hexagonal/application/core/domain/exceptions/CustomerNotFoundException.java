package com.rafaeljaber.hexagonal.application.core.domain.exceptions;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String id) {
        super("Customer not found with id: " + id);
    }

    public CustomerNotFoundException(String id, Throwable cause) {
        super("Customer not found with id: " + id, cause);
    }
}
