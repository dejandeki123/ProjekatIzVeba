package com.example.PrvaTacka.dto;

import com.example.PrvaTacka.entity.Kategorija;

public class ArtikalDTO {

    private Integer id;

    private String naziv;

    private String opis;

    private double cena;

    private int kolicina;

    private Kategorija kategorija;

    private boolean snizeno;

    public ArtikalDTO() {
    }

    public ArtikalDTO(Integer id, String naziv, String opis, double cena, int kolicina, Kategorija kategorija, boolean snizeno) {
        this.id = id;
        this.naziv = naziv;
        this.opis = opis;
        this.cena = cena;
        this.kolicina = kolicina;
        this.kategorija = kategorija;
        this.snizeno = snizeno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public Kategorija getKategorija() {
        return kategorija;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }

    public boolean isSnizeno() {
        return snizeno;
    }

    public void setSnizeno(boolean snizeno) {
        this.snizeno = snizeno;
    }
}
