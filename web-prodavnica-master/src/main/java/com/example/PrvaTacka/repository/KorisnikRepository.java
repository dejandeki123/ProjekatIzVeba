package com.example.PrvaTacka.repository;

import com.example.PrvaTacka.entity.Korisnik;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KorisnikRepository extends JpaRepository<Korisnik, Long> {
    
    Korisnik findByKorisnickoImeAndLozinka(String korisnickoIme,String lozinka);
    //pronadji korisnika sa korisnickim imenom i lozinkom

    Korisnik findOneByKorisnickoIme(String korisnickoIme);
    //pronadji korisnika sa korisnickim imenom
}