package com.example.PrvaTacka.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("dostavljac")
public class Dostavljac extends Korisnik{

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "korpa_d_id")
    private Korpa porudzbina;

    public Korpa getPorudzbina() {
        return porudzbina;
    }

    public void setPorudzbina(Korpa porudzbina) {
        this.porudzbina=porudzbina;
    }

    public Dostavljac(Korpa porudzbina) {
        this.porudzbina=porudzbina;
    } //konstruktor sa parametrima

    public Dostavljac(Long id,String korisnickoIme,String lozinka,String ime,String prezime,Uloga uloga,String kontaktTelefon,String email,String adresa,Korpa porudzbina) {
        super(id, korisnickoIme, lozinka, ime, prezime, uloga, kontaktTelefon, email, adresa);
        this.porudzbina=porudzbina;
    }

    public Dostavljac(String korisnicko, String lozinka, String ime, String prezime, Uloga uloga, String kontakt_telefon, String email, String adresa, Korpa porudzbina) {
        super(korisnicko, lozinka, ime, prezime, uloga, kontakt_telefon, email, adresa);
        this.porudzbina = porudzbina;
    }
    
    public Dostavljac() {
    }

    public Dostavljac(String korisnicko, String lozinka, String ime, String prezime, Uloga uloga, String kontakt_telefon, String email, String adresa) {
        super(korisnicko, lozinka, ime, prezime, uloga, kontakt_telefon, email, adresa);
    }
}