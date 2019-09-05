package com.example.PrvaTacka.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public  class Korisnik {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;


    @Column
    private String korisnickoIme;

    @Column 
    private String lozinka;

    @Column
    private String ime;

    @Column
    private String prezime;

    @Enumerated(EnumType.STRING)
    @Column
    private Uloga uloga;

    @Column
    private String kontaktTelefon;

    @Column
    private String email;

    @Column
    private String adresa;

  

    public Korisnik() {

    }

    public Korisnik(String korisnickoIme,String lozinka,String ime,String prezime,Uloga uloga,String kontaktTelefon,String email,String adresa) {
        this.korisnickoIme=korisnickoIme;
        this.lozinka=lozinka;
        this.ime=ime;
        this.prezime=prezime;
        this.uloga=uloga;
        this.kontaktTelefon=kontaktTelefon;
        this.email=email;
        this.adresa=adresa;
       

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnicko) {
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

    public String getKontaktTelefon() {
        return kontaktTelefon;
    }

    public void setKontaktTelefon(String kontaktTelefon) {
        this.kontaktTelefon = kontaktTelefon;
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