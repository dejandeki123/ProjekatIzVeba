package com.example.PrvaTacka.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tip")
public class Korisnik implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String korisnicko;

    @Column
    private String lozinka;

    @Column
    private String ime;

    @Column
    private String prezime;

    @Column
    private String uloga;

    @Column
    private Integer kontakt_telefon;

    @Column
    private String email;

    @Column
    private String adresa;

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

    public String getUloga() {
        return uloga;
    }

    public void setUloga(String uloga) {
        this.uloga = uloga;
    }

    @Override
    public String toString() {
        return "Korisnik{" +
                ", korisnicko ime = '" + korisnicko + '\'' +
                ", lozinka = '" + lozinka + '\'' +
                ", ime = '" + ime + '\'' +
                ", prezime = '" + prezime + '\'' +
                ", uloga = '" + uloga + '\'' +
                ", kontakt telefon = " + kontakt_telefon +
                ", email = '" + email + '\'' +
                ", adresa = '" + adresa + '\'' +
                '}';
    }
}