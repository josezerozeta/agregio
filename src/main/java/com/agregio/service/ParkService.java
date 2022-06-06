package com.agregio.service;

import com.agregio.model.Park;
import com.agregio.repository.ParkRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ParkService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ParkService.class);
    private final ParkRepository repository;

    public void insert(Park park) {
        repository.save(park);
        LOGGER.debug("Inserting park {}.", park);
    }

}
