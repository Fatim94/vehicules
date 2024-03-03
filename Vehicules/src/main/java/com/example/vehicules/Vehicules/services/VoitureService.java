package com.example.vehicules.Vehicules.services;

import com.example.vehicules.Vehicules.models.Voiture;

import java.util.List;

public interface VoitureService {
    Voiture create(Voiture voiture);
    List<Voiture> listVoiture();
    Voiture findById(Long id);
    Voiture update(Voiture dataVoiture,Long id);
    void delete(Long id);
}
