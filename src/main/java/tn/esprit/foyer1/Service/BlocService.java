package tn.esprit.foyer1.Service;

import tn.esprit.foyer1.Entity.Bloc;

import java.util.List;

public interface BlocService {
    List<Bloc> retrieveAllBlocs();

    Bloc addBloc(Bloc bloc );

    Bloc updateBloc(Bloc bloc );

    Bloc retrieveBloc(Long idBloc);

    void removeBloc(Long idBloc);
}

