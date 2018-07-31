package com.higgsup.controller;

import com.higgsup.service.ISetupDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("setups")
public class SetupDemo {
    @Autowired
    ISetupDemoService setupDemoService;

    // insert data for brand table
    @PostMapping(value = "/brand-data")
    public String addBrandData() {
        setupDemoService.insertDataForBrand();
        return "SUCCESS";
    }
}
