package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Models.Auto;
import com.example.demo.Repository.AutoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class AutoServiceImpl implements AutoService {

    private final AutoRepository autoRepository;
   
    @Override
    public Auto addAuto(Auto auto) {
        return autoRepository.save(auto);
    }

    @Override
    public void deleteAuto(Long id) {
        autoRepository.deleteById(id);
    }

    @Override
    public Auto getAuto(Long id) {
        return autoRepository.findById(id).orElse(null);
    }

    @Override
    public Auto updateAuto(Long id, Auto auto) {
        Auto autoToUpdate = autoRepository.findById(id).get();
        autoToUpdate.setFarbe(auto.getFarbe());
        autoToUpdate.setBaujahr(auto.getBaujahr());
        autoToUpdate.setMarke(auto.getMarke());
        autoToUpdate.setModel(auto.getModel());
        return autoRepository.save(autoToUpdate);
    }

    @Override
    public List<Auto> getAllAutos() {
        
        return autoRepository.findAll();
    }
}
