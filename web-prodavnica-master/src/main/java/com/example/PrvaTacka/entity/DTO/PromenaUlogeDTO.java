package com.example.PrvaTacka.entity.DTO;

import com.example.PrvaTacka.entity.Uloga;

public class PromenaUlogeDTO {
    public Uloga uloga;

    public Uloga getUloga() {
        return uloga;
    }

    public void setUloga(Uloga uloga) {
        this.uloga = uloga;
    }

    public PromenaUlogeDTO(Uloga uloga) {
        this.uloga = uloga;
    }

    public PromenaUlogeDTO() {
    }
}