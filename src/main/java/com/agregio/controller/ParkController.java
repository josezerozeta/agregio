package com.agregio.controller;

import com.agregio.model.Park;
import com.agregio.service.ParkService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/park")
public class ParkController {

    private final ParkService service;

    @PostMapping("/insert")
    public void insertPark(@RequestBody Park park) {
        service.insert(park);
    }

}
