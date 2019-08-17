package com.example.PrvaTacka.service.impl;

import com.example.PrvaTacka.entity.Korisnik;
import com.example.PrvaTacka.repository.KorisnikRepository;
import com.example.PrvaTacka.service.KorisnikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KorisnikServiceImpl implements KorisnikService {

    @Autowired
    private KorisnikRepository korisnikRepository;

    @Override
    public Korisnik create(Korisnik korisnik) throws Exception {
        if(korisnik.getId() != null) {
            throw new Exception("ID must be null!");
        }

        if(korisnik.getKorisnicko() != null) {
            throw new Exception("Korisnicko ime vec postoji!");
        }
        return this.korisnikRepository.save(korisnik);
    }

    @Override
    public List<Korisnik> findAll() {
        return this.korisnikRepository.findAll();
    }

    @Override
    public Korisnik findOne(Long id) {
        return this.korisnikRepository.getOne(id);
    }

    public Korisnik login(String email, String lozinka){
        return  this.korisnikRepository.findByEmailAndLozinka(email, lozinka);

    }

    @Override
    public void change(Long id){
        Korisnik korisnik = korisnikRepository.getOne(id);

        if (korisnik.getUloga().equals("Dostavljac")){
            korisnik.setUloga("Kupac");
        } else {
            korisnik.setUloga("Dostavljac");
        }

        korisnikRepository.save(korisnik);
    }

    @Override
    public void delete(long id) {
        korisnikRepository.deleteById(id);
    }
}
