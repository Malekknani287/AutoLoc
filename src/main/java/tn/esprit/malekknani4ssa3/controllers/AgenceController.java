package tn.esprit.malekknani4ssa3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.malekknani4ssa3.entities.Agence;
import tn.esprit.malekknani4ssa3.services.interfaces.IAgenceService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/agence")
public class AgenceController {
    IAgenceService agenceService;
    @PostMapping("/ajouter")
    public Agence ajouterAgence(@RequestBody Agence a) {
        return agenceService.ajouterAgence(a);
    }

    @PutMapping("/modifier")
    public Agence updateAgence(@RequestBody Agence a) {
        return agenceService.updateAgence(a);
    }
    @DeleteMapping("/supprimer/{id}")
    public void deleteAgence(@PathVariable int id) {
        agenceService.deleteAgence(id);
    }

    @GetMapping("/get/{id}")
    public Agence getAgence(int id) {
        return agenceService.getAgence(id);
    }
    @GetMapping("/getAll")
    public List<Agence> getAgences() {
        return agenceService.getAgences();
    }
}
