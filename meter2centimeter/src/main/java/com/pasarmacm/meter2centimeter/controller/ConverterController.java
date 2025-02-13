package com.pasarmacm.meter2centimeter.controller;

import com.pasarmacm.meter2centimeter.service.IConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/converter")
public class ConverterController {
    @Autowired
    private IConverterService converterService;

    @GetMapping("/meters/{meters}")
    public Double convertSentimeters (@PathVariable Double meters){
        return converterService.convertCentimeters(meters);
    }
}
