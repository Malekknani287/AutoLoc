package tn.esprit.malekknani4ssa3.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.malekknani4ssa3.entities.Agence;
import tn.esprit.malekknani4ssa3.entities.Maintenance;


public interface MaintenanceRepository extends JpaRepository <Maintenance, Long> {
}
