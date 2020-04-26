package com.ffs.api.model;

import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 *
 * @author francisco
 */
@Data
public class Order {

    @NotBlank
    private String client;
    @NotBlank
    private String message;
}
