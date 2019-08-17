package com.example.PrvaTacka.service;

import java.util.List;
import java.util.Set;

import com.example.PrvaTacka.entity.Artikal;
import com.example.PrvaTacka.entity.Korpa;


public interface ArtikalService {

    //metoda koja sluzi da kreiramo novi artikal,i vraca povratnu informaciju ako je doslo do greske
    Artikal create(Artikal artikal) throws Exception;

    List<Artikal> findAll(); //pronadji sve artikle u prodavnici

    //izmeni neki artikal
    Artikal update(Artikal artikal) throws Exception;
    
    //izbrisi artikal po id-ju
    void delete(Long id);

    //pronadji sve artikle sa zadatom kategorijom
    List<Artikal> findByKategorija(String kategorija);
    
    //izlistaj listu artikala sa zadatim parametrima
    List<Artikal> filter(String naziv,String opis,Long cena,Integer kolicina,String kategorija);

    //pronadji sve artikle po nazivu
    List<Artikal> f(String naziv);

    //pronadji artikal po id-ju
    Artikal findOne(Long id);

    //sortiraj po nazivu artikle
    List<Artikal> sortByNaziv();

    //sortiraj od jeftinijeg ka skupljem
    List<Artikal> sortByCenaAsc();

    //sortiraj od najskupljeg ka jefitinijem
    List<Artikal> sortByCenaDesc();

    //izlistaj omiljene artikle medju datim
    List<Artikal> omiljeni(List<Artikal> artikli);

    //izlistaj sve artikle koji se nalaze u prosledjenim korpama
    Set<Artikal> findByKorpa(Set<Korpa> korpe);
}