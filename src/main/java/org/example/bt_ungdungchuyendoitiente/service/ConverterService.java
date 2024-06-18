package org.example.bt_ungdungchuyendoitiente.service;

import org.springframework.stereotype.Service;

@Service
public class ConverterService implements IConverterService{
    public double convertVND(Double money){
        return money*25000;
    }
}
