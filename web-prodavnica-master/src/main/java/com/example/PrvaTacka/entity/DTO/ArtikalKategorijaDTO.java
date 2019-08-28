package com.example.PrvaTacka.entity.DTO;

public class ArtikalKategorijaDTO {
    private String kategorija;

    public ArtikalKategorijaDTO(String kategorija) {
        this.kategorija=kategorija;
    }

    public ArtikalKategorijaDTO() {
        
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija=kategorija;
    } 
    
    


}