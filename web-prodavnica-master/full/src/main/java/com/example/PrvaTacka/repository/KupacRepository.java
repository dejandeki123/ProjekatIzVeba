package com.example.PrvaTacka.repository;

import com.example.PrvaTacka.entity.Kupac;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KupacRepository extends JpaRepository<Kupac, Long> {

    //Kupac findByKorisnickoAndLozinka (String username, String password);

}
