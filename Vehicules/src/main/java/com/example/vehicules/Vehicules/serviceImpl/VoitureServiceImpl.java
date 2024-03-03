package com.example.vehicules.Vehicules.serviceImpl;

import com.example.vehicules.Vehicules.models.Voiture;
import com.example.vehicules.Vehicules.repositories.VoitureRepository;
import com.example.vehicules.Vehicules.services.VoitureService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class VoitureServiceImpl implements VoitureService {
    public final VoitureRepository voitureRepository;

    public VoitureServiceImpl(VoitureRepository voitureRepository) {
        this.voitureRepository = voitureRepository;
    }

    @Override
    public Voiture create(Voiture voiture) {
        return voitureRepository.save(voiture);
    }

    @Override
    public List<Voiture> listVoiture() {
        return voitureRepository.findAll();
    }

    @Override
    public Voiture findById(Long id) {
        return voitureRepository.findById(id).get();
    }

    @Override
    public Voiture update(Voiture dataVoiture, Long id) {
        var car=voitureRepository.findById(id);
        if(car.isPresent()){
            var cars=car.get();
            cars.setMarque(dataVoiture.getMarque());
            cars.setModele(dataVoiture.getModele()) ;
            cars.setAnnee(dataVoiture.getAnnee());
            cars.setCouleur(dataVoiture.getCouleur());
            cars.setTypeDeCarburant(dataVoiture.getTypeDeCarburant());
            cars.setPrix(dataVoiture.getPrix());
            return voitureRepository.save(cars);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
     voitureRepository.deleteById(id);
    }
}
