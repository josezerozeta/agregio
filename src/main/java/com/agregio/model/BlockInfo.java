package com.agregio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlockInfo {

    private Long blockId;
    private Double limitPrice;
    private String parkName;
    private String parkType;

}
