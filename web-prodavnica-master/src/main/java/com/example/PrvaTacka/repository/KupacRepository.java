package com.example.PrvaTacka.repository;

import java.util.Set;

import com.example.PrvaTacka.entity.Artikal;
import com.example.PrvaTacka.entity.Kupac;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KupacRepository extends JpaRepository<Kupac,Long> {
    Kupac findOneByKorisnickoIme(String korisnickoIme);
    //pronadji kupca sa zadatim korisnickim imenom

    Set<Kupac> findByOmiljeni(Set<Artikal> omiljeni);
    ///pronadji sve kupce koji imaju date omiljene artikle

    Set<Kupac> findByPrethodni(Set<Artikal> prethodni);
    //pronadji sve kupce na osnovu njihove prethodne kupovine
}