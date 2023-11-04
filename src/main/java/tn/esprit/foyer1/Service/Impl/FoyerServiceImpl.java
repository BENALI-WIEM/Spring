package tn.esprit.foyer1.Service.Impl;


import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.foyer1.Entity.Etudiant;
import tn.esprit.foyer1.Entity.Foyer;
import tn.esprit.foyer1.Repository.EtudiantRepository;
import tn.esprit.foyer1.Repository.FoyerRepository;
import tn.esprit.foyer1.Service.EtudiantService;
import tn.esprit.foyer1.Service.FoyerService;

import java.util.List;


@Service
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/foyer")
public class FoyerServiceImpl implements FoyerService {
    @Autowired
    FoyerRepository foyerRepository;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();


    }

    @Override
    public Foyer addFoyer(Foyer foyer) {
        {
            return foyerRepository.save(foyer);
    }


}

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer retrieveCFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).orElse(null);
    }

        @Transactional
        public void ArchiveFoyer(long idFoyer) {
            foyerRepository.UpdateArchiver(idFoyer);
        }

    }


