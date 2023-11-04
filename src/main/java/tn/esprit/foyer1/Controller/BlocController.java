package tn.esprit.foyer1.Controller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.foyer1.Entity.Bloc;
import tn.esprit.foyer1.Entity.Etudiant;
import tn.esprit.foyer1.Service.BlocService;
import tn.esprit.foyer1.Service.Impl.BlocServiceImpl;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("api/blocs")

public class BlocController {
    BlocService blocService;

    @GetMapping("/all")
    public List<Bloc> getAll() {
        return  blocService.retrieveAllBlocs();
    }
}
