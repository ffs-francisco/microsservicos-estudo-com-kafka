package com.ffs.consumer.model;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author francisco
 */
@Data
public class Order implements Serializable {

    private String custumer;
    private String message;
}
