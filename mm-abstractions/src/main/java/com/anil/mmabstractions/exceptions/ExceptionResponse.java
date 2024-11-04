package com.anil.mmabstractions.exceptions;

import org.springframework.http.HttpStatus;

public record ExceptionResponse(Object response, HttpStatus statusCode) {
    public ExceptionResponse(Object response, HttpStatus statusCode) {
        this.response = response;
        this.statusCode = statusCode;
    }
}
