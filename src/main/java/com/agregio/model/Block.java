package com.agregio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Block")
@Table(name = "block")
public class Block {

    @Id
    @SequenceGenerator(
            name = "block_sequence",
            sequenceName = "block_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "block_sequence")
    @Column(name = "blockId")
    private Long blockId;
    @Column(
            name = "limitPrice",
            nullable = false)
    private Double limitPrice;
    @Column(
            name = "startTime",
            nullable = false)
    private Time startTime;
    @Column(
            name = "endTime",
            nullable = false)
    private Time endTime;

}
