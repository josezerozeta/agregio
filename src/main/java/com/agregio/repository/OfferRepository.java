package com.agregio.repository;

import com.agregio.model.Block;
import com.agregio.model.BlockInfo;
import com.agregio.model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OfferRepository extends JpaRepository<Offer, Long> {

    @Query("select b.blockId\n " +
            "from Offer o inner join o.blocks b\n" +
            "where o.offerId = :offerId")
    List<Long> getBlocks(@Param("offerId") Long offerId);

    @Query("select \n" +
            "    new com.agregio.model.BlockInfo(" +
            "    b.blockId, b.limitPrice,\n" +
            "    p.parkName, p.parkType)\n" +
            "from Park p inner join p.blocks b\n" +
            "where b.blockId in :ids")
    List<BlockInfo> getBlocksInfo(@Param("ids") List<Long> ids);

    @Query("select b\n" +
            "from Offer o right join o.blocks b\n" +
            "where o.offerId is null")
    List<Block> getFreeBlocks();

}
