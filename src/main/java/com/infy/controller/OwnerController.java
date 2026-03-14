package com.infy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerController {

    @GetMapping("/owner")
    public String getOwner() {
        return "Pet owner....";
    }
}
