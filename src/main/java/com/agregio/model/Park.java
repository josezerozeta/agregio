package com.agregio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Park")
@Table(
        name = "park",
        uniqueConstraints = {
                @UniqueConstraint(name = "park_name_unique", columnNames = "parkName")
        }
)
public class Park {

    @Id
    @SequenceGenerator(
            name = "park_sequence",
            sequenceName = "park_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "park_sequence")
    @Column(name = "parkId")
    private Long parkId;
    @Column(
            name = "parkName",
            nullable = false,
            columnDefinition = "TEXT")
    private String parkName;
    @Column(
            name = "parkType",
            nullable = false,
            columnDefinition = "TEXT")
    private String parkType;

    @OneToMany(
            targetEntity = Block.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    @JoinColumn(
            name="parkId",
            nullable = false,
            foreignKey=@ForeignKey(name = "Fk_block_park")
    )
    private List<Block> blocks;

}

