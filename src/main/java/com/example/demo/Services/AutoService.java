package com.example.demo.Services;

import java.util.List;

import com.example.demo.Models.Auto;

public interface AutoService {

    public Auto addAuto(Auto auto);
    public void deleteAuto(Long id);
    public Auto getAuto(Long id);
    public Auto updateAuto(Long id, Auto auto);
    public List<Auto> getAllAutos();
    
}