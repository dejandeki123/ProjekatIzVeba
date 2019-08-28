package com.example.PrvaTacka.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tip")
public class Korisnik implements Serializable{
    public Korisnik() {
       
    } 

    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     @Column
     private String korisnickoIme; 

     @Column
     private String lozinka; 

     @Column 
     private String ime; 

     @Column
     private String prezime;

     @Column
     private Uloga uloga;

     @Column
     private String kontaktTelefon;

     @Column
     private String email;

     @Column
     private String adresa;

     public Korisnik(Long id,String korisnickoIme,String lozinka,String ime,String prezime,Uloga uloga,String kontaktTelefon,String email,String adresa) {
        this.id=id;
        this.korisnickoIme=korisnickoIme;
        this.lozinka=lozinka;
        this.ime=ime;
        this.prezime=prezime;
        this.uloga=uloga;
        this.kontaktTelefon=kontaktTelefon;
        this.email=email;
        this.adresa=adresa;
    }

    public Korisnik(String korisnicko, String lozinka, String ime, String prezime, Uloga uloga, String kontakt_telefon, String email, String adresa) {
        this.korisnickoIme = korisnicko;
        this.lozinka = lozinka;
        this.ime = ime;
        this.prezime = prezime;
        this.uloga = uloga;
        this.kontaktTelefon = kontakt_telefon;
        this.email = email;
        this.adresa = adresa;
    }
    

    
     public Long getId() {
         return id;
     }
     
     public void setId(Long id) {
         this.id=id;
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

     public String getIme() {
         return ime;
     }

     public void setIme(String ime) {
         this.ime=ime;
     }

     public String getPrezime() {
         return prezime;
     }

     public void setPrezime(String prezime) {
         this.prezime=prezime;
     } 

     public Uloga getUloga() {
         return uloga;
     }

     public void setUloga(Uloga uloga) {
         this.uloga=uloga;
     }

     public String getKontaktTelefon() {
           return kontaktTelefon;
     }

     public void setKontaktTelefon(String kontaktTelefon) {
         this.kontaktTelefon=kontaktTelefon;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email=email;
     }

     public String getAdresa() {
         return adresa;
     }

     public void setAdresa(String adresa){
         this.adresa=adresa;
     }

     @Override
     public String toString() {

        return "Korisnik{" +
        ", korisnicko ime = '" + korisnickoIme + '\'' +
        ", lozinka = '" + lozinka + '\'' +
        ", ime = '" + ime + '\'' +
        ", prezime = '" + prezime + '\'' +
        ", uloga = '" + uloga + '\'' +
        ", kontakt telefon = " + kontaktTelefon +
        ", email = '" + email + '\'' +
        ", adresa = '" + adresa + '\'' +
        '}';
      }
}