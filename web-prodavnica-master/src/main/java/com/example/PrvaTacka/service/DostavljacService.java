package com.example.PrvaTacka.service;

import java.util.List;

import com.example.PrvaTacka.entity.Dostavljac;


public interface DostavljacService {

    //pronadji sve dostavljace
    List<Dostavljac> findAll();

    //kreiraj novog dostavljaca od datog korisnika
    Dostavljac create(Dostavljac dostavljac);
    
    //pronadji dostavljaca sa datim id-jem
    Dostavljac findOne(Long id);

    //izmeni neke stvari kod datog dostavljaca
    Dostavljac update(Dostavljac dostavljac);
}
