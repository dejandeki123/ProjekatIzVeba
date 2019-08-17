package com.example.PrvaTacka.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity //oznaka za entitet
@DiscriminatorValue("kupac") //diskriminator value se koristi da odvoji razlicite tipove korisnika:kupac,dostavljac,admin
public class Kupac extends Korisnik{

    @ManyToMany ///vrsta nasledjivanja;svako moze biti kupac
    @JoinTable(name= "prethodni",
    joinColumns = @JoinColumn(name="kupac_id",referencedColumnName = "id"),
    inverseJoinColumns= @JoinColumn(name = "artikal_id",referencedColumnName ="id"))
    //join table je tabela koja povezuje dve zavisne tabele
    //joinColumns i inverseJoinColumns je nesto sto treba da se definise kod JoinTable

   private Set<Artikal> prethodni= new HashSet<>(); //set artikala koji oznacavaju korpu 
   //korpa,ovo se valjda odnosi na prethodno ubacene artikle u korpu

   @JsonIgnore
   @OneToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "korpa_id")
   private Korpa korpaKupac;

   @ManyToMany
   @JoinTable(name = "omiljeni",
   joinColumns = @JoinColumn(name= "kupac_id", referencedColumnName="id"),
   inverseJoinColumns = @JoinColumn(name="artikal_id",referencedColumnName ="id" ))
private Set<Artikal> omiljeni= new HashSet<>();
//skup omiljenih artikala

public Kupac(Long id,String korisnickoIme,String lozinka,String ime,String prezime,Uloga uloga,String kontaktTelefon,String email,String adresa,Korpa korpaKupac) {
    super(id, korisnickoIme, lozinka, ime, prezime, uloga, kontaktTelefon, email, adresa);
    this.korpaKupac=korpaKupac;
} //konstruktor ove klase;posto ova
//klasa nasledjuje klasu Korisnik,pozivamo
//roditeljski konstruktor,a za polje
//korpaKupac koristimo standardni nacin

private Long poen= Long.valueOf(0);
//ovo sy valjda oni poeni pri kupovini

public Long getPoen() {
    return poen;
}

public void setPoen(Long poen) {
    this.poen=poen;
}

public Korpa getKorpaKupac() {
    return korpaKupac;
}

public void setKorpaKupac(Korpa korpaKupac) {
    this.korpaKupac=korpaKupac;
}

public Set<Artikal> getPrethodni() {
    return prethodni;
}

public void setPrethodni(Set<Artikal> prethodni) {
    this.prethodni=prethodni;
}

public Set<Artikal> getOmiljeni() {
    return omiljeni;
}

public void setOmiljeni(Set<Artikal> omiljeni) {
    this.omiljeni=omiljeni;
}

public Kupac(String korisnicko, String lozinka, String ime, String prezime, Uloga uloga, String kontakt_telefon, String email, String adresa) {
    super(korisnicko, lozinka, ime, prezime, uloga, kontakt_telefon, email, adresa);
}//konstruktor za ovu klasu,bez id polja i korpe

public Kupac(Long id, String korisnicko, String lozinka, String ime, String prezime, Uloga uloga, String kontakt_telefon, String email, String adresa) {
    super(korisnicko, lozinka, ime, prezime, uloga, kontakt_telefon, email, adresa);
}//konstruktor za ovu klasu,sa id -jem ali bez korpe

public Kupac(String korisnicko, String lozinka, String ime, String prezime, Uloga uloga, String kontakt_telefon, String email, String adresa, Korpa korpaKupac) {
    super(korisnicko, lozinka, ime, prezime, uloga, kontakt_telefon, email, adresa);
    this.korpaKupac = korpaKupac;
}//konstruktor za ovu klasu,bez id-ja ali sa korpom

public Kupac() {

}


@Override
public String toString() {
    return "Kupac" + super.toString();
}




 






}