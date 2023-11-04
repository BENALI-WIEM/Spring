package tn.esprit.foyer1.Controller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer1.Entity.Foyer;
import tn.esprit.foyer1.Entity.Universite;
import tn.esprit.foyer1.Service.FoyerService;
import tn.esprit.foyer1.Service.UniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/universites")

public class UniversiteController {
    UniversiteService universiteService;

    @GetMapping("/alluniversite")
    public List<Universite> getAll() {
        return universiteService.retrieveAllUniversities();
    }

    @GetMapping("/{idUniversite}")
    public Universite getFoyerById(@PathVariable Long idUniversite){
        return universiteService.retrieveUniversite(idUniversite);


    }

    @PostMapping("/adduniversite")
    public Universite addUniversite(@RequestBody Universite universite){
        return universiteService.addUniversite(universite);
    }

    @PutMapping("/updateuniversite")
    public Universite updateUniversite(@RequestBody Universite universite){
        return universiteService.updateUniversite(universite);
    }

    @DeleteMapping("/remove/{idUniversite}")
    public void removeUniversite(@PathVariable Long idUniversite){
        universiteService.removeUniversite(idUniversite);
    }
}

