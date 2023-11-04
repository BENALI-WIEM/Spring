package tn.esprit.foyer1.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer1.Entity.Foyer;
@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {

    @Modifying
    @Query("update Foyer universite set universite.archiverFoyer = TRUE where universite.idFoyer = ?1")
    void UpdateArchiver(long idFoyer);
}
