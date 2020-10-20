package com.rest.restfullfunctional.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TutorialNotFoundException extends RuntimeException {
    public TutorialNotFoundException(String message) {
        super(message);
    }
}
