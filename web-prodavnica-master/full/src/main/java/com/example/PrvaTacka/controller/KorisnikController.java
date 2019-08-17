package com.example.PrvaTacka.controller;

import com.example.PrvaTacka.entity.DTO.KorisnikDTO;
import com.example.PrvaTacka.entity.DTO.LoginKorisnikDTO;
import com.example.PrvaTacka.entity.Korisnik;
import com.example.PrvaTacka.service.KorisnikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/api/korisnici")
public class KorisnikController {

    private final KorisnikService korisnikService;

    @Autowired
    public KorisnikController(KorisnikService korisnikService) {
        this.korisnikService = korisnikService;
    }

    //@GetMapping("/")
    //public String welcome() {
    //    return "home.html";
    //}


    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<KorisnikDTO> login(@RequestBody LoginKorisnikDTO korisnikDTO) throws Exception{

        Korisnik korisnik = korisnikService.login(korisnikDTO.getEmail(), korisnikDTO.getLozinka());

        KorisnikDTO logovaniKorisnik = new KorisnikDTO();

        if (korisnik != null) {

            logovaniKorisnik = new KorisnikDTO(korisnik.getId(), korisnik.getKorisnicko(), korisnik.getLozinka(),
                    korisnik.getIme(), korisnik.getPrezime(), korisnik.getUloga(), korisnik.getKontakt_telefon(),
                    korisnik.getEmail(), korisnik.getAdresa());
            return new ResponseEntity<>(logovaniKorisnik, HttpStatus.OK);

        }
        return new ResponseEntity<>(logovaniKorisnik, HttpStatus.BAD_REQUEST);

    }

    //Prikaz svih korisnika
    @GetMapping(                                               // value nije naveden, jer koristimo bazni url
            produces = MediaType.APPLICATION_JSON_VALUE)       // tip odgovora
    public ResponseEntity<List<KorisnikDTO>> getKorisnici() {
        List<Korisnik> korisnikList = this.korisnikService.findAll();

        // Kreiramo listu DTO objekata
        List<KorisnikDTO> korisniciDTOS = new ArrayList<>();

        for (Korisnik korisnik : korisnikList) {
            KorisnikDTO korisnikDTO = new KorisnikDTO(korisnik.getId(), korisnik.getKorisnicko(), korisnik.getLozinka(),
                    korisnik.getIme(), korisnik.getPrezime(), korisnik.getUloga(), korisnik.getKontakt_telefon(),
                    korisnik.getEmail(), korisnik.getAdresa());
            korisniciDTOS.add(korisnikDTO);
        }
        return new ResponseEntity<>(korisniciDTOS, HttpStatus.OK);
    }


/*    @PostMapping(
            value = "/registration",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<KorisnikDTO> registracija(@RequestBody KorisnikDTO korisnikDTO) throws Exception {

        Korisnik korisnik = new Korisnik(korisnikDTO.getKorisnicko(), korisnikDTO.getLozinka(), korisnikDTO.getIme(), korisnikDTO.getPrezime(), korisnikDTO.getUloga(), korisnikDTO.getKontakt_telefon(), korisnikDTO.getEmail(), korisnikDTO.getAdresa());

        Korisnik noviKorisnik = korisnikService.create(korisnik);

        KorisnikDTO noviKorisnikDTO = new KorisnikDTO(noviKorisnik.getId(), noviKorisnik.getKorisnicko(),
                                        noviKorisnik.getLozinka(), noviKorisnik.getIme(), noviKorisnik.getPrezime(),
                                        noviKorisnik.getUloga(), noviKorisnik.getKontakt_telefon(),
                                        noviKorisnik.getEmail(), noviKorisnik.getAdresa());

        return new ResponseEntity<>(noviKorisnikDTO, HttpStatus.OK);
    }*/
}