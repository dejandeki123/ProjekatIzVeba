package com.example.PrvaTacka.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.PrvaTacka.dto.*;
import com.example.PrvaTacka.entity.StatusIsporuke;

public class KorpaDTO {

    private Integer id;

    private LocalDate datum;

    private StatusIsporuke status;

    private String dostavljacIdentifikacija;

    private List<ArtikalDTO> artikli = new ArrayList<>();

    private List<Integer> kolicina = new ArrayList<>();

    public KorpaDTO() {
    }

    public KorpaDTO(Integer id, LocalDate datum, StatusIsporuke status, String dostavljacIdentifikacija) {
        this.id = id;
        this.datum = datum;
        this.status = status;
        this.dostavljacIdentifikacija = dostavljacIdentifikacija;
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

    public String getDostavljacIdentifikacija() {
        return dostavljacIdentifikacija;
    }

    public void setDostavljacIdentifikacija(String dostavljacIdentifikacija) {
        this.dostavljacIdentifikacija = dostavljacIdentifikacija;
    }

    public List<ArtikalDTO> getArtikli() {
        return artikli;
    }

    public void setArtikli(List<ArtikalDTO> artikli) {
        this.artikli = artikli;
    }

    public List<Integer> getKolicina() {
        return kolicina;
    }

    public void setKolicina(List<Integer> kolicina) {
        this.kolicina = kolicina;
    }
}
