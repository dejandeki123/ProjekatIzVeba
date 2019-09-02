package com.example.PrvaTacka.entity;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Korpa {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column
    private LocalDate datum;

    @Enumerated(EnumType.STRING)
    @Column
    private StatusIsporuke status;

    @Column
    private Integer dostavljac_id;

    @Column
    private Integer kupac_id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "cart_id")
    private List<Artikal> kupljeniArtikli= new ArrayList<>();

    public Korpa() {
    }

    public Korpa(LocalDate datum, StatusIsporuke status, Integer dostavljac_id, Integer kupac_id) {
        this.datum = datum;
        this.status = status;
        this.dostavljac_id = dostavljac_id;
        this.kupac_id = kupac_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public StatusIsporuke getStatus() {
        return status;
    }

    public void setStatus(StatusIsporuke status) {
        this.status = status;
    }

    public Integer getDostavljac_id() {
        return dostavljac_id;
    }

    public void setDostavljac_id(Integer dostavljac_id) {
        this.dostavljac_id = dostavljac_id;
    }

    public Integer getKupac_id() {
        return kupac_id;
    }

    public void setKupac_id(Integer kupac_id) {
        this.kupac_id = kupac_id;
    }

    public List<Artikal> getKupljeno() {
        return kupljeniArtikli;
    }

    public void setKupljeno(List<Artikal> kupljeno) {
        this.kupljeniArtikli = kupljeno;
    }

    @Override
    public String toString() {
        return "Korpa{" +
                "id=" + id +
                ", datum=" + datum +
                ", status=" + status +
                ", dostavljac_id=" + dostavljac_id +
                ", kupac_id=" + kupac_id +
                ", kupljeno=" + kupljeniArtikli +
                '}';
    }
}
