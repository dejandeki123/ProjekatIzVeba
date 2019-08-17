package com.example.PrvaTacka.repository;

import com.example.PrvaTacka.entity.Dostavljac;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DostavljacRepository extends JpaRepository<Dostavljac,Long> {
    Dostavljac findOneByKorisnicko(String korisnickoIme); //pronadji tog i tog dostavljaca sa korisnickim imenom

}
