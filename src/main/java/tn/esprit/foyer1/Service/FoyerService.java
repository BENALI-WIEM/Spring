package tn.esprit.foyer1.Service;

import tn.esprit.foyer1.Entity.Chambre;
import tn.esprit.foyer1.Entity.Foyer;

import java.util.List;

public interface FoyerService {
    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer(Foyer foyer );

    Foyer updateFoyer(Foyer foyer );

    Foyer retrieveCFoyer(Long idFoyer);

    void ArchiveFoyer (long idFoyer);  // Ajoutez un attribut boolean archived dans l'entité Foyer, par défault false et le modifier à true suite à l'exécution de ce service

}

