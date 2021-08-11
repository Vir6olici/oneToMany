package com.example.demo.controller;

import com.example.demo.domain.Item;
import com.example.demo.repository.ItemRepository;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping
    public List<Item> getAll(){
     return itemService.getAll();
    }

    @PostMapping("/insert")
    public Item insert (@RequestBody Item item){
        return  itemService.save(item);
    }
}
