package com.example.PrvaTacka.entity.DTO;

import com.example.PrvaTacka.entity.Korpa;
import com.example.PrvaTacka.entity.Uloga;

public class DostavljacDTO {
    private Long id;
    private String korisnickoIme;
    private String lozinka;
    private String ime;
    private String prezime;
    private Uloga uloga;
    private String kontaktTelefon;
    private String email;
    private String adresa;
    private Korpa porudzbina;

    public DostavljacDTO() {
        
    }

    public DostavljacDTO(Long id,String korisnickoIme,String lozinka,String ime,String prezime,Uloga uloga,String kontakt_telefon,String email,String adresa) {
        this.id=id;
        this.korisnickoIme=korisnickoIme;
        this.lozinka=lozinka;
        this.ime=ime;
        this.prezime=prezime;
        this.uloga=uloga;
        this.kontaktTelefon=kontakt_telefon;
        this.email=email;
        this.adresa=adresa;
    }

    public DostavljacDTO(String korisnickoIme,String lozinka,String ime,String prezime,Uloga uloga,String kontakt_telefon,String email,String adresa) {
        
        this.korisnickoIme=korisnickoIme;
        this.lozinka=lozinka;
        this.ime=ime;
        this.prezime=prezime;
        this.uloga=uloga;
        this.kontaktTelefon=kontakt_telefon;
        this.email=email;
        this.adresa=adresa;
    }

    public DostavljacDTO(Long id,String korisnickoIme,String lozinka,String ime,String prezime,Uloga uloga,String kontakt_telefon,String email,String adresa,Korpa porudzbina) {
        this.id=id;
        this.korisnickoIme=korisnickoIme;
        this.lozinka=lozinka;
        this.ime=ime;
        this.prezime=prezime;
        this.uloga=uloga;
        this.kontaktTelefon=kontakt_telefon;
        this.email=email;
        this.adresa=adresa;
        this.porudzbina=porudzbina;
    }
    
    public String getAdresa() {
        return adresa;
    } 

    public void setAdresa(String adresa) {
        this.adresa=adresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    } 

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme=korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka=lozinka;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime=ime;
    }

    public String getPrezime() {
        return prezime;
    }


    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Uloga getUloga() {
        return uloga;
    }

    public void setUloga(Uloga uloga) {
        this.uloga = uloga;
    }

    public String getKontaktTelefon() {
        return kontaktTelefon;
    }

    public void setKontaktTelefon(String kontakt_telefon) {
        this.kontaktTelefon = kontakt_telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Korpa getPorudzbina() {
        return porudzbina;
    }

    public void setPorudzbina(Korpa porudzbina) {
        this.porudzbina = porudzbina;
    }
}