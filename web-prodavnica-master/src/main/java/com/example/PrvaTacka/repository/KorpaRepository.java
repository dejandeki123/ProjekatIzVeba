package com.example.PrvaTacka.repository;

import java.util.Set;

import com.example.PrvaTacka.entity.Artikal;
import com.example.PrvaTacka.entity.Korpa;
import com.example.PrvaTacka.entity.Kupac;

import org.springframework.data.jpa.repository.JpaRepository;
public interface KorpaRepository extends JpaRepository<Korpa,Long> {
   Set<Korpa> findByKupacAndStatus(Kupac kupac);
//pronadji kupce i statuse njihovih porudzbina  
   Set<Korpa> findByArtikli(Set<Artikal> artikli);
// pronadji sve korpe sa zadatim artiklima
   Korpa findByKupac(Kupac kupac);
   //pronadji korpu zadatog kupca
}

