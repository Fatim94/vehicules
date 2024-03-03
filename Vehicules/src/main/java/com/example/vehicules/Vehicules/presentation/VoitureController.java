package com.example.vehicules.Vehicules.presentation;

import com.example.vehicules.Vehicules.models.Voiture;
import com.example.vehicules.Vehicules.services.VoitureService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path ="api/voiture/")
public class VoitureController {
    public final VoitureService voitureService;

    public VoitureController(VoitureService voitureService) {
        this.voitureService = voitureService;
    }
    @PostMapping(path = "create",name="create")
    @ResponseStatus(HttpStatus.CREATED)
    public Voiture create(@RequestBody Voiture voiture){
        return voitureService.create(voiture);
    }
    @GetMapping(path="read" ,name ="read")
    @ResponseStatus(HttpStatus.OK)
    public List<Voiture> listVoiture(){
        return voitureService.listVoiture();
    }
    @GetMapping(path="/findById/{id}",name="findById")
    @ResponseStatus(HttpStatus.OK)
    public Voiture findById(@PathVariable Long id){
        return voitureService.findById(id);
    }
    @PutMapping(path="update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Voiture update(@RequestBody Voiture dataVoiture, @PathVariable Long id){
        return voitureService.update(dataVoiture,id);
    }
    @DeleteMapping(path = "delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        voitureService.delete(id);
    }
}
