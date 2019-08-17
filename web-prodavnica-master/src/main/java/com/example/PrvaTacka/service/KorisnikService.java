package com.example.PrvaTacka.service;

import java.util.List;

import com.example.PrvaTacka.entity.Korisnik;

import org.springframework.stereotype.Service;

@Service
public interface KorisnikService {

    //funkcija za prijavu ima exception zato sto postoji mogucnost neuspesne prijave
    Korisnik login(String korisnickoIme,String lozinka) throws Exception;

    //kreiraj novog korisnika i prijavi ako postoji greska
    Korisnik create(Korisnik korisnik) throws Exception;

    //izlistaj sve korisnike
    List<Korisnik> findAll();

    //pronadji korisnika po njegovom id-ju
    Korisnik findOne(Long id);

    //izmeni korisnika po id-ju
    void change(Long id);

    //izbrisi korisnika sa zadatim id-jem
    void delete(Long id);

    //sacuvaj novokreiranog korisnika
    Korisnik save(Korisnik korisnik);

}