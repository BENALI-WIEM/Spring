package tn.esprit.foyer1.Service;

import tn.esprit.foyer1.Entity.Universite;

import java.util.List;

public interface UniversiteService {
    List<Universite> retrieveAllUniversities();
    Universite addUniversite (Universite universite);
    Universite updateUniversite (Universite universite);
    Universite retrieveUniversite (long idUniversite);
    void removeUniversite  (long idUniversite );
}
