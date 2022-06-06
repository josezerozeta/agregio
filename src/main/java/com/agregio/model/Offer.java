package com.agregio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Offer")
@Table(name = "offer")
public class Offer {

    @Id
    @SequenceGenerator(
            name = "offer_sequence",
            sequenceName = "offer_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "offer_sequence")
    @Column(name = "offerId")
    private Long offerId;
    @Column(
            name = "limitPrice",
            nullable = false)
    private Double limitPrice;

    @OneToMany(
            targetEntity = Block.class,
            fetch = FetchType.LAZY)
    @JoinColumn(
            name="offerId",
            foreignKey=@ForeignKey(name = "Fk_offer_block")
    )
    private List<Block> blocks;
}
