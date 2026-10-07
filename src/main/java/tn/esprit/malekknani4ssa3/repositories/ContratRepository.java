package tn.esprit.malekknani4ssa3.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.malekknani4ssa3.entities.Client;
import tn.esprit.malekknani4ssa3.entities.Contrat;

public interface ContratRepository extends JpaRepository <Contrat, Long>{
}
