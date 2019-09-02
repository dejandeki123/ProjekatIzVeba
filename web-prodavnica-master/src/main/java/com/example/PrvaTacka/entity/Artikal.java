package com.example.PrvaTacka.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Artikal{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column
    private String naziv;

    @Column
    private String opis;

    @Column
    private double cena;

    @Column
    private int kolicina;

    @Enumerated(EnumType.STRING)
    @Column
    private Kategorija kategorija;

    @Column
    private boolean snizeno;

    

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "item_id")
    private List<Artikal> omiljeniArtikli = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "item_id")
    private List<Artikal> artikliUKorpi = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "item_id")
    private List<Artikal> kupljeno = new ArrayList<>();

    public Artikal() {
    }

    public Artikal(String naziv, String opis, double cena, int kolicina, Kategorija kategorija, boolean snizeno) {
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

    public List<Artikal> getOmiljeni() {
        return omiljeniArtikli;
    }

    public void setOmiljeni(List<Artikal> omiljeni) {
        this.omiljeniArtikli = omiljeni;
    }

    public List<Artikal> getArtikliUKorpi() {
        return artikliUKorpi;
    }

    public void setArtikliUKorpi(List<Artikal> artikliUK) {
        this.artikliUKorpi = artikliUK;
    }

    public List<Artikal> getKupljene() {
        return kupljeno;
    }

    public void setKupljene(List<Artikal> kupljeno) {
        this.kupljeno = kupljeno;
    }

    public boolean isSnizeno() {
        return snizeno;
    }

    public void setSnizeno(boolean snizeno) {
        this.snizeno = snizeno;
    }

    @Override
    public String toString() {
        return "Artikal{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                ", opis='" + opis + '\'' +
                ", cena=" + cena +
                ", kolicina=" + kolicina +
                ", kategorija=" + kategorija +
                ", omiljeniArtikli=" + omiljeniArtikli +
                ", artikli u korpi=" + artikliUKorpi +
                ", kupljeno=" + kupljeno +
                ", snizeno=" + snizeno +
                '}';
    }
}
