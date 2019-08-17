package com.example.PrvaTacka.entity.DTO;

public class LoginKorisnikDTO{
    //klasa koja sluzi za logovanje registrovanog korisnika

    private String korisnickoIme;
    private String lozinka;

    public LoginKorisnikDTO() {

    }
    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme=korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka=lozinka;
    }

    public LoginKorisnikDTO(String korisnickoIme,String lozinka) {
        this.korisnickoIme=korisnickoIme;
        this.lozinka=lozinka;
    }

    
} 