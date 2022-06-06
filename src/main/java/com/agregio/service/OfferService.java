package com.agregio.service;

import com.agregio.model.Block;
import com.agregio.model.BlockInfo;
import com.agregio.model.Offer;
import com.agregio.repository.OfferRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OfferService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OfferService.class);
    private final OfferRepository repository;

    public List<Offer> findAll() {
        LOGGER.debug("Selecting all the offers.");
        return repository.findAll();
    }

    public List<Long> getBlocks(Long offerId) {
        LOGGER.debug("Searching for all the blocks with offerId: {}", offerId);
        return repository.getBlocks(offerId);
    }

    public List<BlockInfo> getBlocksInfo(Long offerId) {
        List<Long> blocks = this.getBlocks(offerId);
        LOGGER.debug("Searching information for all the blocks with offerId {}", offerId);
        return repository.getBlocksInfo(blocks);
    }

    public List<Block> getFreeBlocks() {
        return repository.getFreeBlocks();
    }

}
