package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Models.Auto;
import com.example.demo.Services.AutoService;

import lombok.Data;

@Component
@Data
public class DataLoader implements ApplicationRunner {

    private final AutoService autoService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        loadData();

    }


    private void loadData() {
        // TODO Auto-generated method stub
        Auto auto1 = new Auto();
        auto1.setMarke("BMW");
        auto1.setModel("M3");
        auto1.setFarbe("rot");
        auto1.setBaujahr(2017);
        autoService.addAuto(auto1);

        Auto auto2 = new Auto();
        auto2.setMarke("Volvo");
        auto2.setModel("XC90");
        auto2.setFarbe("grün");
        auto2.setBaujahr(2019);
        autoService.addAuto(auto2);

        Auto auto3 = new Auto();
        auto3.setMarke("Audi");
        auto3.setModel("A4");
        auto3.setFarbe("blau");
        auto3.setBaujahr(2018);
        autoService.addAuto(auto3);

        Auto auto4 = new Auto();
        auto4.setMarke("Mercedes");
        auto4.setModel("C63");
        auto4.setFarbe("grün");
        auto4.setBaujahr(2019);
        autoService.addAuto(auto4);
        
    }


    
}
