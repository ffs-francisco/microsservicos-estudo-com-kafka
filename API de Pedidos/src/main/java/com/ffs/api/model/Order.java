package com.ffs.api.model;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 *
 * @author francisco
 */
@Data
public class Order implements Serializable {

    @NotBlank
    private String custumer;

    @NotBlank
    private String message;
}
