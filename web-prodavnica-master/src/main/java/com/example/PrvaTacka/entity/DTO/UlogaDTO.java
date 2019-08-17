package com.example.PrvaTacka.entity.DTO;

import com.example.PrvaTacka.entity.Uloga;

public class UlogaDTO{
    private Uloga uloga;

    public UlogaDTO() {

    }

    public UlogaDTO(Uloga uloga) {
        this.uloga=uloga;
    }

    public Uloga getUloga() {
        return uloga;
    }

    public void setUloga(Uloga uloga) {
        this.uloga=uloga;
    }

}