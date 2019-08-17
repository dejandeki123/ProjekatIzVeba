package com.example.PrvaTacka.service;


import com.example.PrvaTacka.entity.Korisnik;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KorisnikService {

    Korisnik login(String email, String lozinka);
    //  List<Korisnik> findByUloga(String uloga);

    Korisnik create(Korisnik korisnik) throws Exception;

    List<Korisnik> findAll();

    Korisnik findOne(Long id);

    public void change(Long id);

    void delete(long id);

}
