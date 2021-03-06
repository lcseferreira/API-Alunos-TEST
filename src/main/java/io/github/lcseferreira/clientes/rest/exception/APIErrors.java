package io.github.lcseferreira.clientes.rest.exception;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class APIErrors {

    @Getter
    private List<String> errors;

    public APIErrors(List<String> errors) {
        this.errors = errors;
    }

    public APIErrors(String message) {
        this.errors = Arrays.asList(message);
    }
}
