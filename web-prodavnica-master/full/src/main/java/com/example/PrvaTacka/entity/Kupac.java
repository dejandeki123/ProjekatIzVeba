package com.example.PrvaTacka.entity;


import org.hibernate.mapping.Join;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@DiscriminatorValue("kupac")
public class Kupac extends Korisnik {

    @ManyToMany
    @JoinTable(name = "prethodni",
            joinColumns = @JoinColumn(name = "kupac_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "artikal_id",referencedColumnName = "id"))
    private Set<Artikal> prethodno_kupljeni = new HashSet<>();  //korpa

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "korpa_id")
    private Korpa korpaKupac;

    @ManyToMany
    @JoinTable(name = "omiljeni",
            joinColumns = @JoinColumn(name = "kupac_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "artikal_id",referencedColumnName = "id"))
    private Set<Artikal> omiljeni_artikli = new HashSet<>();

    public Set<Artikal> getPrethodno_kupljeni() {
        return prethodno_kupljeni;
    }

    public void setPrethodno_kupljeni(Set<Artikal> prethodno_kupljeni) {
        this.prethodno_kupljeni = prethodno_kupljeni;
    }

    public Korpa getKorpaKupac() {
        return korpaKupac;
    }

    public void setKorpaKupac(Korpa korpaKupac) {
        this.korpaKupac = korpaKupac;
    }

    public Set<Artikal> getOmiljeni_artikli() {
        return omiljeni_artikli;
    }

    public void setOmiljeni_artikli(Set<Artikal> omiljeni_artikli) {
        this.omiljeni_artikli = omiljeni_artikli;
    }
}