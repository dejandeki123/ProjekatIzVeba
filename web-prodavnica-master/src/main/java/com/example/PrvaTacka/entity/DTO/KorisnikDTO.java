package com.example.PrvaTacka.entity.DTO;

import com.example.PrvaTacka.entity.Uloga;

public class KorisnikDTO {
    private Long id;
    private String korisnickoIme;
    private String lozinka;
    private String ime;
    private String prezime;
    private Uloga uloga;
    private String kontaktTelefon;
    private String email;
    private String adresa;

    public KorisnikDTO() {
        
    }

    public KorisnikDTO(Long id,String korisnickoIme,String lozinka,String ime,String prezime,Uloga uloga,String kontakt_telefon,String email,String adresa) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKorisnicko() {
        return korisnickoIme;
    }

    public void setKorisnicko(String korisnicko) {
        this.korisnickoIme = korisnicko;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
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

    public String getKontakt_telefon() {
        return kontaktTelefon;
    }

    public void setKontakt_telefon(String kontakt_telefon) {
        this.kontaktTelefon = kontakt_telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    
}