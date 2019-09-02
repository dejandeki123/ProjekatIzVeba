package com.example.PrvaTacka.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import com.example.PrvaTacka.entity.Korisnik;

@Entity
public class Dostavljac extends Korisnik {
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval=true) 
    @JoinColumn(name="dostavljac_id")
    private List<Korpa> korpe= new ArrayList<>();
    

    public Dostavljac() {

    }

    public Dostavljac(String korisnickoIme,String lozinka,String ime,String prezime,Uloga uloga,String kontaktTelefon,String email,String adresa,boolean izbrisano) {
        super(korisnickoIme, lozinka, ime, prezime, uloga, kontaktTelefon, email, adresa, izbrisano);
    }
    
    public List<Korpa> getKorpe() {
        return korpe;
    } 

    public void setKorpe(List<Korpa> korpe) {
        this.korpe=korpe;
    }

    @Override
    public String toString() {
        return "Dostavljac{" +
                "korpe=" + korpe +
                '}';
    }
}