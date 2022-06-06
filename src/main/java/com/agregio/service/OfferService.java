package com.agregio.service;

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
    private final OfferRepository offerRepository;

    public List<Offer> findAll() {
        LOGGER.debug("Selecting all the offers.");
        return offerRepository.findAll();
    }

}
