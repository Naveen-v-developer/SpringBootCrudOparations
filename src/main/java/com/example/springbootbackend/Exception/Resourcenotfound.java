package com.example.springbootbackend.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class Resourcenotfound extends RuntimeException{

    public Resourcenotfound(String msg) {
        super(msg);
    }
}
