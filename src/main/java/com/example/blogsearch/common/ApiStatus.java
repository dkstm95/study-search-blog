package com.example.blogsearch.common;

import lombok.Getter;

@Getter
public enum ApiStatus {

    OK(200, "success"),
    BAD_REQUEST(400, "bad request"),
    ;

    private final int code;

    private final String message;

    ApiStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
