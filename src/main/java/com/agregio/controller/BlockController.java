package com.agregio.controller;

import com.agregio.model.Block;
import com.agregio.model.BlockInfo;
import com.agregio.service.BlockService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/block")
public class BlockController {

    private final BlockService service;

    @GetMapping("getInfo/{id}")
    public List<BlockInfo> getBlockInfo(@PathVariable Long id) {
        return service.getBlockInfo(id);
    }

    @GetMapping("getFreeBlocks")
    public List<Block> getFreeBlocks() {
        return service.getFreeBlocks();
    }



}
