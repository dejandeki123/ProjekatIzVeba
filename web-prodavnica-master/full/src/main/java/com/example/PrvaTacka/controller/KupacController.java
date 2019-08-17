package com.example.PrvaTacka.controller;

import com.example.PrvaTacka.entity.Kupac;
import com.example.PrvaTacka.service.KupacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class KupacController {
/*
    @Autowired
    private KupacService kupacService;

    @GetMapping("/")
    public String welcome() {return "home.html";}

    @GetMapping("/add-kupac")
    public String addKupac(Model model) {
        Kupac kupac = new Kupac();
        model.addAttribute("kupac", kupac);
        return "registration.html";
    }

    @PostMapping("/save-kupac")
    public String saveKupac(@Valid @ModelAttribute Kupac kupac, BindingResult errors, Model model) throws Exception {
        this.kupacService.create(kupac);
        return "redirect:/login";
    }

    @PostMapping("/save-login")
    public String login(@Valid @ModelAttribute Kupac kupac, BindingResult errors, Model model) throws Exception {
        model.addAttribute("kupac", this.kupacService.findByKorisnickoAndLozinka(kupac.getKorisnicko(), kupac.getLozinka()));
        return "homepage.html";
    }

    @GetMapping("/login")
    public String login(Model model) {
        Kupac kupac = new Kupac();
        model.addAttribute("kupac", kupac);
        return "login.html";
    }

    @GetMapping("/uloga")
    public String uloga() {
        return "uloga.html";
    }

    @GetMapping("/profil")
    public String getHomepage(Model model, String korisnicko, String lozinka) throws Exception {
        model.addAttribute("kupac", this.kupacService.findByKorisnickoAndLozinka(korisnicko, lozinka));
        return "homepage.html";
    }

    @GetMapping("/profil/{id}")
    public String getProfil(@PathVariable(name = "id") Long id, Model model) {
        Kupac kupac = this.kupacService.findOne(id);
        model.addAttribute("kupac", kupac);
        return "profil.html";
    }

   //@GetMapping("/change/{id}")
   // public String changeUser(@PathVariable("id") long id, Model model) {
   //     this.kupacService.change(id);
   //     model.addAttribute("kupci", kupacService.findAll());
   //     return "redirect:/kupci";
   // }

    @GetMapping("/kupci")
    public String getKupci(Model model) {
        List<Kupac> kupci = this.kupacService.findAll();
        model.addAttribute("kupci", kupci);
        return "kupci.html";
    }

    @GetMapping("/kupci/{id}")
    public String getKupac(@PathVariable(name = "id") Long id, Model model) {
        Kupac kupac = this.kupacService.findOne(id);
        model.addAttribute("kupac", kupac);
        return "kupac.html";
    }

    @GetMapping("/change/{id}")
    public String promeniUlogu(@PathVariable(name = "id") Long id, Model model){
        this.kupacService.change(id);
        return "redirect:/kupci";
    }*/
}
