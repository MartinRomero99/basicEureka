package com.pasarmacm.meter2centimeter.service;

import org.springframework.stereotype.Service;

@Service
public class ConverterService implements IConverterService{
    @Override
    public Double convertCentimeters(Double meters) {
        return meters*100;
    }
}
