package com.agregio.controller;

import com.agregio.model.Park;
import com.agregio.repository.ParkRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;

@Log
@RestController
@AllArgsConstructor
@RequestMapping(path = "/park")
public class ParkController {

    ParkRepository parkRepository;

    @PostMapping("/insert")
    public void insertPark(@RequestBody Park park) {
        parkRepository.save(park);
        log.log(Level.INFO, "Inserting park {0}.", park);
    }

}
