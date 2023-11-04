package tn.esprit.foyer1.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer1.Entity.Etudiant;
import tn.esprit.foyer1.Repository.EtudiantRepository;
import tn.esprit.foyer1.Service.EtudiantService;

import java.util.List;

@Service
@AllArgsConstructor

public class EtudiantServiceImpl implements EtudiantService {
    EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

//    OR
//     @Override
//    public Etudiant retrieveEtudiant(Long idEtudiant) {
//        return etudiantRepository.findById(idEtudiant).get();
//    }


    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return etudiantRepository.saveAll(etudiants);
    }
}

