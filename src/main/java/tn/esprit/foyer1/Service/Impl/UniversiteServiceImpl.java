package tn.esprit.foyer1.Service.Impl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer1.Entity.Universite;
import tn.esprit.foyer1.Entity.Universite;
import tn.esprit.foyer1.Repository.UniversiteRepository;
import tn.esprit.foyer1.Service.UniversiteService;
import tn.esprit.foyer1.Service.UniversiteService;

import java.util.List;



@Service
@AllArgsConstructor

public class UniversiteServiceImpl implements UniversiteService {
    UniversiteRepository universiteRepository;

    @Override
    public List<Universite> retrieveAllUniversities() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {

        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public void removeUniversite(long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }
}
