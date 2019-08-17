package com.example.PrvaTacka.repository;

import com.example.PrvaTacka.entity.Korisnik;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KorisnikRepository extends JpaRepository<Korisnik, Long> {

    Korisnik findByEmailAndLozinka(String email, String lozinka);

   // Korisnik findOneByEmail(String email);

}
