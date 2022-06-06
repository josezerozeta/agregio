package com.agregio.service;

import com.agregio.model.Block;
import com.agregio.model.BlockInfo;
import com.agregio.repository.BlockRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlockService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlockService.class);
    private final BlockRepository repository;

    public List<Long> getBlocks(Long offerId) {
        LOGGER.debug("Searching for all the blocks with offerId: {}", offerId);
        return repository.getBlocks(offerId);
    }

    public List<BlockInfo> getBlockInfo(Long offerId) {
        List<Long> blocks = repository.getBlocks(offerId);
        LOGGER.debug("Searching information for all the blocks with offerId {}", offerId);
        return repository.getBlockInfo(blocks);
    }

    public List<Block> getFreeBlocks() {
        return repository.getFreeBlocks();
    }

}
