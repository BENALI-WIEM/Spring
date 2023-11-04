package tn.esprit.foyer1.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer1.Entity.Bloc;
import tn.esprit.foyer1.Entity.Etudiant;
import tn.esprit.foyer1.Repository.BlocRepository;
import tn.esprit.foyer1.Repository.EtudiantRepository;
import tn.esprit.foyer1.Service.BlocService;
import tn.esprit.foyer1.Service.EtudiantService;

import java.util.List;

@Service
@AllArgsConstructor

public class BlocServiceImpl implements BlocService {
    BlocRepository blocRepository;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return null;
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return null;
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return null;
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return null;
    }

    @Override
    public void removeBloc(Long idBloc) {

    }
}