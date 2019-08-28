package com.example.PrvaTacka.service;

import java.util.List;
import java.util.Set;

import com.example.PrvaTacka.entity.Artikal;
import com.example.PrvaTacka.entity.Korpa;

public interface ArtikalService {

     Artikal kreirajArtikal(Artikal artikal) throws Exception;
     
     List<Artikal> findAll();

     Artikal unaprediArtikal(Artikal artikal) throws Exception;

     List<Artikal> sortByNaziv();

     List<Artikal> sortByCenaAsc();

     List<Artikal> sortByCenaDesc();

     void izbrisiArtikal(Long id);

     List<Artikal> findByKategorija(String kategorija);

     List<Artikal> izlistajArtiklePoKriterijumu(String naziv,String opis,Long cena,Integer kolicina,String kategorija);

     List<Artikal> izlistajPoNazivu(String naziv);
 
     Set<Artikal> findByKorpa(Set<Korpa> korpe);

     Artikal findOne(Long id);

     List<Artikal> omiljeni(List<Artikal> listaArtikala);


}