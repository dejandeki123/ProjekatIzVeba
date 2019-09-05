package com.example.PrvaTacka.controller;


import com.example.PrvaTacka.entity.*;
import com.example.PrvaTacka.service.KorisnikService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KorisnikController {
	 
	@Autowired
    private KorisnikService korisnikService;


	@GetMapping("/")
	public String welcome() {
		return "pocetna.html";
	}
	
	@GetMapping("/prijava") 
	public String ulogujSe(Model model) {

		Korisnik korisnik = new Korisnik();

		model.addAttribute("korisnik",korisnik);
		return "prijava.html";

	}

	@PostMapping("/prijava")
    public String proveriPrijavu(@RequestParam String korisnickoime , @RequestParam String lozinka) {
        try{
        Korisnik korisnik = this.korisnikService.findOneByKorisnickoIme(korisnickoime);

        if (korisnik.getLozinka().equals(lozinka)) {
            return "pocetna.html";
        } else {
            return "propalaprijava.html";
        }

    } catch (Exception e) {
            return "propalaprijava.html";
        }

    }
}