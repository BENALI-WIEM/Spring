package tn.esprit.foyer1.Controller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer1.Entity.Etudiant;
import tn.esprit.foyer1.Service.EtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/etudiants")

public class EtudiantController {
EtudiantService etudiantService;

@GetMapping("/all")
    public List<Etudiant> getAll() {
    return  etudiantService.retrieveAllEtudiants();
}

@GetMapping("/{idEtudiant}")
    public Etudiant getEtudiantById(@PathVariable Long idEtudiant){
        return etudiantService.retrieveEtudiant(idEtudiant);
    }


@PostMapping("/add/etudiant")
public Etudiant addEtudiant(@RequestBody Etudiant e){
    return etudiantService.addEtudiant(e);
}

@PutMapping("/update/etudiant")
    public Etudiant updateEtudiant( @RequestBody Etudiant  e){
        return etudiantService.updateEtudiant(e);
}


@DeleteMapping("/delete/{idEtudiant}")
    public void deleteEtudiant(@PathVariable Long idEtudiant){
        etudiantService.removeEtudiant(idEtudiant);

}
    @PostMapping("/addall")
    public List<Etudiant> addEtudiants(@RequestBody List<Etudiant> etudiants) {
        return etudiantService.addEtudiants(etudiants);
    }

}
