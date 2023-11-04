package tn.esprit.foyer1.Service;

import tn.esprit.foyer1.Entity.Bloc;
import tn.esprit.foyer1.Entity.Chambre;

import java.util.List;

public interface ChambreService {
    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre chambre );

    Chambre updateChambre(Chambre chambre );

    Chambre retrieveChambre(Long idChambre);

    void removeChambre(Long idChambre);
}

