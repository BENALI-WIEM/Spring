package tn.esprit.foyer1.Controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer1.Entity.Foyer;
import tn.esprit.foyer1.Service.FoyerService;

import java.util.List;

@RestController
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/foyers")


public class FoyerController {
    @Autowired
    FoyerService foyerService;

    @GetMapping("/allfoyer")
    public List<Foyer> getAll() {
        return foyerService.retrieveAllFoyers();
    }

    @GetMapping("/{idFoyer}")
    public Foyer getFoyerById(@PathVariable Long idFoyer){
        return foyerService.retrieveCFoyer(idFoyer);

    }

    @PostMapping("/addfoyer")
    public Foyer addFoyer(@RequestBody Foyer foyer){
        return foyerService.addFoyer(foyer);
    }

    @PutMapping("/updatefoyer")
    public Foyer updateFoyer(@RequestBody Foyer foyer){
        return foyerService.updateFoyer(foyer);
    }

    @PutMapping("/archive/{idFoyer}")
    public void ArchiveFoyer(@PathVariable long idFoyer) {
        foyerService.ArchiveFoyer(idFoyer);
    }
}