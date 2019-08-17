package com.example.PrvaTacka.service;

import com.example.PrvaTacka.entity.Kupac;

public interface KupacService {
    //kreiraj novog kupca od datog korisnika
    Kupac create(Kupac kupac) throws Exception;

    //pronadji kupca sa zadatim korisnickim imenom
    Kupac findByKorisnickoIme(String korisnickoIme);

    //pronadji kupca sa zadatim id-jem
    Kupac findOneById(Long id);
    
}