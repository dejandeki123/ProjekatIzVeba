package com.example.PrvaTacka.entity.DTO;

import com.example.PrvaTacka.entity.Status;

public class ArtikalKupacDTO {
    private Long idArtikla; 
    private Long idKupca; 
    private Status status;

    public Long getIdArtikla() {
        return idArtikla;
    }

    public void setIdArtikla(Long idArtikla)  {
        this.idArtikla=idArtikla;
    }

    public Long getIdKupca() {
        return idKupca;
    }

    public void setIdKupca(Long idKupca) {
        this.idKupca=idKupca;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status=status;
    }

    public ArtikalKupacDTO(Long idArtikla,Long idKupca,Status status) {
        this.idArtikla=idArtikla;
        this.idKupca=idKupca;
        this.status=status;
    }

    public ArtikalKupacDTO() {

    }

}