package com.example.PrvaTacka.dto;

public class KorisnikDTO {
    private String korisnickoime;
    private String lozinka;

    public KorisnikDTO() {
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getKorisnickoime() {
        return korisnickoime;
    }

    public void setKorisnickoime(String korisnickoime) {
        this.korisnickoime = korisnickoime;
    }

    public KorisnikDTO(String korisnickoime, String lozinka) {
        this.korisnickoime = korisnickoime;
        this.lozinka = lozinka;
    }


    @Override
    public String toString() {
        return "KorisnikDTO{" +
                "korisnickoime='" + korisnickoime + '\'' +
                ", lozinka='" + lozinka + '\'' +
                '}';
    }


}
