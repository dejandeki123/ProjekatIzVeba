package com.example.PrvaTacka.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Artikal implements Serializable {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String naziv;

    @Column
    private String opis;

    @Column 
    private Long cena;

    @Column 
    private Integer kolicina;

    @Column 
    private String kategorija;

    @ManyToMany 
    private Set<Kupac> prethodni_kupci=new HashSet<>();


    @ManyToMany 
    private Set<Kupac> omiljeni_kupci=new HashSet<>();

    @ManyToMany 
    private Set<Korpa> korpaArtikli= new HashSet<>();

    public Set<Korpa> getKorpaArtikli() {
        return korpaArtikli;
    } 

    public void setKorpaArtikli(Set<Korpa> korpaArtikli) {
        this.korpaArtikli=korpaArtikli;
    }

    public Artikal() {

    }

    public Artikal(String naziv,String opis,Long cena,Integer kolicina,String kategorija) {
        this.naziv=naziv;
        this.opis=opis;
        this.cena=cena;
        this.kolicina=kolicina;
        this.kategorija=kategorija;
    }

    public Artikal(Long id,String naziv,String opis,Long cena,Integer kolicina,String kategorija) {
        this.id=id;
        this.naziv=naziv;
        this.opis=opis;
        this.cena=cena;
        this.kolicina=kolicina;
        this.kategorija=kategorija;
    } 


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Long getCena() {
        return cena;
    }

    public void setCena(Long cena) {
        this.cena = cena;
    }

    public Integer getKolicina() {
        return kolicina;
    }

    public void setKolicina(Integer kolicina) {
        this.kolicina = kolicina;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public Set<Kupac> getPrethodniKupci() {
        return prethodni_kupci;
    }

    public void setPrethodniKupci(Set<Kupac> prethodni_kupci) {
        this.prethodni_kupci=prethodni_kupci;
    }

    public Set<Kupac> getOmiljeniKupci() {
        return omiljeni_kupci;
    }

    public void setOmiljeniKupci(Set<Kupac> omiljeniKupci) {
        this.omiljeni_kupci=omiljeniKupci;
    }

    @Override
    public String toString() {
        return "Artikal { " +
                "id = " + id +
                ", naziv = '" + naziv + '\'' +
                ", opis = '" + opis + '\'' +
                ", cena = " + cena +
                ", kolicina = " + kolicina +
                ", kategorija = '" + kategorija + '\'' +
                '}';
    }



}