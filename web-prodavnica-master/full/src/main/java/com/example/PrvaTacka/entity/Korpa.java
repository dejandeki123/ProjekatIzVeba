package com.example.PrvaTacka.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.*;

@Entity
public class Korpa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date datum_kupovine;

    // @Column
    // private Time vreme_kupovine;

    @Column
    private Status status;

    @ManyToOne
    private Dostavljac dostavljac;

    @OneToOne(mappedBy = "korpaKupac", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Kupac kupac;

    @OneToMany(mappedBy = "korpaArtikli",cascade = CascadeType.ALL)
    private Set<Artikal> artikli = new HashSet<>();

    public Dostavljac getDostavljac() {
        return dostavljac;
    }

    public void setDostavljac(Dostavljac dostavljac) {
        this.dostavljac = dostavljac;
    }

    public Set<Artikal> getArtikli() {
        return artikli;
    }

    public void setArtikli(Set<Artikal> artikli) {
        this.artikli = artikli;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatum_kupovine() {
        return datum_kupovine;
    }

    public void setDatum_kupovine(Date datum_kupovine) {
        this.datum_kupovine = datum_kupovine;
    }

    //public Time getVreme_kupovine() {
    //    return vreme_kupovine;
    //}

    //public void setVreme_kupovine(Time vreme_kupovine) {
    //    this.vreme_kupovine = vreme_kupovine;
    //}

    public Kupac getKupac() {
        return kupac;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Korpa { " +
                "id = " + id +
                ", datum kupovine = '" + datum_kupovine + '\'' +
                ", kupac = " + kupac +
                ", dostavljac = " + dostavljac +
                ", status = '" + status + '\'' +
                '}';
    }
}