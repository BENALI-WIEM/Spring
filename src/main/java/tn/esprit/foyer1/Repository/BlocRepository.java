package tn.esprit.foyer1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer1.Entity.Bloc;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
