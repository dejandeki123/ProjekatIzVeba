package com.example.PrvaTacka.entity.DTO;

public class ArtikalKategorijaDTO {
    private String kategorija;

    public ArtikalKategorijaDTO(String kategorija) {
        this.kategorija=kategorija;
    }//konstruktor sa parametrima

    public ArtikalKategorijaDTO() {
        //prazan konstruktor
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija=kategorija;
    } 
    
    


}