package com.example.PrvaTacka.entity;



import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Artikal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String naziv;

    @Column
    private String opis;

    @Column
    private Long cena;

    @Column
    private Integer kolicina;

    @Column
    private String kategorija;

    @ManyToMany
    private Set<Kupac> prethodni_kupci = new HashSet<>();

    @ManyToMany
    private Set<Kupac> omiljeni_kupci = new HashSet<>();

    @ManyToOne
    private Korpa korpaArtikli;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getCena() {
        return cena;
    }

    public void setCena(Long cena) {
        this.cena = cena;
    }

    public Integer getKolicina() {
        return kolicina;
    }

    public void setKolicina(Integer kolicina) {
        this.kolicina = kolicina;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public Set<Kupac> getPrethodni_kupci() {
        return prethodni_kupci;
    }

    public void setPrethodni_kupci(Set<Kupac> prethodni_kupci) {
        this.prethodni_kupci = prethodni_kupci;
    }

    public Set<Kupac> getOmiljeni_kupci() {
        return omiljeni_kupci;
    }

    public void setOmiljeni_kupci(Set<Kupac> omiljeni_kupci) {
        this.omiljeni_kupci = omiljeni_kupci;
    }

    @Override
    public String toString() {
        return "Artikl { " +
                "id = " + id +
                ", naziv = '" + naziv + '\'' +
                ", opis = '" + opis + '\'' +
                ", cena = " + cena +
                ", kolicina = " + kolicina +
                ", kategorija = '" + kategorija + '\'' +
                '}';
    }
}

