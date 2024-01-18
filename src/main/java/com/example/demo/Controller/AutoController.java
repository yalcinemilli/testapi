package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Auto;
import com.example.demo.Services.AutoService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/autos")
public class AutoController {
    
    private final AutoService autoService;

    @PostMapping("/add")
    public Auto addAuto(Auto auto) {
        return autoService.addAuto(auto);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteAuto(Long id) {
        autoService.deleteAuto(id);
    }

    @GetMapping("/get/{id}")
    public Auto getAuto(Long id) {
        return autoService.getAuto(id);
    }

    @PutMapping("/update/{id}")
    public Auto updateAuto(Long id, Auto auto) {
        return autoService.updateAuto(id, auto);
    }

    @GetMapping("/all")
    public List<Auto> getAllAutos() {
        return autoService.getAllAutos();
    }

    
}
