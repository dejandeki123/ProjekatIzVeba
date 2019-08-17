package com.example.PrvaTacka.entity.DTO;

public class KupacDTO {
    
    private Long id;//svaki kupac ima svoj id
    private String korisnicko; //korisnicko ime
    private String lozinka; //i lozinku
    private String ime; //i slede njegovi ostali podaci
    private String prezime;
    private String uloga;
    private Integer kontakt_telefon;
    private String email;
    private String adresa;


    public KupacDTO(){
    }

    //geteri i seteri
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKorisnicko() {
        return korisnicko;
    }

    public void setKorisnicko(String korisnicko) {
        this.korisnicko = korisnicko;
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

    public String getUloga() {
        return uloga;
    }

    public void setUloga(String uloga) {
        this.uloga = uloga;
    }

    public Integer getKontakt_telefon() {
        return kontakt_telefon;
    }

    public void setKontakt_telefon(Integer kontakt_telefon) {
        this.kontakt_telefon = kontakt_telefon;
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

    public KupacDTO(Long id, String korisnicko, String lozinka, String ime, String prezime, String uloga, Integer kontakt_telefon, String email, String adresa) {
        this.id = id;
        this.korisnicko = korisnicko;
        this.lozinka = lozinka;
        this.ime = ime;
        this.prezime = prezime;
        this.uloga = uloga;
        this.kontakt_telefon = kontakt_telefon;
        this.email = email;
        this.adresa = adresa;
    }//konstruktor sa parametrima za kupca

}