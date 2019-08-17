package com.example.PrvaTacka.entity.DTO;

public class ArtikalDTO{ //klasa koja sluzi za kreiranje objekta artikal
    private Long id; 
    private String naziv;
    private String opis;
    private Long cena;
    private Integer kolicina;
    private String kategorija;

    public ArtikalDTO(String naziv,String opis,Long cena,Integer kolicina,String kategorija) {
        this.naziv=naziv;
        this.opis=opis;
        this.cena=cena;
        this.kolicina=kolicina;
        this.kategorija=kategorija;
    } //konstruktor sa parametrima bez id-ja

    public ArtikalDTO(Long id,String naziv,String opis,Long cena,Integer kolicina,String kategorija) {
        this.id=id;
        this.naziv=naziv;
        this.opis=opis;
        this.cena=cena;
        this.kolicina=kolicina;
        this.kategorija=kategorija;
    } //konstruktor sa parametrima sa id-jem

    public ArtikalDTO() {
        //konstruktor bez parametara
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv=naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis=opis;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija=kategorija;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public Long getCena() {
        return cena;
    }

    public void setCena(Long cena) {
        this.cena=cena;
    }

    public Integer getKolicina() {
        return kolicina;
    }

    public void setKolicina(Integer kolicina) {
        this.kolicina=kolicina;
    }

    


    
}