package tn.esprit.malekknani4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.malekknani4ssa3.entities.Agence;
import tn.esprit.malekknani4ssa3.repositories.AgenceRepository;
import tn.esprit.malekknani4ssa3.services.interfaces.IAgenceService;

import java.util.List;
@AllArgsConstructor
@Service
public class AgenceServiceImpl implements IAgenceService {

    AgenceRepository agenceRepository;

    @Override
    public Agence ajouterAgence(Agence a) {
        return agenceRepository.save(a);
    }

    @Override
    public Agence updateAgence(Agence a) {
        return agenceRepository.save(a);
    }

    @Override
    public void deleteAgence(int id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public Agence getAgence(int id) {
        return agenceRepository.findById(id).get();
    }

    @Override
    public List<Agence> getAgences() {
        return agenceRepository.findAll();
    }
}
