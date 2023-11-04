package tn.esprit.foyer1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer1.Entity.Etudiant;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
