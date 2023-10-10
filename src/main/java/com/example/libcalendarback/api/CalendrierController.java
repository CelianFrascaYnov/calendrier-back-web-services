package com.example.libcalendarback.api;

import com.example.libcalendar.CalendrierGenerator;
import com.example.libcalendar.model.MoisCalendrier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CalendrierController {

    @GetMapping("/calendrier")
    public MoisCalendrier getCalendrier(@RequestParam int annee, @RequestParam int mois) {
        // Utilise la fonction generateCalendrier de votre bibliothèque
        CalendrierGenerator calendrierGenerator = new CalendrierGenerator();
        MoisCalendrier calendrier = calendrierGenerator.generateCalendrier(annee, mois);

        // Retourne le calendrier en tant que réponse
        return calendrier;
    }
}
