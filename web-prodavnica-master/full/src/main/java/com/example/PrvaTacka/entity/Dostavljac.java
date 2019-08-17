package com.example.PrvaTacka.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@DiscriminatorValue("dostavljac")
public class Dostavljac extends Korisnik {

    @OneToMany(mappedBy = "dostavljac", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Korpa> porudzbine = new HashSet<>();

    public Set<Korpa> getPorudzbine() {
        return porudzbine;
    }

    public void setPorudzbine(Set<Korpa> porudzbine) {
        this.porudzbine = porudzbine;
    }
}