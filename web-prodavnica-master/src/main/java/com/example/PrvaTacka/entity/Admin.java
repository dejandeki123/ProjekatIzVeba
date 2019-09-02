package com.example.PrvaTacka.entity;
import javax.persistence.Entity;

@Entity
public class Admin extends Korisnik {

    public Admin() {
    }

    public Admin(String korisnickoIme, String lozinka, String ime, String prezime, Uloga uloga, String kontaktTelefon, String email, String adresa, boolean izbrisano) {
        super(korisnickoIme, lozinka, ime, prezime, uloga, kontaktTelefon, email, adresa, izbrisano);
    }
}

