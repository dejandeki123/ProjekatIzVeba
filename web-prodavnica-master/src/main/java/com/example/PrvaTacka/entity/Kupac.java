package com.example.PrvaTacka.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Kupac extends Korisnik {

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "kupac_id")
    private List<Korpa> korpe = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "kupac_id")
    private List<Artikal> omiljeniArtikli = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "buyer_id")
    private List<Artikal> artikliUKorpi = new ArrayList<>();

    public Kupac() {
        super();
    }

    public Kupac(String korisnickoIme, String lozinka, String ime, String prezime, Uloga uloga, String kontaktTelefon, String email, String adresa) {
        super(korisnickoIme, lozinka, ime, prezime, uloga, kontaktTelefon, email, adresa);
    }

    public List<Korpa> getKorpe() {
        return korpe;
    }

    public void setKorpe(List<Korpa> korpe) {
        this.korpe = korpe;
    }

    public List<Artikal> getOmiljeneArtikle() {
        return omiljeniArtikli;
    }

    public void setOmiljeneArtikle(List<Artikal> omiljeniArtikli) {
        this.omiljeniArtikli = omiljeniArtikli;
    }

    public List<Artikal> getArtikleUKorpi() {
        return artikliUKorpi;
    }

    public void setArtikliUKorpi(List<Artikal> artikliUKorpi) {
        this.artikliUKorpi = artikliUKorpi;
    }

    @Override
    public String toString() {
        return "Kupac{" +
                ", korpe=" + korpe +
                ", omiljeniArtikli=" + omiljeniArtikli +
                ", artikliUKorpi=" + artikliUKorpi +
                '}';
    }
}
