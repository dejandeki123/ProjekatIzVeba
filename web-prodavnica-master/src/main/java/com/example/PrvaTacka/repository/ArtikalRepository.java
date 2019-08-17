package com.example.PrvaTacka.repository;

import java.util.List;
import java.util.Set;

import com.example.PrvaTacka.entity.Artikal;
import com.example.PrvaTacka.entity.Korpa;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ArtikalRepository extends JpaRepository<Artikal,Long> {
    List<Artikal> findByKategorija(String kategorija); //pronalazenje svih artikala po odredjenoj kategoriji
    
    List<Artikal> findByNazivOrOpisOrCenaOrKolicinaOrKategorija(String naziv,String opis,Long cena,Integer kolicina,String kategorija);//kada hocemo da pronadjemo artikle po bilo kom kriterijumu

    List<Artikal>  findByNaziv(String naziv);
    
    List<Artikal> findAllByOrderByNaziv(); //pronadji sve artikle sortirane po nazivu

    List<Artikal> findAllByOrderByCenaAsc(); //izlistaj sve proizvode po ceni rastuce,tj od najjeftinijeg do najskupljeg

    List<Artikal> findByKorpaArtikli(Set<Korpa> korpaArtikli); ///izlistaj sve proizvode ubacene u korpu
    
}