package com.agregio.controller;

import com.agregio.model.Offer;
import com.agregio.service.OfferService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/offer")
public class OfferController {

    private final OfferService service;

    @GetMapping("/findAll")
    public List<Offer> findAll() {
        return service.findAll();
    }

}
