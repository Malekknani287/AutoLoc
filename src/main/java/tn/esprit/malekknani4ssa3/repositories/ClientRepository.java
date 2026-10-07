package tn.esprit.malekknani4ssa3.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.malekknani4ssa3.entities.Client;

public interface ClientRepository extends JpaRepository <Client, Long>{
}
