package com.portfolio.devstore_backend.Exceptions.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.io.Serial;
import java.time.Instant;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class StandardError implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Instant timestamp;

    private Integer status;

    private String error;

    private String message;

    private String path;
}
