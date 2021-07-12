package com.scaler.splitwise.exceptions.validations;

import com.scaler.splitwise.exceptions.SplitwiseException;

public class DuplicateUsernameException extends SplitwiseException {
    public DuplicateUsernameException(String message) {
        super(message);
    }
}
