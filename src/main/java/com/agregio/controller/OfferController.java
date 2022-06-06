package com.agregio.controller;

import com.agregio.model.Block;
import com.agregio.model.BlockInfo;
import com.agregio.model.Offer;
import com.agregio.model.OfferRequest;
import com.agregio.service.OfferService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/offer")
public class OfferController {

    private final OfferService service;

    @GetMapping("/findAllOffers")
    public List<Offer> findAllOffers() {
        return service.findAll();
    }

    @GetMapping("getBlocksInfo/{offerId}")
    public List<BlockInfo> getBlocksInfo(@PathVariable Long offerId) {
        return service.getBlocksInfo(offerId);
    }

    @GetMapping("getFreeBlocks")
    public List<Block> getFreeBlocks() {
        return service.getFreeBlocks();
    }

    @PostMapping("/create")
    public Offer createOffer(@RequestBody OfferRequest request) {
        List<Block> freeBlock = service.getFreeBlocks();
        // TODO : Implement an algorithm to create an offer
        return null;
    }

}
