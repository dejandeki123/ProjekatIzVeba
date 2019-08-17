package com.example.PrvaTacka.service;

import java.util.List;
import java.util.Set;

import com.example.PrvaTacka.entity.Artikal;
import com.example.PrvaTacka.entity.Korpa;
import com.example.PrvaTacka.entity.Kupac;

public interface KorpaService {

    //pronadji korpu sa proizvodima za datog kupca
    Korpa findByKupac(Kupac kupac);

    /// ???
    Set<Korpa> findOne(Long id,Artikal artikal);
    
    // ???
    Set<Kupac> omiljeni(Long id,Artikal artikal);

    //obrisi artikle u zadatoj korpi
    void obrisiArtikle(Korpa korpa);

    //pronadji sve korpe koje postoje
    List<Korpa> findAll();

    //pronadji korpu korisnika sa datim id-jem
    Korpa findById(Long id);

    // ??? vrati sve kupce koji su kupovali dati artikal
    Set<Kupac> prethodni(Long id,Artikal artikal);

}